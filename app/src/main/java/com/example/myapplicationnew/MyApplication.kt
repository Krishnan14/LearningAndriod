package com.example.myapplicationnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MyApplication : AppCompatActivity() {
    lateinit var editName:EditText
    lateinit var userid:EditText
    lateinit var login:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_application)
        editName=findViewById(R.id.edittext)
        userid=findViewById(R.id.identity)
        login=findViewById(R.id.signup)
        login.setOnClickListener {
            if (editName.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Password ",Toast.LENGTH_SHORT).show()
            }
            else if (userid.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Password ", Toast.LENGTH_SHORT)
                    .show()
            }
            else{
                Toast.makeText(applicationContext,"login",Toast.LENGTH_SHORT).show()
            }
        }
    }
}