package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.firstkotlinapp.constants.Consts
import com.example.firstkotlinapp.services.AgeServices

class MainActivity : AppCompatActivity() {
    private val ageServices : AgeServices = AgeServices()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtWelcomeMsg : TextView = findViewById(R.id.txtWelcomeMsg)
        val txtAge : TextView = findViewById(R.id.txtAge)
        val txtYourAge : TextView = findViewById(R.id.txtYourAgeMsg)

        txtWelcomeMsg.text = Consts.welcomeMsg
        txtAge.text = ageServices.calculateAge()
        txtYourAge.text = Consts.yourAge
    }
}