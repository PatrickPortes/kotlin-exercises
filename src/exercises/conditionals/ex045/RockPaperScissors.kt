package exercises.conditionals.ex045

/*
Exercise 045: Rock Paper Scissors.

Develop a rock-paper-scissors game against the computer. Read the player's choice, randomly select the computer's choice,
and display both choices and the outcome: win, loss, or draw.

Full statement: docs/exercises/exercise-045.md
*/

fun main() {

    println("-=--=--=--=--=--=--=--=--=-")
    println("ROCK, PAPER, SCISSORS GAME:")
    println("-=--=--=--=--=--=--=--=--=-")
    println("1 - Rock")
    println("2 - Paper")
    println("3 - Scissors")

    print("Enter your choice: ")
    val playerChoice = readln().trim().toIntOrNull()

    if (playerChoice == null || playerChoice !in 1..3) {
        println("Invalid choice. Please enter 1, 2, or 3.")
        return
    }

    val computerChoice = (1..3).random()

    val result = when {
        playerChoice == computerChoice -> "It's a draw!"

        (playerChoice == 1 && computerChoice == 3) ||
                (playerChoice == 2 && computerChoice == 1) ||
                (playerChoice == 3 && computerChoice == 2) -> "You win!"

        else -> "You lose!"
    }

    println()
    println("You chose: ${choiceName(playerChoice)}")
    println("Computer chose: ${choiceName(computerChoice)}")
    println("Result: $result")

}

fun choiceName(choice: Int): String {
    return when (choice) {
        1 -> "Rock"
        2 -> "Paper"
        3 -> "Scissors"
        else -> "Unknown"
    }
}
