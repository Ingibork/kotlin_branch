package com.example.homework_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.homework_3.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            Log.e("myTag", data.toString())
            bindingClass.tv1.text = data.getDoubleExtra("key2", 1.0).toString()
        }
        if (requestCode == 100 && resultCode == RESULT_CANCELED && data != null) {
            Log.e("myTag", data.toString())
            bindingClass.tv1.text = data.getIntExtra("key3", 1).toString()
        }
        if (requestCode == 100 && resultCode == RESULT_FIRST_USER && data != null) {
            Log.e("myTag", data.toString())
            bindingClass.tv1.text = data.getIntExtra("key4", 1).toString()
        }
    }

    fun onClickStartAct2(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        var rnd = 1
        val s = arrayListOf<Int>()
        var i = 1
        var count = 1
        while (i%2 != 0 && i!=0) {
            i = Random.nextInt(3..10)
        }
        while (count <= i) {
            while (rnd % 2 != 0) {
                rnd = Random.nextInt(10000)
            }
            s.add(rnd)
            count++
            rnd = Random.nextInt(10000)
        }
        Log.e("myTag", s.toString())
        intent.putIntegerArrayListExtra("key", s)
        startActivityForResult(intent, 100)
    }
}