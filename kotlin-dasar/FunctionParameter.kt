package com.dicoding.kotlin

// ## Function Parameter
/*
    => Saat membuat function, kadang-kadang kita membutuhkan data dari luar, atau kita
        sebut parameter.
    => Di Kotlin, kita bisa menambahkan parameter di function, bisa lebih dari satu
    => Parameter tidaklah wajib, jadi kita bisa membuat function tanpa parameter seperti
        sebelumnya yang sudah kita buat
    => Namun jika kita menambahkan parameter di function, maka ketika memanggil function
        tersebut, kita wajib memasukkan data ke parameternya
 */

// Contoh function parameter pada kode dibawah adalah firstName dan lastName
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