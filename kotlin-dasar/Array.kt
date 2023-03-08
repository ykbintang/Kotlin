package com.dicoding.kotlin

fun main() {
    // #1 Membuat Array
    val members: Array<String> = arrayOf("Yayes", "Andi", "Budi")
    val values: Array<Byte> = arrayOf(100, 95, 83)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println(balances[2])    // output: 30000

    // #2 Operasi Array
    val yayes: String = members[0]
    val andi: String = members.get(1)
    val budi: String = members.get(2)

    // mengubah value
    members.set(1, "Kasnanda")
    members[2] = "Bintang"

    // mendapatkan value
    println(members[1])         // output: Kasnanda
    println(andi)               // output: Andi
    println(members.get(0))     // output: Yayes
    println(members[1])         // output: Kasnanda
    println(members.get(2))     // output: Bintang

    // #3 Array Nullable
    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Yayes")
    names.set(1, null)
    names.set(2, "Kasnanda")
    names.set(3, null)
    names.set(4, "Bintang")
//    names.set(5, "Error")     // akan terjadi error karena melebihi nilai parameter

    // mendapatkan ukuran array dengan fungsi ".size"
    println(names.size)     // output: 5
}