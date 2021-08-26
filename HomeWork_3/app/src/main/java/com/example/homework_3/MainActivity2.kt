package com.example.homework_3

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


        var message = intent.getIntegerArrayListExtra("key")!!
        val aver = message.average()
        Log.e("myTag", aver.toString())

        bindingClass2.b2.setOnClickListener {
            intent.putExtra("key2", aver)
            setResult(RESULT_OK, intent, )
            finish()


        // val message2 = intent.getIntExtra("key2", 1)

        // bindingClass2.tv2.text = message.toString()
        // bindingClass2.tv3.text = message2.toString()
    }

    fun onClickMain(view: View)  {


            // intent.putExtra("key", )
        }

    }

}