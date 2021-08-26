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
            bindingClass.tv1.text = data.getIntExtra("key2", 1).toString()
        }
    }

    fun jojo() {
        val intent = Intent(this, MainActivity2::class.java)
        bindingClass.b1.setOnClickListener {
            var rnd =1
            /**
            var rnd2 =1
            while (rnd2%2 !=0) {
            rnd2 = Random.nextInt(10000)
            }
            intent.putExtra("key", rnd)
            intent.putExtra("key2", rnd2)
            startActivityForResult(intent, 100)
             */
            val s = arrayListOf<Int>()
          //  var s = ar.toHashSet()
          //  val result = mutableListOf<Int>()


            var i = 0
            while (i < 5) {
            while (rnd%2 !=0) {
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
    /**
    val rnd2 = Random.nextInt(10000)

    while (index < fruitArray.size){
    Log.d("MyLog","Fruit: ${fruitArray[index]}")
    index++
    }
    if (rnd % 2 == 0 && rnd2 % 2 == 0) {
    intent.putExtra("key", rnd)
    intent.putExtra("key2", rnd2)
    startActivityForResult(intent, 100)
    } else {
    jojo()
    }
     */
}