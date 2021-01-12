package com.codelab.codelab1application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1: TextView = findViewById(R.id.textView)

        val button1: Button = findViewById(R.id.button)
        button1.setOnClickListener {
            val dice=Dice()
            val a:Int= dice.sides
            val b: IntRange =1..a
            val c:Int=b.random()
            text1.text=c.toString()
            val toast = Toast.makeText(this, "DiceRolled", Toast.LENGTH_SHORT).show()
        }

    }

    class Dice{
        val sides=6

    }

}
