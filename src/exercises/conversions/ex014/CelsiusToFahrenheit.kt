package exercises.conversions.ex014

/*
Exercise 014: Celsius to Fahrenheit.

Read a temperature in degrees Celsius and display its equivalent in degrees Fahrenheit.

Full statement: docs/exercises/TODO
*/

fun main() {

    println("Enter the temperature in degrees Celsius to convert to Fahrenheit: ")
    print("Celsius (ºC): ")
    val tempCelsius = readln().trim().toDoubleOrNull()

    if (tempCelsius == null ||
        !tempCelsius.isFinite()
    ) {
        println("Invalid input. Please enter a valid temperature.")
        return
    }

    val tempFahrenheit = ((9 * tempCelsius) / 5) + 32
    println("$tempCelsius°C is equivalent to $tempFahrenheit°F.")

}
