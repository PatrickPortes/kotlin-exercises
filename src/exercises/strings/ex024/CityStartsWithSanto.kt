package exercises.strings.ex024

/*
Exercise 024: City Starts with Santo.

Ask for a city's name and report whether it starts with “Santo”.

Full statement: docs/exercises/exercise-024.md
*/

fun main() {

    print("Enter a city name: ")
    val cityName = readln().trim()

    if (cityName.isBlank()) {
        println("Please enter a valid city name.")
        return
    }

    val firstWord = cityName.takeWhile { !it.isWhitespace() }
    val startsWithSanto = firstWord.equals("Santo", ignoreCase = true)

    if (startsWithSanto) {
        println("Your city name starts with 'New'.")
    } else {
        println("Your city name doesn't start with 'New'.")
    }

}
