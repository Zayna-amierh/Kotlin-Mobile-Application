package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cb1 = findViewById<CheckBox>(R.id.cb1)
        var cb2 = findViewById<CheckBox>(R.id.cb2)

        cb1.setOnClickListener(View.OnClickListener {
            if (cb1.isChecked){
                s1.text = cb1.getText().toString() + ","
            }
            else {
                s1.text = ""
            }
        })
        cb2.setOnClickListener(View.OnClickListener {
            if (cb2.isChecked){
                s2.text = cb2.getText().toString() + ","
            }
            else {
                s2.text = ""
            }
        })
        cb3.setOnClickListener(View.OnClickListener {
            if (cb3.isChecked){
                s3.text = cb3.getText().toString() + ","
            }
            else {
                s3.text = ""
            }
        })
        cb4.setOnClickListener(View.OnClickListener {
            if (cb4.isChecked){
                s4.text = cb4.getText().toString() + ","
            }
            else {
                s4.text = ""
            }
        })

        radioGroup1.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext,"On Click: ${radio.text}", Toast.LENGTH_SHORT).show()
                val button2 = findViewById<Button>(R.id.button2)
                button2.setOnClickListener {
                    Toast.makeText(applicationContext,"On Button Click: ${radio.text}", Toast.LENGTH_SHORT).show()
                }
            }
        )

        val courseFav = arrayOf("Database Design", "Mobile Application", "Math for Computing", "Data Analytics")
        val arrAda = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            courseFav
        )
        spinner.adapter = arrAda
        spinner.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ){
                textView4.text =
                    "Spinner Selected: ${parent.getItemAtPosition(position).toString()}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
    }
}
