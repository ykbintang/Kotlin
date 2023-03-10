package com.dicoding.kotlin

// ## Tipe Data String
/*
    => Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
    => Di kotlin, tipe data string direpresentasikan dengan kata kunci String.
    => Untuk membuat string di kotlin, kita bisa menggunakan
        - “ (tanda petik 2) untuk teks satu baris
        - “”” (tanda petik 2 sebanyak 3 kali) untuk teks lebih dari satu baris
 */

fun main() {

    // #1 Contoh String
    var firstName: String = "Yayes"
    var lastName: String = "Bintang"
    var fullName: String = "Yayes Kasnanda Bintang"
    var address1: String = """
        Kabupaten Klaten,
        Provinsi Jawa Tengah,
        Negara Indonesia
    """.trimIndent()
    var address2: String = """
        >Kabupaten Klaten,
        >Provinsi Jawa Tengah,
        >Negara Indonesia
    """.trimMargin(">")

    println(firstName)      // output: Yayes
    println(lastName)       // output: Bintang
    println(fullName)       // output: Yayes Kasnanda Bintang
    println(address1)       /* output: Kabupaten Klaten,
                                        Provinsi Jawa Tengah,
                                        Negara Indonesia */
    println(address2)       /* output: Kabupaten Klaten,
                                        Provinsi Jawa Tengah,
                                        Negara Indonesia */

    // #2 Contoh Menggabungkan String
    var firstName: String = "Yayes"
    var lastName: String = "Kasnanda Bintang"

    // var fullName: String = firstName + " " + lastName // tidak direkomendasikan

    var fullName: String = "$firstName $lastName"
    var desc: String = "total karakter dari \"$fullName\" adalah ${fullName.length} karakter"

    println(fullName)   // output: Yayes Kasnanda Bintang
    println(desc)       // output: total karakter dari "Yayes Kasnanda Bintang" adalah 22 karakter

}