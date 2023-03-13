// ## Import
/*
    => Secara standar, file Kotlin hanya bisa mengakses file Kotlin lainnya yang berada dalam package yang sama
    => Jika kita ingin mengakses file Kotlin yang berada diluar package, maka kita bisa menggunakan Import
    => Saat melakukan import, kita bisa memilih ingin meng-import bagian tertentu, atau semua file
 */

// Contoh sebuah import
import com.company.project.*

fun main() {

    // mengakses function dari package lain setelah melakukan import
    sayHello("Andi")

    // mengakses function dari package lain dengan menuliskan nama package nya
    com.company.project.sayWelcome("Yayes", "Kasnanda Bintang")

}