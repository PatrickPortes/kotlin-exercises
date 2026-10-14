package exercises.arithmetic.ex018

import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

/*
Exercise 018: Sine, Cosine and Tangent.

Read an angle in degrees and display its sine, cosine, and tangent.

Full statement: docs/exercises/exercise-018.md
*/

fun main() {

    print("Enter the angle in degrees: ")
    val angle = readln().trim().toDoubleOrNull()

    if (angle == null || !angle.isFinite()){
        println("Invalid input. Please enter a valid angle.")
        return
    }

    val radians = Math.toRadians(angle)

    val sine = sin(radians)
    val cosine = cos(radians)
    val tangent = tan(radians)

    println("Sine: %.2f\nCosine: %.2f\nTangent: %.2f\n".format(sine, cosine, tangent))

}
