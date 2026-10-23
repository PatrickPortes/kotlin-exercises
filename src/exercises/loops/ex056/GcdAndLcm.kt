package exercises.loops.ex056

/*
Exercise 056: GCD and LCM.

Calculate the GCD and LCM of two integers from 0 to 1,000,000 without built-in functions for those operations.
Define GCD(0,0) = 0 and LCM(a,0) = 0. Use Long for intermediate LCM calculations.

Full statement: docs/exercises/exercise-056.md
*/

fun main() {
    println("======================")
    println("GCD and LCM Calculator")
    println("======================")
    println()

    print("Enter the first integer (0 to 1,000,000): ")
    val firstNumber = readln().trim().toIntOrNull()

    print("Enter the second integer (0 to 1,000,000): ")
    val secondNumber = readln().trim().toIntOrNull()

    if (firstNumber == null || secondNumber == null ||
        firstNumber !in 0..1_000_000 ||
        secondNumber !in 0..1_000_000
    ) {
        println("Invalid input. Enter integers from 0 to 1,000,000.")
        return
    }

    var a: Int = firstNumber
    var b: Int = secondNumber

    // Euclid's algorithm: repeat until the remainder is zero.
    while (b != 0) {
        val remainder = a % b
        a = b
        b = remainder
    }

    val gcd: Int = a

    // Handle zero separately to avoid division by zero.
    val lcm: Long = if (firstNumber == 0 || secondNumber == 0) {
        0L
    } else {
        (firstNumber.toLong() / gcd) * secondNumber
    }

    println()
    println("GCD of $firstNumber and $secondNumber: $gcd")
    println("LCM of $firstNumber and $secondNumber: $lcm")
}
