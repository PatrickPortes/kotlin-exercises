package exercises.strings.ex025

/*
Exercise 025: Name Contains Silva.

Read a person's full name and report whether it contains “Silva”.

Full statement: docs/exercises/exercise-025.md
*/

fun main() {

    print("Enter your full name: ")

    val fullName = readln().trim()

    if (fullName.isBlank()) {
        println("Invalid input")
        return
    }

    val containsSilva = fullName.contains("Silva", ignoreCase = true)

    if (containsSilva) {
        println("Your Name Contains 'Silva'.")
    } else {
        println("Your Name Doesn't Contain 'Silva'.")
    }

}
