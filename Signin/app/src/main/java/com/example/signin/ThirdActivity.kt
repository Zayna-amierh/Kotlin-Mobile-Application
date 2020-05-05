package com.example.signin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val country = arrayOf("Jordan", "New Zealand", "Turkey", "Japan")
        val arrAda = ArrayAdapter(
            this, android.R.layout.simple_spinner_item,
            country
        )
        spinner.adapter = arrAda
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (parent.getItemAtPosition(position).toString()) {
                    "Jordan" -> {
                        capital.text = "The capital is: Amman"
                        val arrayAdapter: ArrayAdapter<*>
                        val attractions = arrayOf("Aqaba", "Ajloun", "Petra")
                        var myListView = findViewById<ListView>(R.id.listView1)
                        arrayAdapter = ArrayAdapter(
                            applicationContext,
                            android.R.layout.simple_list_item_1,
                            attractions
                        )

                        myListView.adapter = arrayAdapter

                        myListView.onItemClickListener = object : AdapterView.OnItemClickListener {
                            override fun onItemClick(
                                parent: AdapterView<*>,
                                view: View,
                                position: Int,
                                id: Long
                            ) {
                                val place = myListView.getItemAtPosition(position) as String
                                when (place) {
                                    "Aqaba" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.jdtours.com/jordan/tourist-sites-in-jordan/aqaba/")
                                        )
                                        startActivity(intent)
                                    }
                                    "Ajloun" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.jdtours.com/jordan/tourist-sites-in-jordan/ajloun/")
                                        )
                                        startActivity(intent)
                                    }
                                    "Petra" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.jdtours.com/jordan/tourist-sites-in-jordan/petra/")
                                        )
                                        startActivity(intent)
                                    }
                                }

                            }
                        }
                    }
                    "New Zealand" -> {
                        capital.text = "The capital is: Wellington"
                        val arrayAdapter: ArrayAdapter<*>
                        val attractions = arrayOf("Bay of Islands", "Queenstown", "Rotorua")
                        var myListView = findViewById<ListView>(R.id.listView1)
                        arrayAdapter = ArrayAdapter(
                            applicationContext,
                            android.R.layout.simple_list_item_1,
                            attractions
                        )

                        myListView.adapter = arrayAdapter

                        myListView.onItemClickListener = object : AdapterView.OnItemClickListener {
                            override fun onItemClick(
                                parent: AdapterView<*>,
                                view: View,
                                position: Int,
                                id: Long
                            ) {
                                val place = myListView.getItemAtPosition(position) as String
                                when (place) {
                                    "Bay of Islands" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.visitboi.co.nz/")
                                        )
                                        startActivity(intent)
                                    }
                                    "Queenstown" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.queenstownnz.co.nz/")
                                        )
                                        startActivity(intent)
                                    }
                                    "Rotorua" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.rotoruanz.com/")
                                        )
                                        startActivity(intent)
                                    }
                                }

                            }
                        }
                    }

                    "Turkey" -> {
                        capital.text = "The capital is: Ankara"
                        val arrayAdapter: ArrayAdapter<*>
                        val attractions =
                            arrayOf("Mount Nemrut", "Ephesus", "Pamukkale")
                        var myListView = findViewById<ListView>(R.id.listView1)
                        arrayAdapter = ArrayAdapter(
                            applicationContext,
                            android.R.layout.simple_list_item_1,
                            attractions
                        )

                        myListView.adapter = arrayAdapter

                        myListView.onItemClickListener = object : AdapterView.OnItemClickListener {
                            override fun onItemClick(
                                parent: AdapterView<*>,
                                view: View,
                                position: Int,
                                id: Long
                            ) {
                                val place = myListView.getItemAtPosition(position) as String
                                when (place) {
                                    "Mount Nemrut" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.goturkey.com/destinations/nemrut")
                                        )
                                        startActivity(intent)
                                    }
                                    "Ephesus" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.goturkey.com/destinations/ephesus")
                                        )
                                        startActivity(intent)
                                    }
                                    "Pamukkale" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.goturkey.com/destinations/pamukkale")
                                        )
                                        startActivity(intent)
                                    }

                                }

                            }
                        }
                    }
                    "Japan" -> {
                        capital.text = "The capital is: Tokyo"
                        val arrayAdapter: ArrayAdapter<*>
                        val attractions =
                            arrayOf("Mount Fuji", "Historic Kyoto", "Osaka Castle")
                        var myListView = findViewById<ListView>(R.id.listView1)
                        arrayAdapter = ArrayAdapter(
                            applicationContext,
                            android.R.layout.simple_list_item_1,
                            attractions
                        )

                        myListView.adapter = arrayAdapter

                        myListView.onItemClickListener = object : AdapterView.OnItemClickListener {
                            override fun onItemClick(
                                parent: AdapterView<*>,
                                view: View,
                                position: Int,
                                id: Long
                            ) {
                                val itemValue = myListView.getItemAtPosition(position) as String
                                when (itemValue) {
                                    "Mount Fuji" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.japan-guide.com/e/e2172.html")
                                        )
                                        startActivity(intent)
                                    }
                                    "Historic Kyoto" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.japan-guide.com/e/e3959.html")
                                        )
                                        startActivity(intent)
                                    }
                                    "Osaka Castle" -> {
                                        intent = Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("https://www.japan-guide.com/e/e4000.html")
                                        )
                                        startActivity(intent)
                                    }
                                }

                            }
                        }
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }
}
