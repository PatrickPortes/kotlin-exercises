package exercises.strings.ex027

/*
Exercise 027: First and Last Names.

Read a full name and display the first and last names separately.

Full statement: docs/exercises/exercise-027.md
*/

fun main() {

    print("Enter your full name: ")
    val fullName = readln().trim()

    if (fullName.isBlank()) {
        println("Invalid input. Please enter your full name.")
        return
    }

    val firstName = fullName.takeWhile { !it.isWhitespace() }
    val lastName = fullName.takeLastWhile { !it.isWhitespace() }

    println("Your first name is $firstName, and your last name is $lastName")

}
