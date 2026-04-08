package com.example.multiplicationtable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.multiplyapp.R
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Created variables for the buttons and the input
        val multiplybtn = findViewById<Button>(R.id.multiplybtn)
        val numInput = findViewById<EditText>(R.id.numInput)
        // Created an on click listener for multiply button
        multiplybtn.setOnClickListener {
            // Create an intent to go to the multiply activity
            val intent = Intent(this, MainActivity2::class.java)
            //added the table number to the intent
            intent.putExtra("tableNumber", numInput.text.toString())
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}