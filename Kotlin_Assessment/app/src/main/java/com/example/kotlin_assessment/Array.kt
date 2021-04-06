package com.example.kotlin_assessment

fun main()
{
    var arr = arrayOf(10,20,30)
    var la = {->
        var r = arr.sorted()
        println("The Smallest Element is ${r[0]}")
        println("The Largest Element is ${r[arr.size-1]}")
    }
    la()
}