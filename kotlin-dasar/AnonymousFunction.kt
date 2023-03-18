// ## Anonymous Function
/*
    => Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
    => Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa
        mengembalikan hasil dimanapun
    => Untuk hal ini, kita bisa menggunakan Anonymous Function
    => Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja
        yang sedikit beda, masih menggunakan kata kunci fun
 */

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // #1 Contoh anonymous function
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }
        return value.uppercase()
    }

    val result1 = hello("Budi", anonymousUpper)
    println(result1)        // output: Hello BUDI

    // Contoh lain
    val lower = fun(value: String): String {
        return if (value == "") {
            "Ups"
        } else {
            value.lowercase()
        }
    }
    println(hello("Bintang", lower))        // output: Hello bintang
    println(hello("", lower))               // output: Hello Ups

    // #2 Contoh anonymous function sebagai parameter
    val upper = hello("Andi", fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }
        return value.uppercase()
    })
    println(upper)          // output: Hello ANDI

}