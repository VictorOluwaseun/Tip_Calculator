package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * sample way of calling the class, first parameter is the number of people, second parameter is the percentage tip,
         * third parameter is the bill amount
         *
         */

        var getTip = tip(5, 10, 5000)


        var billPerPerson = getTip.getPerPerson() // method getPerPerson() is in charge of getting the value per person.

        Log.d("Ans", "$billPerPerson") // log the output. You can delete this code later

    }
}