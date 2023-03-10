package com.dicoding.kotlin

fun sayWelcome(firstName: String, lastName: String? = null){
    if (lastName == null) {
        println("Welcome $firstName")
    } else {
        println("Welcome $firstName $lastName")
    }
}

fun main() {
    sayWelcome("Yayes", "Kasnanda Bintang")
    sayWelcome("Bagas")
    sayWelcome("Budi", "Tarmidji")
}
/*
    output:
    Welcome Yayes Kasnanda Bintang
    Welcome Bagas
    Welcome Budi Tarmidji
 */