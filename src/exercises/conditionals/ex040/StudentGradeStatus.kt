package exercises.conditionals.ex040

/*
Exercise 040: Student Grade Status.

Ask for two grades and display their arithmetic mean and the student's status: failed for a mean below 5;
remedial assessment required for a mean of at least 5 but below 7; passed for a mean of 7 or above.

Full statement: docs/exercises/exercise-040.md
*/

fun main() {
    print("Enter your first grade: ")
    val firstGrade = readln().trim().toDoubleOrNull()

    print("Enter your second grade: ")
    val secondGrade = readln().trim().toDoubleOrNull()

    if (firstGrade == null || secondGrade == null) {
        println("Invalid input. Please enter numeric grades.")
        return
    }

    // Assuming grades range from 0 to 10.
    if (!firstGrade.isFinite() || firstGrade !in 0.0..10.0 ||
        !secondGrade.isFinite() || secondGrade !in 0.0..10.0
    ) {
        println("Invalid grades. Please enter values from 0 to 10.")
        return
    }

    val average = (firstGrade + secondGrade) / 2.0

    val studentStatus = when {
        average >= 7.0 -> "Passed."
        average >= 5.0 -> "Remedial assessment required."
        else -> "Failed."
    }

    println("Average: %.2f".format(average))
    println("Status: $studentStatus")
}
