package exercises.arithmetic.ex023

/*
Exercise 023: Integer Digits.

Read an integer from 0 to 9999 and separately display its ones, tens, hundreds, and thousands digits.

Full statement: docs/exercises/exercise-023.md
*/

fun main() {

    print("Enter an integer from 0 to 9999: ")
    val number = readln().trim().toIntOrNull()

    if(number == null || number > 9999 || number < 0) {
        print("Number must be between 0 and 9999.")
        return
    }

    val ones = number % 10
    val tens = (number / 10) % 10
    val hundreds = (number / 100) % 10
    val thousands = number / 1000

    println("Ones: $ones")
    println("Tens: $tens")
    println("Hundreds: $hundreds")
    println("Thousands: $thousands")

}
