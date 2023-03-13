// ## Package
/*
    => Package adalah tempat yang bisa digunakan untuk mengorganisir kode program yang kita buat di Kotlin
    => Dengan menggunakan package, kita bisa merapikan kode program Kotlin yang kita buat
    => Penamaan package di Kotlin biasanya menggunakan huruf kecil semua
    => Jika ingin membuat sub package bisa menggunakan tanda . (titik)
 */

// Contoh sebuah package
package com.company.project

fun sayHello(name: String) {
    println("Hello $name")
}

fun sayWelcome(firstName: String, lastName: String) {
    println("Welcome $firstName $lastName")
}