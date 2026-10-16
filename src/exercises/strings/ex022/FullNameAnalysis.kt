package exercises.strings.ex022

/*
Exercise 022: Full Name Analysis.

Ask for a full name. Display an uppercase version, a lowercase version, the total number of letters excluding spaces, and the number of letters in the first name.

Full statement: docs/exercises/exercise-022.md
*/

fun main() {

    print("Enter your full name: ")

    val fullName = readln().trim()

    if (fullName.isBlank()) {
        println("Invalid input. Please enter your full name.")
        return
    }

    val totalLetters = fullName.count { !it.isWhitespace() }
    val firstName = fullName.takeWhile { !it.isWhitespace() }

    println("Uppercase Version: ${fullName.uppercase()}")
    println("Lowercase Version: ${fullName.lowercase()}")
    println("Total Number of Letters Excluding Spaces: $totalLetters")
    println("Number of letters in your first name: ${firstName.length}")

}
