// ## Break & Continue
/*
=> Break & continue adalah kata kunci yang bisa digunakan dalam semua perulangan di Kotlin
=> Break digunakan untuk menghentikan seluruh perulangan
=> Continue adalah digunakan untuk menghentikan perulangan yang berjalan, dan langsung
    melanjutkan ke perulangan selanjutnya
 */

fun main() {

    // #1 Break
    var i = 0
    while (true) {
        println("Hello ke $i")
        i++
        if (i > 1000) {
            break
        }
    }
    /*
        output:
        Hello ke 1
        Hello ke 2
        ...
        Hello ke 999
        Hello ke 1000
     */

    // #2 Continue
    for (i in 1..1000) {

        if (i % 2 == 0) {
            continue
        }

        println("Angke ke $i")
    }
    // program diatas tidak akan mengembalikkan nilai i ketika
    // i % 2 == 0 karena diberikan perintah continue (diteruskan),
    // maka program diatas akan memberikan output ketika nilai i
    // berupa angka ganjil (i % 2 != 0)
    /*
        output:
        Angka ke 1
        Angka ke 3
        ...
        Angka ke 997
        Angka ke 999
     */

}