package com.example.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class Sum {
    val x = 3;
    fun sumN(num1: Int, num2: Int): Int{
        return num1 + num2 + x
    }
}

class Div {
    val y = 2;
    fun divN(num1: Int, num2: Int): Int {
        if (num1!=0 && num2!=0){
            return num1/num2
        }
        else {
            return 0
        }
    }
}

class Mult {
    var arr = arrayOf(2, 4, 7, 5, 8)
    fun multN(num1: Int, num2: Int, num3: Int): Int {
        return num1 * num2 * arr[num3]
    }
}

class Sub {
    var arr = arrayOf(3, 9, 6, 10, 1)
    fun subN(num1: Int, num2: Int, num3: Int): Int {
        return num1 - num2 - arr[num3]
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.text)
        var en1 = findViewById<EditText>(R.id.en1)
        var en2 = findViewById<EditText>(R.id.en2)
        var sumB = findViewById<Button>(R.id.sumB)
        var divB = findViewById<Button>(R.id.divB)
        var MultB = findViewById<Button>(R.id.MultB)
        var resulttv = findViewById<TextView>(R.id.resulttv)
        var resulttv2 = findViewById<TextView>(R.id.resulttv2)


        val sum = Sum()
        val div = Div()
        val mult = Mult()
        val sub = Sub()
        var answer = 0


        sumB.setOnClickListener{
            var num1 = en1.text.toString().toInt()
            var num2 = en2.text.toString().toInt()
            answer = sum.sumN(num1, num2)
            resulttv2.text = answer.toString()
            en1.text = null
            en2.text = null
        }

        divB.setOnClickListener{
            var num1 = en1.text.toString().toInt()
            var num2 = en2.text.toString().toInt()
            answer = div.divN(num1, num2)
            resulttv2.text = answer.toString()
            en1.text = null
            en2.text = null
        }

        var i = Random.nextInt(5)
        MultB.setOnClickListener{
            var num1 = en1.text.toString().toInt()
            var num2 = en2.text.toString().toInt()
            answer = mult.multN(num1, num2, i)
            resulttv2.text = answer.toString()
            en1.text = null
            en2.text = null
        }

        subB.setOnClickListener{
            var num1 = en1.text.toString().toInt()
            var num2 = en2.text.toString().toInt()
            answer = sub.subN(num1, num2, i )
            resulttv2.text = answer.toString()
            en1.text = null
            en2.text = null
        }


    }
}
