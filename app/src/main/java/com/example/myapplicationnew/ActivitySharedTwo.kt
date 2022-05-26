package com.example.myapplicationnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivitySharedTwo : AppCompatActivity() {
    lateinit var sharedTextView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_two)
        sharedTextView=findViewById(R.id.sharedTextView)
        val getSharedPref = getSharedPreferences("classDetail", MODE_PRIVATE)
        sharedTextView.text=getSharedPref.getString("userName","")
    }
}