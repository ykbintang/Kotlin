// ## For Loop
/*
    => Dalam bahasa pemrograman, biasanya ada fitur yang bernama perulangan
    => Salah satu fitur perulangan di Kotlin adalah for
    => For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain-lain)
 */

fun main() {

    val names = arrayOf("Yayes", "Kasnanda", "Bintang", "Andi", "Budi", "Cici")
    var total = 0

    // #1 Contoh for loop
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan = $total")
    /*
        output:
        Yayes
        Kasnanda
        Bintang
        Andi
        Budi
        Cici
        Total perulangan = 6
     */

    // #2 Contoh for loop dengan range
    for (i in 0..100) {
        println(i)
    }
    /*
        output:
        1
        2
        3
        ...
        100
     */

    // #3 Contoh for loop dengan range dan step
    for (i in 100 downTo 0 step 5) {
        println(i)
    }
    /*
        output:
        100
        95
        90
        ...
        0
     */

    // #4 Contoh for loop dengan range yang diambil dari panjang array
    val lengthArray = names.size - 1
    for (i in 0..lengthArray) {
        println("Index $i = ${names.get(i)}")
    }
    /*
        output:
        Index 0 = Yayes
        Index 1 = Kasnanda
        Index 2 = Bintang
        Index 3 = Andi
        Index 4 = Budi
        Index 5 = Cici
     */

}