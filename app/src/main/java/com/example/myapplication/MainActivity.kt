package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btnClickMe = findViewById<Button>(R.id.btn_click_me)
        val textView = findViewById<TextView>(R.id.text_view)
        var timesClicked = 0
        // set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked += 1
            //or   timesClicked = timesClicked+1
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            textView.text = timesClicked.toString()
        }
    }
}