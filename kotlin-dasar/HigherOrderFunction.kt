package com.dicoding.kotlin

// ## Higher-Order Functions
/*
    => Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
    => Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang general dan ingin
        mendapatkan input yang flexible beruba lambda, yang bisa dideklarasikan oleh si user ketika memanggil function tersebut
 */

fun main() {

    // #1 Contoh Higher-Order Function
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }

    println(hello("Bintang", upperTransformer))     // output: Hello BINTANG
    println(hello("Bintang", lowerTransformer))     // output: Hello bintang

    // Tidak direkomendasikan karena expression didalam tanda kurung "()", sebaiknya dipisah
    println(hello("Andi", { value: String -> value.lowercase() }))
    /*
        output: Hello andi
     */

    // #2 Contoh Trailing Lambda
    val result1 = hello("Budi") { value: String -> value.uppercase() }
    val result2 = hello("Cici") { value: String ->
        value.lowercase()
    }

    println(result1)        // output: Hello BUDI
    println(result2)        // output: Hello cici

}