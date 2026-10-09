package exercises.conversions.ex008

/*
Exercise 008: Meters to Centimeters and Millimeters.

Read a distance in meters and display its equivalent values in centimeters and millimeters.

Full statement: docs/exercises/exercise-008.md
*/

fun main(){

    print("Enter a distance in meters: ")
    val distanceMeters = readln().trim().toDoubleOrNull()

    if (distanceMeters == null ||
        !distanceMeters.isFinite() ||
        distanceMeters < 0
    ) {
        println("Invalid input. Please enter a finite, non-negative number.")
        return
    }

    val distanceCentimeters = distanceMeters * 100
    val distanceMillimeters = distanceMeters * 1000


    println("$distanceMeters meters distance is equivalent to $distanceCentimeters centimeters")
    println("$distanceMeters meters distance is equivalent to $distanceMillimeters millimeters")

}
