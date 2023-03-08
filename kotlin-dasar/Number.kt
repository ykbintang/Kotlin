package com.dicoding.kotlin

fun main() {

    // underscore in number
//    var age: Byte = 30
//    var height: Int = 170
//    var distance: Short = 2000
//    var balance: Long = 100000000L
//
//    println(age)
//    println(height)
//    println(distance)
//    println(balance)

    // floating point number
    var value: Float = 98.98F
    var radius: Double = 2342342343.54535

//    println(value)
//    println(radius)

    // literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

//    println(decimalLiteral)
//    println(hexadecimalLiteral)
//    println(binaryLiteral)

    // underscore in number
    var age: Byte = 3_0
    var height: Int = 1_7_0
    var distance: Short = 2_000
    var balance: Long = 100_000_000L

//    println(age)
//    println(height)
//    println(distance)
//    println(balance)

    // conversion
    var number: Int = 100

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

//    println(byte)
//    println(short)
//    println(int)
//    println(long)
//    println(float)
//    println(double)
}