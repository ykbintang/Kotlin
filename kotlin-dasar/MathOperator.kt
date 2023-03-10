package com.dicoding.kotlin

// ## Operasi Matematika
/*
    Daftar operator matematika:
    + -> penjumlahan
    - -> pengurangan
    * -> perkalian
    / -> pembagian
    % -> sisa hasil bagi
 */

fun main() {

    // #1 Contoh Operasi Matematika
    val result: Int = 10 / 3
    println(result)             // output: 3

    val result1 = 10.0 / 3.0
    println(result1)            // output: 3.3333333333333335

    val result2 = 10 + 10 / 2
    println(result2)            // output: 15

    val result3 = 5 - 1 * 9
    println(result3)            // output: -4

    val result4 = 100 % 7
    println(result4)            // output: 2

    // #2 Contoh Augmented Assignments
    var total: Int = 0

    var barang1 = 300
    total += barang1

    var barang2 = 200
    total -= barang2

    var barang3 = 100
    total += barang3

    println(total)          // output: 200

    // #3 Contoh Unary Operator
    // ++ (increment)
    var a = 10
    a++
    a++
    a++
    println(a)              // output: 13

    // -- (decrement)
    var b = 10
    b--
    b--
    b--
    println(b)              // output: 7

    // ! (boolean kebalikan/not)
    val sehat = true
    println(!sehat)         // output: false

}