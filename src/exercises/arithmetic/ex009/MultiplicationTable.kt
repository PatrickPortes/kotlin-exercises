package exercises.arithmetic.ex009

/*
Exercise 009: Multiplication Table.

Ask for an integer and display its multiplication table from 1 to 10.

Full statement: docs/exercises/TODO
 */

fun main() {

    print("Enter a Number to Display its Multiplication Table: ")
    val number = readln().trim().toIntOrNull()

    if (number == null) {
        println("Invalid input. Please enter a valid integer.")
        return
    }

    println("The multiplication table for $number from 1 to 10 is:")

    // It's possible to use * instead of ‘times,’ and I'll use a for loop to improve this code in a future exercise.
    println("-----------")
    println("$number x 1 = ${number.times(1)}")
    println("$number x 2 = ${number.times(2)}")
    println("$number x 3 = ${number.times(3)}")
    println("$number x 4 = ${number.times(4)}")
    println("$number x 5 = ${number.times(5)}")
    println("$number x 6 = ${number.times(6)}")
    println("$number x 7 = ${number.times(7)}")
    println("$number x 8 = ${number.times(8)}")
    println("$number x 9 = ${number.times(9)}")
    println("$number x 10 = ${number.times(10)}")
    println("-----------")

}
