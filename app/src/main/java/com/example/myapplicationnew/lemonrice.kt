package com.example.myapplicationnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class lemonrice : AppCompatActivity() {
    lateinit var textName:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lemonrice)
        textName=findViewById(R.id.view)
        val getsharedpref=getSharedPreferences("Name", MODE_PRIVATE)
        textName.text=getsharedpref.getString("Rollno","")
    }
}