// ## If Expression
/*
    => Dalam Kotlin, if adalah salah satu kata kunci yang digunakan untuk percabangan
    => Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
    => Hampir di semua bahasa pemrograman mendukung if expression
 */

fun main() {

    /*
        === Struktur If Expression ===
        if (kondisi boolean) {
            // jika kondisi bernilai true
            // maka isi blok if akan dieksekusi
        }
     */

    // #1 Contoh if expression
    var nilai = 80
    if (nilai > 75) {
        println("Good Job")
    }
    // output: Good Job

    /*
        === Struktur If Else Expression ===
        if (kondisi boolean) {
            // jika kondisi bernilai true
            // maka isi blok if akan dieksekusi
        } else {
            // jika kondisi bernilai false
            // maka isi blok else akan dieksekusi
        }
     */

    // #2 Contoh if else expression
    nilai = 60
    if (nilai > 75) {
        println("Good Job")
    } else {
        println("Silahkan coba lagi tahun depan")
    }
    // output: Silahkan coba lagi tahun depan

    /*
        === Stuktur Else If Expression ===
        if (kondisi boolean 1) {
            // jika kondisi 1 bernilai true
            // maka isi blok pada kondisi 1 akan dieksekusi
        } else if (kondidi boolean 2) {
            // jika kondisi 2 bernilai true
            // maka isi blok pada kondisi 2 akan dieksekusi
        } else {
            // jika kondisi 1 dan 2 bernilai false
            // maka isi blok else yang akan dieksekusi
        }
     */

    // #3 Contoh else if expression
    nilai = 93
    if (nilai > 90) {
        println("Cool")
    } else if (nilai > 75) {
        println("Good Job")
    } else if (nilai > 60) {
        println("Not Bad")
    } else {
        println("Silahkan coba lagi tahun depan")
    }
    // output: Cool

}
