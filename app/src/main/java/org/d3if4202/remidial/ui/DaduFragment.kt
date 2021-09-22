package org.d3if4202.remidial.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import org.d3if4202.remidial.R
import org.d3if4202.remidial.databinding.FragmentDaduBinding
import java.util.*

class DaduFragment:Fragment() {
    lateinit var diceImage:ImageView
    private lateinit var dadubinding: FragmentDaduBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle?): View? {
        dadubinding = FragmentDaduBinding.inflate(
            layoutInflater, container, false)
        dadubinding.btnKocok.setOnClickListener { kocokDadu() }
        return dadubinding.root
    }
private fun kocokDadu(){
    val randomInt=Random().nextInt(6)+1
    val drawableResource=when(randomInt){
        1-> R.drawable.dice1
        2-> R.drawable.dice2
        3-> R.drawable.dice3
        4-> R.drawable.dice4
        5-> R.drawable.dice5
        else -> R.drawable.dice6
    }
    diceImage.setImageResource(drawableResource)
}
}
