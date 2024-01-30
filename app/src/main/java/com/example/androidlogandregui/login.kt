package com.example.androidlogandregui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        //intent to the REG page
        val regifnoUser = findViewById<TextView>(R.id.regifnoUser )
        regifnoUser.setOnClickListener {
            val intent1 = Intent(this, Register::class.java)
            //call the intent
            startActivity(intent1)

        }


    }




}