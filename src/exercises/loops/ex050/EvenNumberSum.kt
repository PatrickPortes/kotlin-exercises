package exercises.loops.ex050

/*
Exercise 050: Even Number Sum.

Ask for six integers and display the sum of only the even values. Ignore odd values when calculating the sum.

Full statement: docs/exercises/exercise-050.md
*/

fun main() {
    var sum = 0L

    for (position in 1..6) {
        print("Enter integer $position of 6: ")
        val number = readln().trim().toIntOrNull()

        if (number == null) {
            println("Invalid input. Please enter an integer.")
            return
        }

        if (number % 2 == 0) {
            sum += number
        }
    }

    println("Sum of the even numbers: $sum")
}
