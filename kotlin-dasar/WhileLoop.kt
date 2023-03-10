package com.dicoding.kotlin

fun main() {

    var i = 0

    // #1 While
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