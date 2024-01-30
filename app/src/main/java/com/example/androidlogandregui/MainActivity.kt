package com.example.androidlogandregui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //intent to the login page
        val getstartedbtn = findViewById<ImageView>(R.id.getstartedbtn )
        getstartedbtn.setOnClickListener {
            val intent1 = Intent(this, login::class.java)
            //call the intent
            startActivity(intent1)

        }



    }





}