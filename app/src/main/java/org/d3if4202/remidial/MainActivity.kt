package org.d3if4202.remidial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val hewan = listOf("Ayam","Bebek","Domba","Kambing","Sapi")
    private var index=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton:Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener{showNext()}
    }

    private fun showNext(){
        index = if(index==hewan.size-1)0 else index+1
        val textView:TextView=findViewById(R.id.nameTextView)
        textView.text=hewan[index]
    }
}