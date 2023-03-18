// ## Return If & When
/*
    => Kadang salam sebuah function, kita sering menggunakan If expression atau when expression,
        lalu di dalam blok nya kita mengembalikan nilai untuk sebuah function
    => Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin
        mengembalikan nilai dalam if atau when
 */

// #1 Contoh return if
fun sayHello(name: String = ""): String {
    return if (name == "") {
        "Hello Bro!"
    } else {
        "Hello $name"
    }
}

// #2 Contoh return when
fun sayWelcome(name: String = ""): String {
    return when (name) {
        "" -> "Welcome Bro!"
        else -> "Welcome $name"
    }
}

fun main() {

    println(sayHello())                     // output: Hello Bro!
    println(sayHello("Andi"))         // output: Hello Andi

    println(sayWelcome())                   // output: Welcome Bro!
    println(sayWelcome("Budi"))       // output: Welcome Budi

}