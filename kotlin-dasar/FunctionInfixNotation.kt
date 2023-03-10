package com.dicoding.kotlin

// ## Function Infix Notation
/*
    - Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana
        dia melakukan operasi terhadap dua data
    - Hampir semua operasi matematika adalah infix notation
    - Di kotlin, kita bisa membuat function infix notation juga
    - Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)
 */

// ## Syarat Function Infix Notation
/*
    - Harus sebagai function member atau function extension
    - Harus memiliki 1 parameter
    - Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
 */


// Contoh infix notation
infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {

    val result = "Yayes Kasnanda Bintang" to "UP"
    println(result)
    /*
        output: YAYES KASNANDA BINTANG
     */

}