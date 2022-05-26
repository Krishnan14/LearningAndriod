package com.example.myapplicationnew

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fragmentTho: Fragment() {
    lateinit var rootview:View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      rootview=inflater.inflate(R.layout.activity_fragment_tho,container,false)
        return rootview
    }
}