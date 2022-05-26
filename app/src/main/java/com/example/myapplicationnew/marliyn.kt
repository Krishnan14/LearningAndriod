package com.example.myapplicationnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class marliyn : AppCompatActivity() {
    lateinit var username:EditText
    lateinit var userpassword:EditText
    lateinit var userlogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.marilyn)
        username=findViewById(R.id.name)
        userpassword=findViewById(R.id.security)
        userlogin=findViewById(R.id.enter)
        userlogin.setOnClickListener {
            if (username.text.isEmpty()){
                Toast.makeText(applicationContext,"Please enter your name",Toast.LENGTH_SHORT).show()
            }
            else if (userpassword.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter your password", Toast.LENGTH_SHORT)
                    .show()
            }
                else{
                Toast.makeText(applicationContext,"Please enter submit",Toast.LENGTH_SHORT).show()

            }

        }


    }
}