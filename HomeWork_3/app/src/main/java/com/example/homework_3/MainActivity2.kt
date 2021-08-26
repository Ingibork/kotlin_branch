package com.example.homework_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.homework_3.databinding.ActivityMain2Binding
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass2.root)

        val message = intent.getIntegerArrayListExtra("key")!!


        bindingClass2.b2.setOnClickListener {
            val aver = message.average()
            Log.e("myTag", aver.toString())
            intent.putExtra("key2", aver)
            setResult(RESULT_OK, intent)
            finish()
        }

        bindingClass2.bSum.setOnClickListener {
            val sum = message.sum()
            val iSum = Intent(this, MainActivity::class.java)
            startActivityForResult(iSum, 101)
            iSum.putExtra("key3", sum)
            setResult(RESULT_OK, iSum)
            finish()
        }
    }
}