package org.d3if4202.remidial.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import org.d3if4202.remidial.R
import org.d3if4202.remidial.databinding.FragmentKoinBinding
import java.util.*

class KoinFragment: Fragment() {
    lateinit var coinImage: ImageView
    lateinit var coinText:TextView
    private lateinit var koinbinding: FragmentKoinBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        koinbinding = FragmentKoinBinding.inflate(
            layoutInflater, container, false)
        koinbinding.btnLempar.setOnClickListener { lemparKoin() }
        return koinbinding.root
    }
    private fun lemparKoin(){
        val randomInt= Random().nextInt(6)+1
        val drawableResource=when(randomInt){
            1-> R.drawable.kepala
            else-> R.drawable.ekor
        }
        coinImage.setImageResource(drawableResource)
        coinText.setText(drawableResource)
    }
}