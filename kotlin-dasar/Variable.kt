package com.dicoding.kotlin

fun main() {

    // #1 Variable Mutable (dapat diubah)
    var firstName: String = "Yayes"
    var lastName = "Bintang"

    //mengubah variable
    lastName = "Kasnanda Bintang"
    println(lastName)       // output: Kasnanda Bintang

    // #2 Variable Immutable (tidak dapat diubah)
    val firstName = "Yayes"
    val lastName = "Bintang"

    // error jika mengubah variable
    lastName = "Kasnanda Bintang"   // error karena mengubah variable "val" yang bersifat immutable

    // #3 Nullable
    var firstName: String? = "Yayes"
    println(firstName)      // output: Yayes
    firstName = null

    // error karena firstName bernilai null
    println(firstName.length)       // error
    // cara mengakses yang benar
    println(firstName?.length)      // output: null

}

// #4 Variable Constant
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    println("Welcome to $APP version $VERSION")
    // output: Welcome to Belajar Kotlin version 0.0.1

}