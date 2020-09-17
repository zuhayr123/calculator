package com.laaltentech.abou.testcodeday02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.result) as TextView
        val editText: EditText = findViewById(R.id.ed1) as EditText
        val editTextTwo: EditText = findViewById(R.id.ed2) as EditText
        val button: Button = findViewById(R.id.show) as Button

//        var sum = editText.text + editTextTwo.text


        button.setOnClickListener {
            var num1 = Integer.parseInt(editText.text.toString())
            var num2 = Integer.parseInt(editTextTwo.text.toString())

            var sum = num1 + num2

            textView.text = sum.toString()
        }

    }
}
