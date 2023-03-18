// ## Label
/*
    => Label adalah penanda
    => Semua expression di Kotlin bisa ditandai dengan label
    => Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @
 */
// ## Break, Continue, dan Return pada Label
/*
    => Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
    => Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada,
        namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti
 */

fun main() {

    // #1 Contoh Break pada label
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
    /*
        output: Looping
     */

    // #2 Contoh Continue pada label
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
    /*
        output: Looping
     */

    // #3 Contoh Return pada label
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)
    test("Coba") testlabel@{
        if (it == "") {
            return@testlabel
        } else {
            println("Bintang")
        }
    }
    /*
        output: Bintang
     */

}