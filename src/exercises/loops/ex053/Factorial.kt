package exercises.loops.ex053

/*
Exercise 053: Factorial.

Calculate n! using a loop and Long, for n from 0 to 20. Reject values outside this range and invalid input. Treat 0! as 1.
Explain why accepting 21 without changing the representation would cause a problem.

Full statement: docs/exercises/exercise-053.md
*/

fun main() {

    print("Enter your N!: ")
    val number = readln().toIntOrNull()

    if (number == null || number !in 0..20) {
        println("Invalid input")
        return
    }

    var factorial = 1L

    for (factor in 1 .. number) {
        factorial *= factor
    }

    println("$number! = $factorial")

}
