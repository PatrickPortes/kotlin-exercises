package exercises.conditionals.ex033

/*
Exercise 033: Largest and Smallest Values.

Read three numeric values and display the largest and smallest values.

Full statement: docs/exercises/exercise-033.md
*/

fun main() {

    print("Enter the first value: ")
    val firstValue = readln().trim().toDoubleOrNull()
    print("Enter the second value: ")
    val secondValue = readln().trim().toDoubleOrNull()
    print("Enter the third value: ")
    val thirdValue = readln().trim().toDoubleOrNull()

    if (firstValue == null || secondValue == null || thirdValue == null) {
        println("Invalid input. Please enter valid numbers for all three values.")
        return
    }

    val largest = maxOf(firstValue, secondValue, thirdValue)
    val smallest = minOf(firstValue, secondValue, thirdValue)

    println("Largest value: $largest")
    println("Smallest value: $smallest")

}
