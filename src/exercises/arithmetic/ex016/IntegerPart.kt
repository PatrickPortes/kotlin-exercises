package exercises.arithmetic.ex016

/*
Exercise 016: Integer Part.

Read a number with decimal places and display only its integer part, discarding the fractional part.

Full statement: docs/exercises/TODO
*/

fun main() {

    print("Enter a decimal number: ")
    val decimalNumber = readln().trim().toDoubleOrNull()

    if (decimalNumber == null) {
        println("Invalid input. Please enter a valid decimal number, such as 10.232354.")
        return
    }

    val intNumber = decimalNumber.toInt()
    println("Your number with the decimal part removed is: $intNumber")

}
