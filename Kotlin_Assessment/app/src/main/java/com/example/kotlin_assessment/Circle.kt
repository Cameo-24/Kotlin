package com.example.kotlin_assessment

import java.util.*

class A
{
    constructor(num:Int)
    {
        var a = num*num*3.14
        var p = 2*3.14*num
        var s= p/4
        println("The area of Circle is ${a}")
        println("The Perimeter of Circle is ${p}")
        println("The side of the square is ${s}")
    }
}
fun main()
{
    var sc = Scanner(System.`in`)
    var r = sc.nextInt()
    var obj = A(r)

}