package exercises.arithmetic.ex005

/*
Exercise 005: Predecessor and Successor.

Ask for an integer and display the integers immediately before and after it.

Full statement: docs/exercises/exercise-005.md
*/

fun main() {

    print("Enter an integer: ")
    val number = readln().trim().toIntOrNull()

    if (number == null) {
        println("Invalid input. Please enter a valid integer.")
        return
    }

    val predecessor = number - 1
    val successor = number + 1

    println("The Predecessor of $number is $predecessor")
    println("The Successor of $number is $successor")

}
