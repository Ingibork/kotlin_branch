package com.example.homework_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            Log.e("myTag", data.toString())
            bindingClass.tv1.text = data.getDoubleExtra("key2", 1.0).toString()
        }
        Log.e("myTag", data.toString())
        val message2 = intent.getIntExtra("key3", 1)
        bindingClass.tv1.text = message2.toString()
        //val message = intent.getIntegerArrayListExtra("key")!!
    }

    fun jojo() {
        val intent = Intent(this, MainActivity2::class.java)
        bindingClass.b1.setOnClickListener {
            var rnd = 1
            val s = arrayListOf<Int>()
            var i = 0
            while (i < 5) {
                while (rnd % 2 != 0) {
                    rnd = Random.nextInt(10000)
                }
                s.add(rnd)
                i++
                rnd = Random.nextInt(10000)
            }
            Log.e("myTag", s.toString())
            intent.putIntegerArrayListExtra("key", s)
            startActivityForResult(intent, 100)
        }
    }
}