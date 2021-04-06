package com.example.kotlin_assessment

import java.util.*

fun main(){
    var s=Scanner(System.`in`)
    var n:Int=s.nextInt()
    var sum:Int=0;
    var r:Int
    var orginal:Int=n
    while(n!=0){
        r=n%10
        sum = (sum*10)+r
        n/=10
    }
    if(orginal==sum){
        println("Number is Palindrom")
    }
    else{
        println("Number is not Palindrom")
    }
}