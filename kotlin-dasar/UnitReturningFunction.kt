package com.dicoding.kotlin

// #1 Unit Returning Function
fun printHello(name: String?): Unit {
    if (name == null) {
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    printHello("Yayes Kasnanda Bintang")
    printHello(null)
}
/*
    output:
    Hello Yayes Kasnanda Bintang
    Hello Bro
 */