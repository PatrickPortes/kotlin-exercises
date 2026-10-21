package exercises.loops.ex048

/*
Exercise 048: Odd Multiples of Three Sum.

Calculate and display the sum of the integers from 1 to 500 that are both odd and multiples of three.

Full statement: docs/exercises/exercise-048.md
*/

fun main() {
    var sum = 0

    for (number in 1..500) {
        if (number % 2 != 0 && number % 3 == 0) {
            sum += number
        }
    }

    println("Sum of odd multiples of 3 from 1 to 500: $sum")
}
