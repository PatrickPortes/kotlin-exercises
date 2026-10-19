package exercises.conditionals.ex043

/*
Exercise 043: Body Mass Index.

Ask for weight in kilograms and height in meters. Calculate the Body Mass Index (BMI)  and display the classification using the exercise's ranges: below 18.5,
“underweight”; from 18.5 to below 25, “ideal weight”; from 25 to below 30, “overweight”; from 30 to below 40, “obesity”; 40 or above, “morbid obesity”.

Full statement: docs/exercises/exercise-043.md
*/

fun main() {
    print("Enter your weight in kilograms: ")
    val weight = readln().trim().toDoubleOrNull()

    print("Enter your height in meters: ")
    val height = readln().trim().toDoubleOrNull()

    if (weight == null || height == null) {
        println("Invalid input. Please enter numeric values.")
        return
    }

    if (!weight.isFinite() || weight <= 0 ||
        !height.isFinite() || height <= 0
    ) {
        println("Weight and height must be positive, finite values.")
        return
    }

    val bmi = weight / (height * height)

    val bmiClassification = when {
        bmi < 18.5 -> "Underweight"
        bmi < 25.0 -> "Ideal weight"
        bmi < 30.0 -> "Overweight"
        bmi < 40.0 -> "Obesity"
        else -> "Morbid obesity"
    }

    println("Your BMI: %.2f".format(bmi))
    println("Classification: $bmiClassification")
}
