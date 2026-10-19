package exercises.conditionals.ex041

import java.time.Year

/*
Exercise 041: Athlete Category.

Read an athlete's birth year and determine their category based on their age in the current year:
Under 10 for ages up to 9; Under 15 for ages 10 to 14; Junior for ages 15 to 19; Senior for ages 20 to 25; Master for ages above 25.

Full statement: docs/exercises/exercise-041.md
*/

fun main() {

    val currentYear = Year.now().value

    print("Enter the athlete's birth year: ")
    val birthYear = readln().trim().toIntOrNull()

    if (birthYear == null || birthYear !in 1..currentYear) {
        println("Invalid input. Enter a year between 1 and $currentYear.")
        return
    }

    val ageThisYear = currentYear - birthYear

    /*
    val athleteCategory = if (ageThisYear < 10) {
        "Under 10"
    } else if (ageThisYear < 15) {
        "Under 15"
    } else if (ageThisYear < 20) {
        "Junior"
    } else if (ageThisYear <= 25) {
        "Senior"
    } else {
        "Master"
    }
    */

    val athleteCategory = when {
        ageThisYear < 10 -> "Under 10"
        ageThisYear < 15 -> "Under 15"
        ageThisYear < 20 -> "Junior"
        ageThisYear <= 25 -> "Senior"
        else -> "Master"
    }

    println("Age reached this year: $ageThisYear")
    println("Athlete category: $athleteCategory")

}
