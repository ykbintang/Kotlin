// ## Tipe Data Range
/*
    => Kadang kita ingin membuat array yang berisi data yang angka berurutan
    => Membuat array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang berurutannya sangat banyak, misal dari 1 sampai 1000
    => Kotlin mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini
    => Cara membuat range di Kotlin sangat mudah cukup menggunakan tanda .. (titik dua kali) :
        - 0..10 : Range dari 0 sampai 10
        - 1..100 : Range dari 1 sampai 100
 */

fun main() {

    // #1 Contoh Range (rentang)
    val range = 0..100

    // #2 Contoh Operasi Range
    // count() -> mendapatkan total data di range
    println(range.count())      // output: 101

    // contains(value) -> mengecek apakah terdapat value tersebut
    println(range.contains(50))     // output: true
    println(range.contains(200))    // output: false

    // first -> mendapatkan nilai pertama
    println(range.first)        // output: 0

    // last -> mendapatkan nilai terakhir
    println(range.last)         // output: 100

    // step -> mendapatkan nilai tiap kenaikan
    println(range.step)         // output: 1

    // #3 Contoh Range Terbalik
    val reverseRange = 1000 downTo 0

    println(reverseRange.count())           // output: 1001
    println(reverseRange.contains(200))     // output: true
    println(reverseRange.contains(500))     // output: true
    println(reverseRange.first)             // output: 1000
    println(reverseRange.last)              // output: 0
    println(reverseRange.step)              // output: -1

    // #4 Contoh Range Dengan Step
    val rangeWithStep1 = 0..100 step 2

    println(rangeWithStep1.count())           // output: 51
    println(rangeWithStep1.contains(50))      // output: true
    println(rangeWithStep1.contains(80))      // output: true
    println(rangeWithStep1.first)             // output: 0
    println(rangeWithStep1.last)              // output: 100
    println(rangeWithStep1.step)              // output: 2

    val rangeWithStep2 = 1000 downTo 0 step 5

    println(rangeWithStep2.count())           // output: 201
    println(rangeWithStep2.contains(200))     // output: true
    println(rangeWithStep2.contains(500))     // output: true
    println(rangeWithStep2.first)             // output: 1000
    println(rangeWithStep2.last)              // output: 0
    println(rangeWithStep2.step)              // output: -5

    println(range)                      // output: 0..100
    println(reverseRange)               // output: 1000 downTo 0 step 1
    println(rangeWithStep1)             // output: 0..100 step 2
    println(rangeWithStep2)             // output: 1000 downTo 0 step 5

}