package com.example.myapplicationnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TwoActivity : AppCompatActivity() {
    lateinit var labelText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        labelText=findViewById(R.id.labelText)
        if (intent.hasExtra("userName")){
            labelText.text=intent.getStringExtra("userName")
        }
    }
}