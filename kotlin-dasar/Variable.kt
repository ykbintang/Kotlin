// ## Variable
/*
    => Variable adalah tempat untuk menyimpan data
    => Kotlin mendukung 2 jenis variabel; Mutable (bisa diubah) dan Immutable (tidak bisa diubah).
    => Untuk membuat variable Mutable, di kotlin bisa menggunakan kata kunci var
    => Untuk membuat variable Immutable, di kotlin bisa menggunakan kata kunci val

    Deklarasi variable:
    val/var namaVariable : TipeData = data
 */

// ## Nullable
/*
    => Secara standar, variable di Kotlin harus dideklarasikan / diinisialisasikan nilai nya
    => Jika saat membuat variable, tidak diberi nilai, maka akan error
    => Kotlin mendukung variable yang boleh null (tidak memiliki data)
    => Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable bisa null
    => Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya.
    => Penggunaan  fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java
 */

// ## Variable Constant
/*
    => Constant adalah Immutable data, yang biasanya diakses untuk keperluan global.
    => Global artinya bisa diakses dimanapun
    => Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE
        dalam pembuatan nama variable constant nya
 */

fun main() {

    // #1 Contoh Variable Mutable (dapat diubah)
    var firstName: String = "Yayes"
    var lastName = "Bintang"

    //mengubah variable
    lastName = "Kasnanda Bintang"
    println(lastName)       // output: Kasnanda Bintang

    // #2 Contoh Variable Immutable (tidak dapat diubah)
    val firstName = "Yayes"
    val lastName = "Bintang"

    // error jika mengubah variable
    lastName = "Kasnanda Bintang"   // error karena mengubah variable "val" yang bersifat immutable

    // #3 Contoh Nullable
    var firstName: String? = "Yayes"
    println(firstName)      // output: Yayes
    firstName = null

    // error karena firstName bernilai null
    println(firstName.length)       // error
    // cara mengakses yang benar
    println(firstName?.length)      // output: null

}

// #4 Contoh Variable Constant
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    println("Welcome to $APP version $VERSION")
    // output: Welcome to Belajar Kotlin version 0.0.1

}