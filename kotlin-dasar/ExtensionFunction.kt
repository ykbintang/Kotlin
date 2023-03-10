package com.dicoding.kotlin

// ## Extension Function
/*
    - Extension function adalah kemampuan menambahkan function pada tipe data
        yang sudah ada
    - Extension function adalah salah satu fitur yang sangat powerfull, namun
        harap bijak menggunakannya, karena jika terlalu banyak digunakan, akan
        membuat program sulit dimengerti, karena terlihat seperti magic
    - Untuk membuat extension function, kita cukup menambahkan tipe data pada
        nama function nya, lalu diikuti dengan tanda . (titik)
    - Untuk mengakses data nya di extension function, kita bisa menggunakan kata
        kunci this
 */

// Contoh extension function
fun String.hello(): String = "Hello $this"
fun String.sayWelcome(): Unit = println("Welcome $this")

fun main() {

    var name = "Bintang"

    // bisa dengan fungsi print
    println(name.hello())       // output: Hello Bintang

    // bisa langsung dengan string
    "Budi".sayWelcome()         // output: Welcome Budi

    // bisa menggunakan variabel dengan tipe string
    name.sayWelcome()           // output: Welcome Bintang

    name = "Yayes Kasnanda Bintang"
    println(name.hello())       // output: Hello Yayes Kasnanda Bintang
    name.sayWelcome()           // output: Welcome Yayes Kasnanda Bintang

}