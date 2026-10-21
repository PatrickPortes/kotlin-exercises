package exercises.loops.ex049

/*
Exercise 049: Multiplication Table with For.

Redo exercise 009: ask for an integer and display its multiplication table from 1 to 10. This time, use a for loop.

Full statement: docs/exercises/exercise-049.md
*/

fun main() {

    print("Enter a Number to Display its Multiplication Table: ")
    val number = readln().trim().toIntOrNull()

    if (number == null) {
        println("Invalid input. Please enter a valid integer.")
        return
    }

    println("The multiplication table for $number from 1 to 10 is:")
    println("-----------")
    for (multiplier in 1..10) {
        println("$number x $multiplier = ${number.toLong() * multiplier}")
    }
    println("-----------")

}
