package exercises.conditionals.ex030

/*
Exercise 030: Even or Odd.

Ask for an integer and report whether it is even or odd.

Full statement: docs/exercises/exercise-030.md
*/

fun main() {

    println("-=--=--=--=--=-")
    println("Even Or Odd:")
    println("-=--=--=--=--=-")

    print("Enter a Number: ")
    val number = readln().trim().toIntOrNull()

    if (number == null) {
        println("Invalid input. Please enter an integer.")
        return
    }

    if (number % 2 == 0) {
        println("The number is even.")
    } else {
        println("The number is odd.")
    }

}
