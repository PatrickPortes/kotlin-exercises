package exercises.fundamentals.ex002


/*
Exercise 002: Personalized greeting.

Ask for the user's name and display a personalized greeting using that name.
Full statement: docs/exercises/exercise-002.md
*/


fun main() {

    println("Enter your name? ")

    val name: String = readln()

    print("Hello $name. Nice to meet you!!!")

}