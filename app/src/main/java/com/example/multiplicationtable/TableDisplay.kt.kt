package com.example.multiplicationtable

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.multiplyapp.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_table)
        // assigning data from intent to a variable
        val bundle: Bundle? = intent.extras
        // getting the table number from the intent
        val tableString: String? = bundle!!.getString("tableNumber")
        // converting the table number to an integer
        val tableNumber = tableString!!.toInt()
        val Table = findViewById<TextView>(R.id.Table)
        var timesDisplay: String ="$tableNumber x table\n\n"
        // creating counter for while loop
        var counter = 1
        // setting the text of the table to the table number times 1 to 10
        Table.text = timesDisplay
        // while loop to display the table
        while (counter <= 20) {
            // skip 3
            if (counter == 3) {
                counter++
                continue
            }
            val answer = tableNumber * counter
            /* display as:
            5x1=5
            5x2=10
            5x3=15
            5x4=20
            5x5=25
            5x6=30
            5x7=35
            5x8=40
            5x9=45
            5x10=50
            5x11=55
            5x12=60
            5x13=65
            5x14=70
            5x15=75
            5x16=80
            5x17=85
            5x18=90
            5x19=95
            5x20=100
            */
            timesDisplay += "$tableNumber x $counter = $answer\n"
            // increasing counter
            counter++

        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets}}}