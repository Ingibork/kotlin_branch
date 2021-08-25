package com.example.homework_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_3.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        jojo()
    }

    fun jojo() {
        val intent = Intent(this, MainActivity2::class.java)
        var rnd = Random.nextInt(10000)
        var rnd2 = Random.nextInt(10000)

        bindingClass.b1.setOnClickListener {

            if (rnd % 2 == 0 && rnd2 % 2 == 0) {
                intent.putExtra("key", rnd)
                intent.putExtra("key2", rnd2)
                startActivity(intent)
            } else {
                rnd = Random.nextInt(10000)
                rnd2 = Random.nextInt(10000)
            }
        }
    }
}