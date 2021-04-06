package com.example.kotlin_assessment

import java.util.*

fun main(){
    var s= Scanner(System.`in`)
    var q:Int=s.nextInt()
    var s1:Float=s.nextFloat()
    var p:Float=(q.toFloat()*s1)
    var d:Double=(p.toDouble()*0.15)
    var t:Double=(p.toDouble()-d)
    println("Discount: $d")
    println("Total Bill: $t")
}