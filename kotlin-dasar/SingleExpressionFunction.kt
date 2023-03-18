// ## Single Expression Function
/*
    => Single expression function adalah deklarasi function hanya dengan 1 baris kode
    => Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan)
        setelah deklarasi nama function dan tipe data pengembalian function
 */

// Contoh single expression function
fun kaliDua(a: Int): Int = a * 2
fun sapa(name: String): Unit = println("Hello $name")

fun main() {

    val result = kaliDua(7)
    println(result)                  // output: 14
    sapa("Bintang")            // output: Hello Bintang

}