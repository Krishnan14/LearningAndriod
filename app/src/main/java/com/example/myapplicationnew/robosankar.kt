package com.example.myapplicationnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class robosankar : AppCompatActivity() {
    lateinit var lable:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robosankar)
        lable=findViewById(R.id.print)
        if (intent.hasExtra("username")){
            lable.text=intent.getStringExtra("username")
        }
    }
}