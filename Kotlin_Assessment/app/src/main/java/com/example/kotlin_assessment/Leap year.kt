package com.example.kotlin_assessment

import java.util.*

fun main(){
    var s=Scanner(System.`in`)
    var year:Int=s.nextInt()
    if(((year%4==0 && year%100!=0)) || (year%400==0)){
        println("$year is Leap Year")
    }
    else{
        println("$year iS not Leap year")
    }
}