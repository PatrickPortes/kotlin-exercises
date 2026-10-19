package exercises.conditionals.ex042

/*
Exercise 042: Triangle Classification.

Extend exercise 035: read three lengths and check whether they form a triangle. If they do, classify it as equilateral if all three sides are equal,
isosceles if exactly two sides are equal, or scalene if all sides are different.

Full statement: docs/exercises/exercise-042.md
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

    if (!canFormTriangle) {
        println("These lengths cannot form a triangle.")
        return
    }

    val triangleType = if (
        firstLength == secondLength && secondLength == thirdLength
    ) {
        "Equilateral"
    } else if (
        firstLength == secondLength ||
        firstLength == thirdLength ||
        secondLength == thirdLength
    ) {
        "Isosceles"
    } else {
        "Scalene"
    }

    println("These lengths form a triangle.")
    println("Triangle type: $triangleType")

}
