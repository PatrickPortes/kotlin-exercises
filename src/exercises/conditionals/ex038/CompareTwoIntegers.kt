package exercises.conditionals.ex038

/*
Exercise 038: Compare Two Integers.

Ask for two integers and report whether the first is larger, the second is larger, or both are equal.

Full statement: docs/exercises/exercise-038.md
*/

fun main() {

    print("Enter the first integer: ")
    val firstInteger = readln().trim().toIntOrNull()

    print("Enter the second integer: ")
    val secondInteger = readln().trim().toIntOrNull()

    if (firstInteger == null || secondInteger == null) {
        println("Invalid input. Please enter two integers.")
        return
    }

    when {
        firstInteger > secondInteger ->
            println("The first number ($firstInteger) is larger.")

        secondInteger > firstInteger ->
            println("The second number ($secondInteger) is larger.")

        else ->
            println("Both numbers are equal ($firstInteger).")
    }

}
