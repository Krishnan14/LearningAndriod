
package com.example.myapplicationnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class OneActivity : AppCompatActivity() {
    lateinit var enternameEditText:EditText
    lateinit var submitButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        enternameEditText=findViewById(R.id.enternameEditText)
        submitButton=findViewById(R.id.submitButton)
        submitButton.setOnClickListener{
            val redirectIntent=Intent(this,TwoActivity::class.java)
            redirectIntent.putExtra("userName",enternameEditText.text.toString())
            startActivity(redirectIntent)
        }
    }
}