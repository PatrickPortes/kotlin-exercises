package exercises.arithmetic.ex017

import kotlin.math.hypot

/*
Exercise 017: Hypotenuse.

Ask for the lengths of the two legs of a right triangle and determine the length of its hypotenuse.

Full statement: docs/exercises/exercise-017.md
*/

fun main() {

    print("Enter the length of the first leg of the right triangle: ")
    val firstLength = readln().trim().toDoubleOrNull()

    print("Enter the length of the second leg of the right triangle: ")
    val secondLength = readln().trim().toDoubleOrNull()

    if (firstLength == null || secondLength == null) {
        println("Invalid input. Please enter a valid length.")
        return
    }

/*
    val hypotenuse = kotlin.math.sqrt(
        firstLength * firstLength + secondLength * secondLength
    )
*/

    val hypotenuse = hypot(firstLength, secondLength)

    System.out.printf("The hypotenuse is: %.2f", hypotenuse)
    //println("The hypotenuse is: %.2f".format(hypotenuse))

}
