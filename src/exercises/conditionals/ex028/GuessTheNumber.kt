package exercises.conditionals.ex028

import java.util.Random

/*
Exercise 028: Guess the Number.

Randomly select an integer from 0 to 5 and ask the user to guess it. After a single attempt, report whether the guess was correct or incorrect.

Full statement: docs/exercises/exercise-028.md
*/

fun main() {

    println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-")
    println("Try to guess the number I'm thinking of, from 0 to 5!")
    println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-")

    //val randomNumber = Random().nextInt(0,6)
    val randomNumber = (0..5).random()

    print("What's your guess? ")
    val guess = readln().trim().toIntOrNull()

    if (guess == null || (guess !in 0..5)) {
        println("Invalid input. Enter an integer from 0 to 5.")
        return
    }

    if (guess == randomNumber) {
        println("Nice! You won! I chose the number $randomNumber.")
    } else {
        println("Sorry! You lost! I chose the number $randomNumber.")
    }

}
