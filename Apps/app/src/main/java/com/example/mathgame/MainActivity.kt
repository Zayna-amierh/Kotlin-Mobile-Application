package com.example.mathgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class Number1 {
    var arr = arrayOf(1, 3, 16, 12, 4, 5, 13, 4, 10, 7)

    fun PickNumber(i: Int): Int {
        var number = arr.get(i)
        return number
    }
}

class Operation {
    var opp = arrayOf("+", "-", "*", "/")

    fun PickOperation(i: Int): String {
        var n = i%4
        var operation = opp.get(n)
        return operation
    }
}

class Number2 {
    var arr2 = arrayOf(1, 4, 7, 12, 19, 6, 10, 11, 2, 20)

    fun PickNumber(i: Int): Int {
        var n2 = (10-(i+1))
        var number2 = arr2.get(n2)
        return number2
    }

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1 = findViewById<TextView>(R.id.num1)
        var num2 = findViewById<TextView>(R.id.num2)
        var op = findViewById<TextView>(R.id.op)
        var score = findViewById<TextView>(R.id.score)
        var userAnswer = findViewById<EditText>(R.id.userAnswer)

        var num1Obj = Number1()
        var num2Obj = Number2()
    }

}


