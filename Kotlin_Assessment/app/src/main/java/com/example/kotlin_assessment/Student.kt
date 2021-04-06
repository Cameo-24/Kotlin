package com.example.kotlin_assessment

import java.util.*

fun main(){
    var s=Scanner(System.`in`)
    var a:Int=s.nextInt()
    var b:Int=s.nextInt()
    var c:Int=s.nextInt()
    var e:Float=(a+b+c).toFloat()
    var d:Float=(e/300)*100
    println("Percentage of Student:$d")

}