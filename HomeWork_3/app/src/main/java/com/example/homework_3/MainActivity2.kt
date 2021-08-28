package com.example.homework_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.homework_3.databinding.ActivityMain2Binding
import java.util.*

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
        val mes = message.toArray()
        val myArray = IntArray(size)
        val myArray1 = Arrays.copyOfRange(mes, 0, mes.size / 2)
        val myArray2 = Arrays.copyOfRange(mes, mes.size / 2, mes.size)
        Log.e("myTag", myArray1.toString())
        Log.e("myTag", myArray2.toString())
        val list = arrayListOf<Int>()



        Log.e("myTag", message.toString())
        intent.putExtra("key4", message)
        setResult(RESULT_FIRST_USER, intent)
        finish()
        // val firstHalf: IntArray = Arrays.copyOfRange(original, 0, original.size / 2)
    }


}