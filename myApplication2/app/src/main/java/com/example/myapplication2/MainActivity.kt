package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun areaOfCircle(view: View) {
        val radius = radiusText.text.toString().toFloat()
        val area = radius * radius * 3.14
        textView.text = area.toString()
        Toast.makeText(this, "LongerSuccess", Toast.LENGTH_LONG).show()
    }

}


