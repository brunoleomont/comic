package com.example.quadrinhos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext: Button = findViewById<Button>(R.id.buttonNext)
        buttonNext.setOnClickListener {
            val intent = Intent(this, Tira2Activity::class.java)
            startActivity(intent)
        }
    }
}