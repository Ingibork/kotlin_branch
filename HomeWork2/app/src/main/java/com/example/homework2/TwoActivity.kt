package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TwoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        findViewById<Button>(R.id.next).setOnClickListener {

            val mEditText= findViewById<EditText>(R.id.personName)
            val med = mEditText.text.toString()

            Intent(
                this, ThreeActivity::class.java
            ).apply {
                putExtra("EXTRA_KEY", med)
            }.let {
                startActivity(it)
            }

        }
    }
}