package com.dicoding.kotlin

// ## While Loop
/*
    => While adalah salah satu perulangan lain yang ada di Kotlin
    => While adalah salah satu perulangan yang sangat flexible, dimana kode while
        akan melakukan pengecekan kondisi, jika kondisi bernilai true, maka dia akan
        menjalankan blok while, dan terus diulangi sampai kondisi while bernilai false
 */

fun main() {

    var i = 0

    // Contoh while loop
    while (i < 10) {
        println("Perulangan ke $i")
        i++
    }
    println("Selesai perulangan")
    /*
        output:
        Perulangan ke 0
        Perulangan ke 1
        Perulangan ke 2
        Perulangan ke 3
        Perulangan ke 4
        Perulangan ke 5
        Perulangan ke 6
        Perulangan ke 7
        Perulangan ke 8
        Perulangan ke 9
        Selesai perulangan
     */

    // Ketika kondisi bernilai false
    i = 100
    while (i < 10) {
        println("Perulangan ke $i")
        i++
    }
    println("Akan langsung ke kode ini")
    /*
        output:
        Akan langsung ke kode ini
     */

}