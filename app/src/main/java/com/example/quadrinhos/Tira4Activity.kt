package com.example.quadrinhos

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tira4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tira4)
        val iv: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textViewSubtitle)
        iv.setImageResource(R.drawable.tira4)
        textView.text = "Tirinha 4"

        val buttonPrevious: Button = findViewById<Button>(R.id.buttonPrevious)
        buttonPrevious.setOnClickListener {
            finish()
        }
    }
}