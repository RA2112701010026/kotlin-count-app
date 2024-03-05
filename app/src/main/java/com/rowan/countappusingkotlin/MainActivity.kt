package com.rowan.countappusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countbutton=findViewById<Button>(R.id.button1)
        val resetbutton=findViewById<Button>(R.id.resetB)
        val mytextview=findViewById<TextView>(R.id.textView2)
        var timesclick= 0
        countbutton.setOnClickListener {
            timesclick= timesclick+1
            mytextview.text= timesclick.toString()
            Toast.makeText(this, "count has been added", Toast.LENGTH_SHORT).show()
        }
       resetbutton.setOnClickListener {
           timesclick=0
           mytextview.text=timesclick.toString()
           Toast.makeText(this, "your count has reseted", Toast.LENGTH_SHORT).show()
       }


    }
}