package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.math.log

const val EXTRA_MESSAGE = "EXTRA_MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.registration).setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }

        findViewById<Button>(R.id.button_two).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        this.intent = intent
    }

    override fun onResume() {
        super.onResume()
        val s1 = intent.getStringExtra("EXTRA_KEY_NAME")
        val s2 = intent.getStringExtra("EXTRA_KEY_CITY")
        val s3 = intent.getStringExtra("EXTRA_KEY_AGE")
        val s4 = intent.getStringExtra("EXTRA_KEY_COLOR")

        if (s1 == null) {
            Toast.makeText(this, "$s3 $s4 ", Toast.LENGTH_LONG).show()
        } else Toast.makeText(this, "$s1 $s2 ", Toast.LENGTH_LONG).show()


    }

}