package exercises.arithmetic.ex007

/*
Exercise 007: Average of Two Grades

Ask for a student's two grades and display their arithmetic mean.

Full statement: docs/exercises/TODO
*/

fun main() {

    print("Enter your first test score: ")
    val test1: Double? = readln().trim().toDoubleOrNull()

    if (test1 == null || !test1.isFinite() || test1 !in 0.0..10.0) {
        println("Invalid input. Please enter a score between 0 and 10.")
        return
    }

    print("Enter your second test score: ")
    val test2 = readln().trim().toDoubleOrNull()

    if (test2 == null || !test2.isFinite() || test2 !in 0.0..10.0) {
        println("Invalid input. Please enter a score between 0 and 10.")
        return
    }

    val average = (test1 + test2) / 2

    println("Your average score is: $average")

    if (average >= 7.0) {
        println("Congratulations! You're moving on to the next grade!")
    } else {
        println("Sorry! You'll have to repeat the grade.")
    }

}
