package com.example.myapplicationnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class sample1 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1)
    }
    override fun onStart() {
        super.onStart()
        println("sample1Page onStart")
    }
    override fun onResume() {
        super.onResume()
        println("sample1Page onResume")
    }

    override fun onPause() {
        super.onPause()
        println("sample1Page onPause")

    }

    override fun onStop() {
        super.onStop()
        println("sample1Page onStop")
    }
    override fun onRestart() {
        super.onRestart()
        println("sample1Page onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("sample1Page onDestroy")
    }



}