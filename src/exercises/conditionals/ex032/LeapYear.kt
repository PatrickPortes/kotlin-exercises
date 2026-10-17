package exercises.conditionals.ex032

/*
Exercise 032: Leap Year.

Ask for a year and report whether it is a leap year.

Full statement: docs/exercises/exercise-032.md
*/

fun main() {

    print("Enter a year: ")
    val year = readln().trim().toIntOrNull()

    if (year == null || year <= 0) {
        println("Please enter a valid year.")
        return
    }

    val isLeapYear = year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)

    if (isLeapYear) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}
