package com.example.kotlin_assessment

import java.util.*

fun main(args: Array<String>) {
    var s=Scanner(System.`in`)
    var n:Int=s.nextInt()



    var i:Int=2

    while(n>0){
        if(isPrime(i)) {
            println(i)
            n--;
            i++
        }
        else{
            i++
        }
    }
}
fun isPrime(i:Int):Boolean{
    var c:Int;
    c=0;

    for(j in 1..i){
        if(i%j==0){
            c++
        }
    }
    if(c>2){
      return false
    }
    else{
        return true
    }
}