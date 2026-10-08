package exercises.arithmetic.ex003

/*
Exercise 003: Sum Of Two Numbers.

Read two numeric values, calculate their sum, and display the result.

Full statement: docs/exercises/exercise-003.md
*/

fun main() {

    println("Enter the first number:")
    val num1: Int = readln().toInt()
    println("Enter the second number:")
    val num2: Int = readln().toInt()

    val sum: Int = num1 + num2

    println("The sum of the two numbers entered is: $sum.")

}
