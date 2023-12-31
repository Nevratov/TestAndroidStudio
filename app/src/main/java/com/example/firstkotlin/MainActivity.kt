package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textViewName: TextView
    lateinit var editTextName: EditText
    lateinit var buttonSave: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewName = findViewById(R.id.textViewName)
        editTextName = findViewById(R.id.editTextName)
        buttonSave = findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener { textViewName.text = editTextName.text }
    }
}