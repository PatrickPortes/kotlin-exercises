package exercises.arithmetic.ex011

/*
Exercise 011: Wall Area and Paint Required.

Ask for a wall's width and height in meters. Display its area and the amount of paint required, assuming each liter covers 2 square meters.

Full statement: docs/exercises/TODO
*/

fun main() {

    print("Enter the wall's width in meters: ")
    val wallWidth = readln().trim().toDoubleOrNull()

    print("Enter the wall's height in meters: ")
    val wallHeight = readln().trim().toDoubleOrNull()

    if (wallWidth == null || wallHeight == null) {
        println("Invalid input. Please enter valid numbers for the wall's width and height.")
        return
    }

    val area = wallWidth * wallHeight

    val paintLiter = area / 2

    println("The wall's area is $area m², and you need $paintLiter liters of paint.")
}
