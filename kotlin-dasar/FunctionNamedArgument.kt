package com.dicoding.kotlin

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Yayes", "Kasnanda", "Bintang")

    // #1 Function Named Argument
    fullName(
        lastName = "Bintang",
        firstName = "Yayes",
        middleName = "Kasnanda"
    )
    /*
        output:
        Hello Yayes Kasnanda Bintang
        Hello Yayes Kasnanda Bintang
     */
}