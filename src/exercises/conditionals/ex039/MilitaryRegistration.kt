package exercises.conditionals.ex039

import java.time.Year

/*
Exercise 039: Military Registration.

Read a person's birth year and determine their age in the current year. For this exercise, assume military registration takes place at age 18.
Report whether registration is still in the future, is due this year, or is overdue. Also display how many years remain or how many years have passed since the deadline.

Full statement: docs/exercises/exercise-039.md
*/

fun main() {
    val currentYear = Year.now().value
    val registrationAge = 18

    print("Enter your birth year: ")
    val birthYear = readln().trim().toIntOrNull()

    if (birthYear == null || birthYear !in 1..currentYear) {
        println("Invalid input. Enter a year between 1 and $currentYear.")
        return
    }

    val ageThisYear = currentYear - birthYear
    val registrationYear = birthYear + registrationAge

    println("Age reached this year: $ageThisYear")

    when {
        ageThisYear < registrationAge -> {
            val yearsRemaining = registrationYear - currentYear
            println("Your registration is due in $registrationYear.")
            println("Years remaining: $yearsRemaining")
        }

        ageThisYear > registrationAge -> {
            val yearsOverdue = currentYear - registrationYear
            println("Your registration was due in $registrationYear.")
            println("Years overdue: $yearsOverdue")
        }

        else -> {
            println("Your registration is due this year ($currentYear).")
        }
    }
}
