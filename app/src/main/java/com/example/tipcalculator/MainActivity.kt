package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * sample way of calling the class, first parameter is the number of people, second parameter is the percentage tip,
         * third parameter is the bill amount
         *
         */

        btn_10percent.setOnClickListener{ Log.d("Ans", "${it}")}

        btnCal.setOnClickListener{
            val getTip = Tip(edvSplit.toString().toInt(), 10, edtBillAmt.toString().toInt())
            val billPerPerson = getTip.getPerPerson() // method getPerPerson() is in charge of getting the value per person.
            txtAmount.text = "$billPerPerson"
        }




//        Log.d("Ans", "$billPerPerson") // log the output. You can delete this code later



    }
}