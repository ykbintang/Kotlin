// ## Function Default Parameter
/*
    => Di Kotlin, function parameter wajib diisi ketika memanggil function
    => Namun kita juga bisa memasukkan nilai default pada parameter, dengan demikian saat
        memanggil function tersebut, kita tidak wajib memasukkan nilai pada parameter nya
    => Default parameter ini cocok pada jenis parameter yang sekiranya memang tidak wajib
        untuk diisi
 */

// Contoh function default parameter pada kode dibawah adalah null
fun sayWelcome(firstName: String, lastName: String? = null){
    if (lastName == null) {
        println("Welcome $firstName")
    } else {
        println("Welcome $firstName $lastName")
    }
}

fun main() {
    sayWelcome("Yayes", "Kasnanda Bintang")
    sayWelcome("Bagas")
    sayWelcome("Budi", "Tarmidji")
}
/*
    output:
    Welcome Yayes Kasnanda Bintang
    Welcome Bagas
    Welcome Budi Tarmidji
 */