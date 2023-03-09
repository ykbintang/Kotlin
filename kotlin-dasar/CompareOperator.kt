package com.dicoding.kotlin

/*
    Daftar Operator Perbandingan:
    > (lebih dari)
    < (kurang dari)
    >= (lebih dari sama dengan)
    <= (kurang dari sama dengan)
    == (sama dengan)
    != (tidak sama dengan)
 */

fun main() {

    // #1 Operator Perbandingan
    val a = 100
    val b = 200

    val result: Boolean = a > b
    println(result)                 // output: false

    println(100 >= 100)             // output: true
    println(100 <= 100)             // output: true

    println("Budi" == "budi")       // output: false
    println("Budi" != "budi")       // output: true

}