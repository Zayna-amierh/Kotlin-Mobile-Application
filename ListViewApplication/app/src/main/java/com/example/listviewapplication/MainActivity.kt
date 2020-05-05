package com.example.listviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var cities = arrayOf(
            "Auckland",
            "Amman",
            "Sweden",
            "Tokyo",
            "Nanjing",
            "Bali",
            "Paris",
            "London",
            "Bangkok",
            "Sydney",
            "Perth",
            "Rome",
            "Vienna",
            "Hasselt",
            "Cape Town"
        )
        var myListView = findViewById<ListView>(R.id.listView1)
        val arrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, cities)
        myListView.adapter = arrayAdapter

        myListView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                val itemValue = myListView.getItemAtPosition(position) as String

                Toast.makeText(
                    applicationContext,
                    "Position: $position\nItem Value: $itemValue",
                    Toast.LENGTH_LONG
                ).show()

            }
        }
    }
}
