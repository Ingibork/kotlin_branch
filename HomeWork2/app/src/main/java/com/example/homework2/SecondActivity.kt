package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.back_main_two).setOnClickListener {
            val a = findViewById<EditText>(R.id.edit1).text.toString()
            val b = findViewById<EditText>(R.id.edit2).text.toString()

            startActivity(Intent(this, MainActivity::class.java).apply {
                putExtra("EXTRA_KEY_AGE", a)
                putExtra("EXTRA_KEY_COLOR", b)
            })

        }
    }
}