package com.example.applications

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class ActivitySecond : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val courseName = bundle?.get("course_name")
        val name = bundle?.get("your_name")
        textView3.text = "Course name is: $courseName"
        textView4.text = "Your name is $name"


        btn2.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener(){
            intent = Intent(this, ActivityThird::class.java)
//            startActivity(intent)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (requestCode==1 && resultCode == RESULT_OK){
            val data = intent?.getStringExtra("name")
            Toast.makeText(this, "Got back: $data", Toast.LENGTH_SHORT).show()
        }
        else {

        }
    }
}
