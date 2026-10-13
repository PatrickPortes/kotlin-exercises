package exercises.arithmetic.ex015

/*
Exercise 015: Car Rental Cost.

Ask for the number of days a car was rented and the distance traveled in kilometers. Display the total cost, charging BRL 60.00 per day and BRL 0.15 per kilometer.

Full statement: docs/exercises/exercise-015.md
*/

fun main() {

    print("How many days did you rent the car for? ")
    val days = readln().trim().toIntOrNull()

    print("How many kilometers did you drive? ")
    val km = readln().trim().toDoubleOrNull()

    if (days == null || km == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    val cost = (60.00 * days) + (0.15 * km)

//  println("The total cost is R$${cost}.")

//  Display the total cost with two decimal places.
    println("The total cost is R$%.2f.".format(cost))

}
