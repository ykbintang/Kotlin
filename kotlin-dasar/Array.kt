package com.dicoding.kotlin

// ## Tipe Data Array
/*
    => Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
    => Tipe data array di Kotlin direpresentasikan dengan kata kunci Array

    Daftar operasi array:
    1. size                 -> untuk mendapatkan panjang array
    2. get[index]           -> mendapatkan data di posisi index
    3. [index]              -> mendapatkan data di posisi index
    4. set(index, value)    -> mengubah data di posisi index
    5. [index] = value      -> mengubah data di posisi index
 */

fun main() {
    // #1 Contoh Array
    val members: Array<String> = arrayOf("Yayes", "Andi", "Budi")
    val values: Array<Byte> = arrayOf(100, 95, 83)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println(balances[2])    // output: 30000

    // #2 Contoh Operasi Array
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

    // #3 Contoh Array Nullable
    /*
        => Secara standard data di Array di Kotlin tidak boleh null
        => Jika kita butuh membuat Array yang datanya boleh null, kita bisa menggunakan ? (tanda tanya)
     */
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