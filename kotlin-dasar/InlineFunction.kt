// #1 Inline Function
/*
    => Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna.
    => Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi berjalan,
        karena harus membuat object lambda berulang-ulang. Jika penggunaannya tidak terlalu banyak
        mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
    => Inline Functions adalah kemampuan di Kotlin yang mengubah Higher-Order Function menjadi Inline Function
    => Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada
        saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang
 */

// #2 Noinline
/*
    => Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
    => Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai
        parameter tersebut dengan kata kunci noinline
 */

// Contoh tidak menggunakan Inline Function
fun sayHello(name: () -> String): String {
    return "Hello ${name()}"
}

// Contoh Inline Function
inline fun sayWelcome(name: () -> String): String {
    return "Welcome ${name()}"
}
/*
    Bandingkan kode diatas dengan melihat bytecode kotlin nya, dengan cara pergi ke
    Tools > Kotlin > Show Kotlin Bytecode. Disitu akan terlihat perbedaan ketika menggunakan
    inline function dan ketika tidak menggunakannya
 */

// Contoh Inline Function dengan parameter diberi noinline
inline fun sayCongrats(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Congratulations ${firstName()} ${lastName()}"
}

fun main() {

    // mengakses function biasa
    println(sayHello { "Andi" })        // output: Hello Andi
    println(sayHello { "Bintang" })     // output: Hello Bintang

    for (i in 0..100) {
        println(sayHello { "Cici" })    // output: Hello Cici (looping 100x)
    }
    /*
        Ketika mengakses looping sebuah function biasa, compiler akan membuat sebuah Function0
        sebanyak jumlah looping, jadi hal ini akan memperlambat kinerja program.
        Bisa dilihat di kotlin bytecode > decompile.
     */

    // mengakses inline function
    println(sayWelcome { "Andi" })          // output: Welcome Andi
    println(sayWelcome { "Bintang" })       // output: Welcome Bintang

    for (i in 0..100) {
        println(sayWelcome { "Cici" })      // output: Welcome Cici (looping 100x)
    }
    /*
        Ketika mengakses looping sebuah inline function, compiler akan menduplikat (copy) function yang
        diakses kedalam sebuah perulangan (loop), efeknya adalah ukuran file menjadi sedikit lebih besar,
        tetapi performa program akan jauh lebih cepat daripada tidak menggunakan inline function
        Bisa dilihat di kotlin bytecode > decompile.
     */
    // Gunakan inline dengan bijak ketika butuh saja. Seperti contoh kasus diatas melakukan looping sebuah
    // function sebanyak 100x jadi sebaiknya menggunakan inline function

    // mengakses inline function dengan dibebri parameter noinline
    for (i in 0..100) {
        println(sayCongrats({ "Yayes" }, { "Kasnanda Bintang" }))
    }
    /*
        Lihat perbedaannya di kotlin bytecode. Ketika diberi noinline maka parameter tersebut akan sama seperti
        looping function biasa yaitu membuat sebuah Function0, karena secara default inline function akan membuat
        semua parameternya menjadi inline juga.
     */
}