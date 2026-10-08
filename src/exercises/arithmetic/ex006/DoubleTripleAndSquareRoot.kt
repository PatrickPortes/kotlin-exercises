package exercises.arithmetic.ex006

/*
Exercise 006: Double Triple and Square Root

Read a numeric value and display twice its value, three times its value, and its square root.

Full statement: docs/exercises/exercise-006.md
*/

import kotlin.math.sqrt

fun main() {

    print("Enter a Number: ")
    val number = readln().trim().toDoubleOrNull()

    if (number == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    val twice = number.toInt() * 2

    val triple = number.toInt() * 3

    val squareRoot = sqrt(number)

    println("The twice of your number: $twice")
    println("The triple of your number: $triple")
    println("The square root of your number: ${"%.1f".format(squareRoot)}")

}
