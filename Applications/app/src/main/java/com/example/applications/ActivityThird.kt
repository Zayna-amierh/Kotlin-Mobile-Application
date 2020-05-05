package com.example.applications

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ActivityThird : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btn4.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(intent)
        }
        btn5.setOnClickListener(){
            val intent = Intent(this, ActivitySecond::class.java)
            intent.putExtra("name", "Zayna")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }
}
