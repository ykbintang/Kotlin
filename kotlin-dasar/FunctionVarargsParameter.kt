// ## Function Varargs Parameter
/*
    => Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
    => Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
    => Apa bedanya dengan parameter biasa dengan tipe data Array?
        - Jika parameter tipe Array, kita wajib membuat array terlebih dahulu
            sebelum mengirimkan ke function
        - JIka parameter menggunakan varargs, kita bisa langsung mengirim data
            nya, jika lebih dari satu, cukup gunakan tanda koma
 */

// Contoh function varargs parameter
fun hitungNilai(name: String, vararg values: Int) {
    var total = 0
    for (value in values) {
        total += value
    }

    total /= values.size
    println("Nilai $name = $total")
}
// kode diatas adalah contoh program untuk menghitung nilai akhir siswa
// pertama, jumlahkan seluruh nilai yang didapat siswa X
// kemudian, total nilai itu dibagi dengan jumalh ujian yang telah dikerjakan

fun main() {

    /*
    Contoh kasus di kelas X:
        Seluruh siswa telah mengerjakan 5x ujian dengan hasil sebagai berikut:
        1. Andi -> 100, 80, 92, 91, 85
        2. Bintang -> 100, 100, 100, 100, 100
        3. Budi -> 90, 80, 90, 85, 95
     */
    hitungNilai("Andi", 100, 80, 92, 91, 85)            // output: Nilai Andi = 89
    hitungNilai("Bintang",100, 100, 100, 100, 100)      // output: Nilai Bintang = 100
    hitungNilai("Budi", 90, 80, 90, 85, 95)             // output: Nilai Budi = 88

}