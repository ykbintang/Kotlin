package com.dicoding.kotlin

// #1 Function dengan Parameter
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Yayes", "Kasnanda Bintang")
    sayHello("Budi", "Tarmidji")
    sayHello("Bagas", null)
}
/*
    output:
    Hello Yayes Kasnanda Bintang
    Hello Budi Tarmidji
    Hello Bagas
 */