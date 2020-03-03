package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            var num1: Int = numOne.text.toString().toInt()
            var num2: Int = numTwo.text.toString().toInt()
            var addition = num1+num2
            result.text = addition.toString()
        }

        subButton.setOnClickListener {
            var num1: Int = numOne.text.toString().toInt()
            var num2: Int = numTwo.text.toString().toInt()
            var subtraction = num1-num2
            result.text = subtraction.toString()
        }

        mulButton.setOnClickListener {
            var num1: Int = numOne.text.toString().toInt()
            var num2: Int = numTwo.text.toString().toInt()
            var multiplication = num1*num2
            result.text = multiplication.toString()
        }

        divButton.setOnClickListener {
            var num1: Int = numOne.text.toString().toInt()
            var num2: Int = numTwo.text.toString().toInt()
            var division = num1/num2
            result.text = division.toString()
        }
    }
}
