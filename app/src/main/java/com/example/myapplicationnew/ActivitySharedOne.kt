package com.example.myapplicationnew

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ActivitySharedOne : AppCompatActivity() {
    lateinit var sharedEdittext:EditText
    lateinit var clickButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_one)

        sharedEdittext=findViewById(R.id.sharedEdittext)
        clickButton=findViewById(R.id.clickButton)

        clickButton.setOnClickListener {
            val sharedPref:SharedPreferences=getSharedPreferences("classDetail", MODE_PRIVATE)
            val sharedEdit:SharedPreferences.Editor=sharedPref.edit()
            sharedEdit.putString("userName",sharedEdittext.text.toString())
            sharedEdit.apply()
            val secondIntent=Intent(this,ActivitySharedTwo::class.java)
            startActivity(secondIntent)
        }
    }
}