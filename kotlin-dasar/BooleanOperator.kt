package com.dicoding.kotlin

/*
    Daftar Operasi Boolean:
    && -> (dan)
    || -> (atau)
    !  -> (negasi)
 */

fun main() {

    val finalExam = 87
    val attendance = 80
    val extracurricular = 70

    val passFinalExam = finalExam > 75
    val passAttendance = attendance > 75
    val passExtracurricular = extracurricular > 75

    // #1 && (AND)
    val passInSchoolA = passFinalExam && passAttendance && passExtracurricular
    println(passInSchoolA)            // output: false

    // #2 || (OR)
    val passInSchoolB = passFinalExam && passAttendance || passExtracurricular
    println(passInSchoolB)            // output: true

    // #3 ! (NOT)
    val hungry = true
    println(!hungry)            // output: false

}