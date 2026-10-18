package exercises.conditionals.ex037

/*
Exercise 037: Number Base Conversion.

Read an integer and ask for the desired base: option 1 for binary, 2 for octal, and 3 for hexadecimal. Display the number converted to the selected base.

Full statement: docs/exercises/exercise-037.md
*/

fun main() {

    print("Enter an integer: ")
    val number = readln().trim().toIntOrNull()

    if (number == null) {
        println("Invalid input. Please enter an integer.")
        return
    }

    println()
    println("Choose the target base:")
    println("1 - Binary")
    println("2 - Octal")
    println("3 - Hexadecimal")
    print("Enter your choice: ")

    val choice = readln().trim().toIntOrNull()

    val base = when (choice) {
        1 -> 2
        2 -> 8
        3 -> 16
        else -> {
            println("Invalid option. Please choose 1, 2, or 3.")
            return
        }
    }

    val convertedNumber = number.toString(base).uppercase()

    println("$number in base $base: $convertedNumber")

}
