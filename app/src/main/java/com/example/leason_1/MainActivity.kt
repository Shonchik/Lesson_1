package com.example.leason_1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var editView: EditText

    private val list = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        editView = findViewById(R.id.editTextTextPersonName)

        val ButtonAdd: Button = findViewById(R.id.button)
        val ButtonShow: Button = findViewById(R.id.button2)
        ButtonAdd.setOnClickListener { addMe() }
        ButtonShow.setOnClickListener { showMe() }
    }

    fun addMe (){
        val meString = editView.text.toString()
        list.add(meString)
        editView.text = null;
        //textView.text = count.toString();
    }

    fun showMe (){
        list.sortBy { it.toLowerCase()}
        textView.text = list.joinToString("\n");
    }

}