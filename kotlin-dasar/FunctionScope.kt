package com.dicoding.kotlin

// ## Function Scope
/*
    - Function scope adalah ruang lingkup dimana sebuah function bisa diakses
    - Saat kita membuat function di dalam file kotlin, maka secara otomatis function tersebut
        bisa diakses dari file kotlin manapun
    - Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu,
        maka kita bisa membuat function di dalam function
 */

fun satu(){
    // error
    // sayHello("Bintang")
}

fun dua() {
    // error
    // sayHello("Bintang")
}

fun main() {
    // pada kasus ini fungsi sayHello() hanya bisa
    // diakses didalam fungsi main()
    fun sayHello(name: String): Unit {
        println("Hello $name")
    }

    sayHello("Bintang")
    /*
    output: Hello Bintang
     */
}