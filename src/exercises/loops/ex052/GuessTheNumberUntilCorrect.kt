package exercises.loops.ex052

/*
Exercise 052: Guess the Number Until Correct.

Extend exercise 028: randomly select a number from 1 to 100 and accept guesses until it is found.
Report whether the target is higher or lower and count only valid guesses. Allow quitting with the word exit.

Full statement: docs/exercises/exercise-052.md
*/

fun main() {

    val targetNumber = (1..100).random()
    var attempts = 0

    println("Guess the Number!")
    println("I've chosen a number from 1 to 100.")
    println("Type 'exit' at any time to quit.")

    while (true) {
        print("Enter your guess: ")
        val input = readln().trim()

        if (input.equals("exit", ignoreCase = true)) {
            println("Game ended. Valid guesses: $attempts")
            return
        }

        val guess = input.toIntOrNull()

        if (guess == null || guess !in 1..100) {
            println("Invalid input. Enter an integer from 1 to 100.")
            continue
        }

        attempts++

        when {
            guess < targetNumber ->
                println("The secret number is higher. Try again!")

            guess > targetNumber ->
                println("The secret number is lower. Try again!")

            else -> {
                println("You guessed it! The secret number was $targetNumber.")
                println("Valid guesses: $attempts")
                return
            }
        }
    }

}
