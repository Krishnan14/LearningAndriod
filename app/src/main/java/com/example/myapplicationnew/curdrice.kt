package com.example.myapplicationnew

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class curdrice : AppCompatActivity() {
    lateinit var editName:EditText
    lateinit var editButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curdrice)
        editName=findViewById(R.id.username)
        editButton=findViewById(R.id.login)
        editButton.setOnClickListener {
            val sharedPref:SharedPreferences=getSharedPreferences("Name", MODE_PRIVATE)
            val sharedEdit:SharedPreferences.Editor=sharedPref.edit()
            sharedEdit.putString("Rollno",editName.text.toString())
            sharedEdit.apply()
            val secondIntent=Intent(this,lemonrice::class.java)
            startActivity(secondIntent)
        }
    }
}