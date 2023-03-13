package com.dicoding.kotlin

// ## Lambda Expression
/*
    => Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
    => Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
    => Lambda expression secara sederhana adalah function yang tidak memiliki nama
    => Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan
        mendeklarasikan nama function nya
    => Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya
 */
/*
    // Contoh membuat lambda
    val lambdaName: (String) -> String = { value: String ->
        value.uppercase()
    }
    // mengeksekusi lambda
    val name = lambdaName("Bintang")
    println(name)                       // output: BINTANG
 */

// Contoh function dari luar yang akan dipanggil
fun toUpper(value: String): String = value.uppercase()

fun main() {

    // #1 Contoh lambda dengan 2 parameter
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result.lowercase()
    }
    val result = contohLambda("Yayes", "Kasnanda Bintang")
    println(result)         // output: yayes kasnanda bintang

    // Contoh lain
    val sayWelcome: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "Welcome $firstName $lastName"
        result
    }
    println(sayWelcome("Andi"))                        // output: Welcome Andi
    println(sayWelcome("Budi", "Budiman"))                   // output: Welcome Budi Budiman
    val sapaPelanggan = sayWelcome("Yayes", "Kasnanda Bintang")
    println(sapaPelanggan)              // output: Welcome Yayes Kasnanda Bintang

    // #2 Contoh lambda dengan 1 parameter (parameter diganti dengan "it")
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Bintang"))    // output: Hello Bintang

    // #3 Contoh lambda dengan parameter berupa function lain (menggunakan "::functionName")
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Yayes Kasnanda Bintang"))
    /*
        output: YAYES KASNANDA BINTANG
     */

}