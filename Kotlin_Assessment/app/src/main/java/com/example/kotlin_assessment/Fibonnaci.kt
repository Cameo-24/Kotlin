package com.example.kotlin_assessment

import java.util.*

fun main(){
    var s=Scanner(System.`in`)
    var a:Int=s.nextInt()
    var t1:Int=0
    var t2:Int=1
    for(i in 1..a){
        print("$t1 ")
        var sum=t1+t2
        t1=t2
        t2=sum
    }
}