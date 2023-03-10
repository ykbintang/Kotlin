package com.dicoding.kotlin

fun main() {

    var i = 0

    // #1 Do While
    do {
        println("Perulangan ke $i")
        i++
    } while (i < 10)
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
     */

    // Ketika kondisi bernilai false
    i = 100
    do {
        println("Perulangan ke $i")
        i++
    } while (i < 10)
    println("Selesai perulangan")
    /*
        // program diatas tetap akan mengeksekusi blok kode do,
        // setelah itu baru dicek kondisi blok kode while,
        // karena bernilai false perulangan akan berhenti dan
        // program akan lanjut mengeksekusi kode setelah do.. while..

        output:
        Perulangan ke 100
        Selesai perulangan
     */

}