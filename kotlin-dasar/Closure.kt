// ## Closure
/*
    => Closure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi
        dengan data-data disekitarnya dalam scope yang sama
    => Harap gunakan fitur closure ini dengan bijak saat kita membuat aplikasi
 */

fun main() {

    var counter: Int = 0

    // #1 Contoh closure
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        // closure
        counter++
    }

    // #2 Contoh closure dengan anonymous function
    val anonymousIncrement = fun() {
        println("Anonymous Function Increment")
        // closure
        counter++
    }

    /*
        Ketika kita mengakses closure maka secara sengaja/tidak kita akan merubah data
        lain yang berada di scope yang sama contoh pada kode diatas adalah kita mengakses
        fungsi counter++ (increment) yang akan mengubah data counter yang sebelumnya bernilai 0
     */
    // Dibawah ini kita akan coba akses closure sebanyak 6x, lalu print variable counter dan lihat hasilnya
    lambdaIncrement()           // output: Lambda Increment
    anonymousIncrement()        // output: Anonymous Function Increment
    lambdaIncrement()           // output: Lambda Increment
    anonymousIncrement()        // output: Anonymous Function Increment
    lambdaIncrement()           // output: Lambda Increment
    anonymousIncrement()        // output: Anonymous Function Increment

    println(counter)            // output: 6

}