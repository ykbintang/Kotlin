package com.dicoding.kotlin

// ## When Expression
/*
    => Selain if expression, untuk melakukan percabangan di Kotlin, kita juga bisa
        menggunakan When Expression
    => When expression sangat sederhana dibandingkan if
    => Biasanya when expression digunakan untuk melakukan pengecekan ke kondisi dalam
        satu variable
 */

fun main() {

    var finalExam = 'A'

    /* #1 Contoh When Expression */
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Input not recognized, enter data correctly")
    }
    // output: Amazing

    /* #2 Contoh When Expression Multiple Option */
    finalExam = 'D'
    when (finalExam) {
        'A', 'B', 'C' -> println("Congratulations, you passed the final exam")
        else -> {
            println("Sorry, you didn't pass the final exam")
        }
    }
    // output: Sorry, you didn't pass the final exam

    /* #3 Contoh When Expression In */
    finalExam = 'B'
    val passValues = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValues -> println("Pass")
        !in passValues -> println("Try Again")
    }
    // output: Pass

    /* #4 contoh When Expression Is */
    val name = "Bintang"
    when (name) {
        is String -> println("This is String")
        !is String -> println("This is not String")
    }
    // output: This is String

    /*
        => Selain pengecekan terhadap variable
        => When juga dapat digunakan sebagai pengganti if else
        => Untuk mengganti if else dengan when, kita tidak perlu menggunakan variable dalam when
     */

    /* #5 Contoh When Sebagai Pengganti If Else */
    val examValue = 55
    when {
        examValue > 90 -> println("Amazing")
        examValue > 75 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next year")
    }
    // output: Try again next year

}
