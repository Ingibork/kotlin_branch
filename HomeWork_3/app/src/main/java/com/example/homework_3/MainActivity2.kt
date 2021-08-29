package com.example.homework_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.homework_3.databinding.ActivityMain2Binding
import java.util.*
import java.util.stream.IntStream
import android.R.array


class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass2.root)
        val message = intent.getIntegerArrayListExtra("key")!!
        bindingClass2.tv2.text = message.toString()

    }

    fun onClickAver(view: View) {
        val message = intent.getIntegerArrayListExtra("key")!!
        val aver = message.average()
        Log.e("myTag", aver.toString())
        intent.putExtra("key2", aver)
        setResult(RESULT_OK, intent)
        finish()
    }

    fun onClickSum(view: View) {
        val message = intent.getIntegerArrayListExtra("key")!!
        val sum = message.sum()
        Log.e("myTag", sum.toString())
        intent.putExtra("key3", sum)
        setResult(RESULT_CANCELED, intent)
        finish()
    }

    fun ondDivision (view: View) {
        val message = intent.getIntegerArrayListExtra("key")!!
        val size = message.size
        var s = size/2
        val mes = message.toArray()
        val myArray = IntArray(size)

        val m1 = Arrays.copyOfRange(mes, 0, mes.size / 2)
        val m2 = Arrays.copyOfRange(mes, mes.size / 2, mes.size)

        var sum = 0


        for (i in 0 until m1.size) {
            m1[i] = mes[i]
            Log.e("myTag", m1[i].toString())
        }
        Log.e("myTag", Arrays.toString(m1))

        for (i in 0 until m2.size) {
            m2[i] = mes[s]
            s++
            Log.e("myTag", m2[i].toString())
        }
        

        intent.putExtra("key4", m1)
        setResult(RESULT_FIRST_USER, intent)
        finish()
    }
}