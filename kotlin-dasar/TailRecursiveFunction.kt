package com.dicoding.kotlin

// ## Tail Recursive Function
/*
    => Recursive function adalah salah satu kemampuan bagus di Kotlin, namun sayangnya ada
        keterbatasan dalam penggunaan recursive
    => Jika recursive function yang kita buat, saat dijalankan memanggil function dirinya
        sendiri terlalu dalam, maka bisa dimungkinkan akan terjadi error stack overflow
    => Permasalahan ini di bahasa pemrograman Java tidak bisa ditangani
    => Namun di Kotlin, masalah ini ada solusinya, yaitu dengan menggunakan tail recursive function
    => Tail recursive function adalah teknik mengubah recursive function yang kita buat, menjadi
        looping biasa ketika dijalankan
    => Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive function,
        ada syarat-syarat nya
 */

// ## Syarat Recursive Function
/*
    => Tambahkan tailrec di functionnya
    => Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa
        embel-embel operasi dengan data lain
 */

fun main() {

    // #1 Contoh tail recursive function
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }
    display(10000)
    /*
        output:
        Recursive 10000
        Recursive 9999
        ...
        Recursive 1
        Recursive 0
     */

    // #2 Contoh tail recursive factorial function
    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialTail(value - 1, total * value)
        }
    }
    println(factorialTail(10))               // output: 3628800
    println(factorialTail(5, 1))        // output: 120
    println(factorialTail(4, 5))        // output: 120
    println(factorialTail(3, 20))       // output: 120
    println(factorialTail(2, 60))       // output: 120
    println(factorialTail(1, 120))      // output: 120
}