// ## Function Named Argument
/*
    => Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil
        function, dengan demikian kita tidak wajib tahu posisi tiap parameter
 */

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Yayes", "Kasnanda", "Bintang")

    // Contoh function named argument
    fullName(
        lastName = "Bintang",
        firstName = "Yayes",
        middleName = "Kasnanda"
    )
    /*
        output:
        Hello Yayes Kasnanda Bintang
        Hello Yayes Kasnanda Bintang
     */
}