package com.dicoding.kotlin

fun main() {

    // #1 String
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
    println(address1)       // output: Kabupaten Klaten, (Enter) ...
    println(address2)       // output: Kabupaten Klaten, (Enter) ...

    // #2 Menggabungkan String
    var firstName: String = "Yayes"
    var lastName: String = "Kasnanda Bintang"

    // var fullName: String = firstName + " " + lastName // tidak direkomendasikan

    var fullName: String = "$firstName $lastName"
    var desc: String = "total karakter dari \"$fullName\" adalah ${fullName.length} karakter"

    println(fullName)   // output: Yayes Kasnanda Bintang
    println(desc)       // output: total karakter dari "Yayes Kasnanda Bintang" adalah 22 karakter

}