package com.example.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn2.setOnClickListener {
            intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == RESULT_OK) {
            val usernameSignUp = data?.getStringExtra("username")
            val passwordSignUp = data?.getStringExtra("password")
            btn.setOnClickListener {
                var username = user.text.toString()
                var password = pass.text.toString()
                if (usernameSignUp!! == username && passwordSignUp!! == password) {
                    intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Wrong username and/or password!!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}
