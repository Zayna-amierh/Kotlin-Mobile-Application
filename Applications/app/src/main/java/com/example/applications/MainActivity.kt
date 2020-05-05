package com.example.applications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courseName = "Mobile Application Development"
        btn2.setOnClickListener() {
            intent = Intent(this, ActivitySecond::class.java)
            intent.putExtra("your_name",editText1.text)
            intent.putExtra("course_name", courseName)
            startActivity(intent)
        }
    }
}
