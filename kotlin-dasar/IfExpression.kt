package com.dicoding.kotlin

fun main() {

    /*
        === #1 If Expression ===
        if (kondisi boolean) {
            // jika kondisi bernilai true
            // maka isi blok if akan dieksekusi
        }
     */
    var nilai = 80

    if (nilai > 75) {
        println("Good Job")
    }
    // output: Good Job

    /*
        === #2 Else Expression ===
        if (kondisi boolean) {
            // jika kondisi bernilai true
            // maka isi blok if akan dieksekusi
        } else {
            // jika kondisi bernilai false
            // maka isi blok else akan dieksekusi
        }
     */
    nilai = 60

    if (nilai > 75) {
        println("Good Job")
    } else {
        println("Silahkan coba lagi tahun depan")
    }
    // output: Silahkan coba lagi tahun depan

    /*
        === #3 Else If Expression ===
        if (kondisi boolean 1) {
            // jika kondisi 1 bernilai true
            // maka isi blok pada kondisi 1 akan dieksekusi
        } else if (kondidi boolean 2) {
            // jika kondisi 2 bernilai true
            // maka isi blok pada kondisi 2 akan dieksekusi
        } else {
            // jika kondisi 1 dan 2 bernilai false
            // maka isi blok else yang akan dieksekusi
        }
     */
    nilai = 93

    if (nilai > 90) {
        println("Cool")
    } else if (nilai > 75) {
        println("Good Job")
    } else if (nilai > 60) {
        println("Not Bad")
    } else {
        println("Silahkan coba lagi tahun depan")
    }
    // output: Cool

}
