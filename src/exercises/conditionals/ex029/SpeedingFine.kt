package exercises.conditionals.ex029

import java.util.Locale

/*
Exercise 029: Speeding Fine.

Read a vehicle's speed in km/h. If it exceeds 80 km/h, display a speeding notice and the fine amount, charging BRL 7.00 for each km/h above the limit.

Full statement: docs/exercises/exercise-029.md
*/

fun main() {

    val speedLimit = 80.0
    val finePerKmh = 7.0

    print("Enter the vehicle's speed in km/h: ")
    val speed = readln().trim().toDoubleOrNull()

    if (speed == null || !speed.isFinite() || speed < 0) {
        println("Invalid input. Enter a valid speed.")
        return
    }

    if (speed > speedLimit) {
        val fineAmount = (speed - speedLimit) * finePerKmh
        val formattedFine = String.format(
            Locale.forLanguageTag("pt-BR"),
            "%.2f",
            fineAmount
        )

        println("You were speeding at $speed km/h. The speed limit is $speedLimit km/h.")
        println("Fine amount: R$ $formattedFine")
    } else {
        println("Your speed of $speed km/h is within the limit.")
    }

}
