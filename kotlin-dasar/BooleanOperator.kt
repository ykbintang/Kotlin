// ## Operaor Logika
/*
    => Operator logika adalah operator untuk dua buah data boolean
    => Hasil dari operator logika adalah boolean lagi

    Daftar Operator Logika:
    && -> (dan)
    || -> (atau)
    !  -> (negasi/not/kebalikan)
 */

fun main() {

    val finalExam = 87
    val attendance = 80
    val extracurricular = 70

    val passFinalExam = finalExam > 75
    val passAttendance = attendance > 75
    val passExtracurricular = extracurricular > 75

    // #1 Contoh operasi AND (&&)
    val passInSchoolA = passFinalExam && passAttendance && passExtracurricular
    println(passInSchoolA)            // output: false

    // #2 Contoh operasi OR (||)
    val passInSchoolB = passFinalExam && passAttendance || passExtracurricular
    println(passInSchoolB)            // output: true

    // #3 Contoh operasi NOT (!)
    val hungry = true
    println(!hungry)            // output: false

}