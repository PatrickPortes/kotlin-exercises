package exercises.loops.ex055

/*
Exercise 055: Fibonacci Sequence.

Generate the first n Fibonacci terms, starting with 0 and 1, for n from 0 to 93, using Long. For n = 0,
return an empty list. Do not calculate an additional term after the final requested term.

Full statement: docs/exercises/exercise-055.md
*/

fun main() {

    print("Enter the number of Fibonacci terms (0 to 93): ")
    val termCount = readln().trim().toIntOrNull()

    if (termCount == null || termCount !in 0..93) {
        println("Invalid input. Enter an integer from 0 to 93.")
        return
    }

    val terms = mutableListOf<Long>()

    if (termCount >= 1) {
        terms.add(0L)
    }

    if (termCount >= 2) {
        terms.add(1L)
    }

    for (index in 2 until termCount) {
        val nextTerm = terms[index - 1] + terms[index - 2]
        terms.add(nextTerm)
    }

    println("Fibonacci sequence: $terms")
}
