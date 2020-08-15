package com.example.tipcalculator

class Tip(numberOfPeople: Int, tipPercentage: Int, billAmount: Int){

    var numberOfPeople: Double = numberOfPeople.toDouble()
    var tipPercentage: Double = tipPercentage.toDouble()
    var billAmount: Double = billAmount.toDouble()

    fun getPerPerson():Double{

        var ans = ((tipPercentage * 100) + billAmount) / numberOfPeople



        return ans
    }

}