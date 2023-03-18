// ## Function
/*
    => Function adalah sebuah blok kode yang sengaja dibuat dalam program agar bisa
        digunakan berulang-ulang
    => Cara membuat function di Kotlin sangat sederhana, hanya dengan menggunakan kata
        kunci fun lalu diikuti dengan nama function nya dan blok kode isi function nya
    => Setelah membuat function, kita bisa mengeksekusi function tersebut dengan memanggilnya
        menggunakan kata kunci nama function nya
 */

// Contoh function pada kode dibawah adalah helloWorld() dan main()
fun helloWorld() {
    println("Hello World")
    println("Selamat Belajar Kotlin")
}

fun main() {
    helloWorld()
    helloWorld()
    helloWorld()
}

/*
    output:
    Hello World
    Selamat Belajar Kotlin
    Hello World
    Selamat Belajar Kotlin
    Hello World
    Selamat Belajar Kotlin
 */