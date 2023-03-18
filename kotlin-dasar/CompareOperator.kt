// ## Operator Perbandingan
/*
    => Operasi perbandingan adalah operasi untuk membandingkan dua buah data
    => Operasi perbandingan adalah operasi yang menghasilkan nilai boolean (benar atau salah)
    => Jika hasil operasinya adalah benar, maka nilainya adalah true
    => Jika hasil operasinya adalah salah, maka nilainya adalah false

    Daftar Operator Perbandingan:
    > (lebih dari)
    < (kurang dari)
    >= (lebih dari sama dengan)
    <= (kurang dari sama dengan)
    == (sama dengan)
    != (tidak sama dengan)
 */

fun main() {

    val a = 100
    val b = 200

    // Contoh Operator Perbandingan
    val result: Boolean = a > b
    println(result)                 // output: false

    println(100 >= 100)             // output: true
    println(100 <= 100)             // output: true

    println("Budi" == "budi")       // output: false
    println("Budi" != "budi")       // output: true

}