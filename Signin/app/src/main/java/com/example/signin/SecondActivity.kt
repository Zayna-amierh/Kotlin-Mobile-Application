package com.example.signin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        backbtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("username",username.text.toString())
            intent.putExtra("password",password.text.toString())
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
