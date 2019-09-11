package com.smartherd.shareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
       pressbutton.setOnClickListener {
           Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()

       }

    }
}



