package com.dicoding.kotlin

fun main() {

    var finalExam = 'A'

    /* #1 When Expression */
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Input not recognized, enter data correctly")
    }
    // output: Amazing

    /* #2 When Expression Multiple Option */
    finalExam = 'D'
    when (finalExam) {
        'A', 'B', 'C' -> println("Congratulations, you passed the final exam")
        else -> {
            println("Sorry, you didn't pass the final exam")
        }
    }
    // output: Sorry, you didn't pass the final exam

    /* #3 When Expression In */
    finalExam = 'B'
    val passValues = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValues -> println("Pass")
        !in passValues -> println("Try Again")
    }
    // output: Pass

    /* #4 When Expression Is */
    val name = "Bintang"
    when (name) {
        is String -> println("This is String")
        !is String -> println("This is not String")
    }
    // output: This is String

    /* #5 When Sebagai Pengganti If Else */
    val examValue = 55
    when {
        examValue > 90 -> println("Amazing")
        examValue > 75 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next year")
    }
    // output: Try again next year

}
