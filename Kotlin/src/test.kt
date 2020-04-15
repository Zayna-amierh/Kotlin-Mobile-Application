package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class Number1 {
    var arr = arrayOf(5, 7, 9, 3, 7, 4, 6, 9, 10, 2)

    fun pickNumber(index: Int): Int {
        return arr[index]
    }
}
/////////////////////////////////////////////////////////////////////
class Operation{
    var operationArr = arrayOf("+","-","*","/")
    fun pickOperation(index:Int):String{
        return operationArr[index%4]
    }
}
/////////////////////////////////////////////////////////////////////
class Number2 {
    var arr = arrayOf(6, 8, 4, 9, 2, 6, 1, 5, 10, 7)

    fun pickNumber(index: Int): Int{
        return arr[10 - (index + 1)]
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var tv1 = findViewById<TextView>(R.id.textView1)
        var tv2 = findViewById<TextView>(R.id.textView2)
        var tv3 = findViewById<TextView>(R.id.textView3)
        var bt1 = findViewById<Button>(R.id.check)
        var et = findViewById<EditText>(R.id.userAnwer)
        var tv4 = findViewById<TextView>(R.id.counter)

        var counter = 0
        var answer = 0
        var correctAnswer = 0
        var number1 = Number1()
        var operation = Operation()
        var number2 = Number2()
        var n1 = number1.pickNumber(0)
        var n2 = number2.pickNumber(0)
        var op = operation.pickOperation(0)
        tv1.text = n1.toString()
        tv2.text = op
        tv3.text = n2.toString()
        tv4.text = "0"

        bt1.setOnClickListener {
            when (op) {
                "+" -> correctAnswer = n1 + n2
                "-" -> correctAnswer = n1 - n2
                "*" -> correctAnswer = n1 * n2
                "/" -> correctAnswer = n1 / n2
            }
            answer = et.text.toString().toInt()
            if (correctAnswer == answer) {
                counter++
                Toast.makeText(this, "correct..Next", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "wrong..Next", Toast.LENGTH_SHORT).show()
            }
            tv4.text = counter.toString()

            var i = Random.nextInt(10)
            var n1 = number1.pickNumber(i)
            var n2 = number2.pickNumber(i)
            var op = operation.pickOperation(i)
            tv1.text = n1.toString()
            tv2.text = op
            tv3.text = n2.toString()
            et.text = null
        }
    }
}
