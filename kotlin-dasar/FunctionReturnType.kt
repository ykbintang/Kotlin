// ## Function Return Type
/*
    => Untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan
        tipe data kembalian dari function tersebut
    => Jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka
        wajib di dalam function nya kita harus mengembalikan data
    => Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return,
        diikuti dengan datanya
 */

// Contoh function return type
fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun main() {

    println(jumlahkan(10, 10))          // output: 20
    println(jumlahkan(100, 100))        // output: 200

    val result = jumlahkan(200, 200)
    println(result)                           // output: 400

    val result2 = jumlahkan(5, 5)
    println(result2)                          // output: 10

    println(bagi(100, 10))              // output: 10
    println(bagi(100, 0))               // output: 0

}