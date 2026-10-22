package exercises.loops.ex054

/*
Exercise 054: Prime Numbers.

Determine whether an integer from 0 to 1,000,000 is prime and list the primes within a valid interval in that domain.
Treat 0 and 1 as non-prime. Avoid unnecessary divisor checks and explain your stopping criterion.

Full statement: docs/exercises/exercise-054.md
*/

fun main() {
    println("PRIME NUMBER CHECKER")

    print("Enter an integer from 0 to 1,000,000: ")
    val number = readln().trim().toIntOrNull()

    if (number == null || number !in 0..1_000_000) {
        println("Invalid input. Enter an integer from 0 to 1,000,000.")
        return
    }

    if (isPrime(number)) {
        println("$number is prime.")
    } else {
        println("$number is not prime.")
    }

    println()
    print("Enter the interval start: ")
    val start = readln().trim().toIntOrNull()

    print("Enter the interval end: ")
    val end = readln().trim().toIntOrNull()

    if (start == null || end == null ||
        start !in 0..1_000_000 || end !in 0..1_000_000 ||
        start > end
    ) {
        println("Invalid interval. Use 0 <= start <= end <= 1,000,000.")
        return
    }

    println("Prime numbers from $start to $end:")
    var count = 0

    for (candidate in start..end) {
        if (isPrime(candidate)) {
            println(candidate)
            count++
        }
    }

    println("Total prime numbers: $count")
}

fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    if (number == 2) return true
    if (number % 2 == 0) return false

    var divisor = 3

    while (divisor * divisor <= number) {
        if (number % divisor == 0) {
            return false
        }

        divisor += 2
    }

    return true
}