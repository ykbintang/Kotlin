package com.dicoding.kotlin

fun main() {

    // #1 Contoh Number
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L

    println(age)        // output: 30
    println(height)     // output: 170
    println(distance)   // output: 2000
    println(balance)    // output: 100000000

    // #2 Contoh Floating Point Number (angka desimal)
    var value: Float = 98.98F
    var radius: Double = 2342342343.54535

    println(value)        // output: 98.98
    println(radius)       // output: 2.34234234354535E9

    // #3 Contoh Literals ()
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(decimalLiteral)       // output: 100
    println(hexadecimalLiteral)   // output: 255
    println(binaryLiteral)        // output: 1

    // #4 Contoh Underscore in Number (agar lebih mudah dibaca)
    var age: Byte = 3_0
    var height: Int = 1_7_0
    var distance: Short = 2_000
    var balance: Long = 100_000_000L

    println(age)          // output: 30
    println(height)       // output: 170
    println(distance)     // output: 2000
    println(balance)      // output: 100000000

    // #5 Contoh Conversion (konversi)
    var number: Int = 100

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(byte)         // output: 100
    println(short)        // output: 100
    println(int)          // output: 100
    println(long)         // output: 100
    println(float)        // output: 100.0
    println(double)       // output: 100.0

}