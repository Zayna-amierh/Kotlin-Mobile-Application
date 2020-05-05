package com.example.app4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check Box
        cb_single.setOnClickListener(View.OnClickListener {
            if (cb_single.isChecked){
                Toast.makeText(this, "Checked", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Unchecked", Toast.LENGTH_SHORT).show()
            }
        })

        radioGroup1.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext,"On click: ${radio.text}",Toast.LENGTH_SHORT).show()
            }
        )

        // Spinner
        val programmingLang = arrayOf("Java", "Swift", "R", "Kotlin")
        val arrAda = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            programmingLang
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
                textView.text =
                    "Spinner Selected: ${parent.getItemAtPosition(position).toString()}"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

    }
}
