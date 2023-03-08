package com.dicoding.kotlin

fun main() {
//    var firstName: String = "Yayes"
//    var lastName: String = "Bintang"
//    var fullName: String = "Yayes Kasnanda Bintang"
//    var address1: String = """
//        Kabupaten Klaten,
//        Provinsi Jawa Tengah,
//        Negara Indonesia
//    """.trimIndent()
//    var address2: String = """
//        >Kabupaten Klaten,
//        >Provinsi Jawa Tengah,
//        >Negara Indonesia
//    """.trimMargin(">")
//
//    println(firstName)
//    println(lastName)
//    println(fullName)
//    println(address1)
//    println(address2)

    // menggabungkan string
    var firstName: String = "Yayes"
    var lastName: String = "Kasnanda Bintang"
    
    // var fullName: String = firstName + " " + lastName // tidak direkomendasikan

    var fullName: String = "$firstName $lastName"
    var desc: String = "total karakter dari \"$fullName\" adalah ${fullName.length} karakter"

    println(fullName)
    println(desc)
}