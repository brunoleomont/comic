package com.example.quadrinhos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tira2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tira2)
        val iv: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textViewSubtitle)
        iv.setImageResource(R.drawable.tira2)
        textView.text = "Tirinha 2"

        val buttonPrevious: Button = findViewById<Button>(R.id.buttonPrevious)
        buttonPrevious.setOnClickListener {
            finish()
        }

        val buttonNext: Button = findViewById<Button>(R.id.buttonNext)
        buttonNext.setOnClickListener {
            val intent = Intent(this, Tira3Activity::class.java)
            startActivity(intent)
        }
    }
}