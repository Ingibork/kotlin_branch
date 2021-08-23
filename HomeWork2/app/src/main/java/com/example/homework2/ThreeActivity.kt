package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        findViewById<Button>(R.id.back_main).setOnClickListener {
            val citys= findViewById<EditText>(R.id.city).text.toString()
            val inputFromTwoActivity = citys
            val inputFromThreeActivity = intent.getStringExtra("EXTRA_KEY")



            startActivity(Intent(this, MainActivity::class.java).apply {
                putExtra("EXTRA_KEY_NAME", inputFromTwoActivity)
                putExtra("EXTRA_KEY_CITY", inputFromThreeActivity)
            })
        }
    }
}