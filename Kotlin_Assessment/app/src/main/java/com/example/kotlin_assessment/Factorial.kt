package com.example.kotlin_assessment

fun main(){
    var n=Integer.valueOf(readLine())
    var fact={x:Int->
            var s=1
        for(i in 1..x){
            s=s*i
        }
        println("The Factorial of $x is $s")

    }
    fact(n)
}