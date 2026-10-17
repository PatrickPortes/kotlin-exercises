package exercises.conditionals.ex035

/*
Exercise 035: Triangle Feasibility.

Read the lengths of three line segments and report whether they can form a triangle.

Full statement: docs/exercises/exercise-035.md
*/

fun main() {

    print("Enter the first segment length: ")
    val firstLength = readln().trim().toDoubleOrNull()
    print("Enter the second segment length: ")
    val secondLength = readln().trim().toDoubleOrNull()
    print("Enter the third segment length: ")
    val thirdLength = readln().trim().toDoubleOrNull()

    if (firstLength == null || secondLength == null || thirdLength == null) {
        println("Invalid input. Please enter a valid length.")
        return
    }

    if (!firstLength.isFinite() || firstLength <= 0 ||
        !secondLength.isFinite() || secondLength <= 0 ||
        !thirdLength.isFinite() || thirdLength <= 0
    ) {
        println("Please enter valid positive lengths.")
        return
    }

    val canFormTriangle =
        firstLength + secondLength > thirdLength &&
                firstLength + thirdLength > secondLength &&
                secondLength + thirdLength > firstLength

    if (canFormTriangle) {
        println("They can form a triangle!")
    } else {
        println("They cannot form a triangle.")
    }

}
