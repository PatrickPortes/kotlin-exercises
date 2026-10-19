# Exercise 045 - Rock Paper Scissors

## Statement
Develop a rock-paper-scissors game against the computer. Read the player's choice, randomly select the computer's choice,
and display both choices and the outcome: win, loss, or draw.

## Source code
[RockPaperScissors.kt](../../src/exercises/conditionals/ex045/RockPaperScissors.kt)

## How to run
Open RockPaperScissors.kt and run its main function.

## Example

Input:
1

Output: <br>
-=--=--=--=--=--=--=--=--=--=--=--=--=- <br>
ROCK, PAPER, SCISSORS GAME: <br>
-=--=--=--=--=--=--=--=--=--=--=--=--=- <br>
1 - Rock <br>
2 - Paper <br>
3 - Scissors <br>

You chose: Rock <br>
Computer chose: Scissors <br>
Result: You win!

This example assumes the computer selects Scissors. The computer's choice and outcome may differ between runs.

## Notes
- Learning concepts: representing cyclic game rules as winning pairs and resolving a round by checking for a draw before the winning combinations and remaining losing cases.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, integer values, whitespace trimming, safe integer conversion, null checks, ranges and membership validation, Boolean operators and short-circuit evaluation, early returns, smart casts, random integer selection and nondeterministic results, equality checks, parentheses, ordered subjectless `when` expressions, subject-based `when` expressions for mapping numbers to labels, reusable functions with typed parameters and explicit return types, returned values, and expressions inside string templates.
