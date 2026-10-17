package exercises.conditionals.ex031

/*
Exercise 031: Trip Fare.

Read a trip's distance in kilometers and calculate the fare. For distances up to 200 km, charge BRL 0.50 per kilometer;
for longer distances, charge BRL 0.45 per kilometer for the entire trip.

Full statement: docs/exercises/exercise-031.md
*/

fun main() {

    val distanceLimit = 200.0

    print("Enter the trip distance in kilometers: ")
    val distance = readln().trim().toDoubleOrNull()

    if (distance == null || !distance.isFinite() || distance < 0) {
        println("Invalid input. Please enter a valid trip distance.")
        return
    }

    val ratePerKm = if (distance <= distanceLimit) {
        0.50
    } else {
        0.45
    }

    val fare = distance * ratePerKm

    println("The fare for your trip is R$ %.2f.".format(fare))

}
