package com.example.myapplicationnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PonnerSankar : AppCompatActivity() {
    lateinit var editName:TextView
    lateinit var Button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ponner_sankar)
        editName=findViewById(R.id.Username)
        Button=findViewById(R.id.submit)
        Button.setOnClickListener{
            val redirectIntent=Intent(this,robosankar::class.java)
            redirectIntent.putExtra("username",editName.text.toString())
            startActivity(redirectIntent)
        }
    }
}