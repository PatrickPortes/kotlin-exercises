# Exercise 052 - Guess the Number Until Correct

## Statement
Extend exercise 028: randomly select a number from 1 to 100 and accept guesses until it is found.
Report whether the target is higher or lower and count only valid guesses. Allow quitting with the word exit.

## Source code
[GuessTheNumberUntilCorrect.kt](../../src/exercises/loops/ex052/GuessTheNumberUntilCorrect.kt)

## How to run
Open GuessTheNumberUntilCorrect.kt and run its main function.

## Example

Input: <br>
25 <br>
75 <br>
50

Output: <br>
Guess the Number! <br>
I've chosen a number from 1 to 100. <br>
Type 'exit' at any time to quit. <br>
The secret number is higher. Try again! <br>
The secret number is lower. Try again! <br>
You guessed it! The secret number was 50. <br>
Valid guesses: 3

This example assumes the target is 50. The target and feedback may differ between runs. Invalid guesses do not increase the counter; exit ends the game and displays the number of valid guesses.

## Notes
- Learning concepts: handling a text exit command alongside numeric input, counting only validated guesses, and providing directional feedback in a repeated guessing game.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only and mutable variables, type inference, numeric ranges, random integer selection, nondeterministic results, whitespace trimming, case-insensitive string comparison, named arguments, safe integer conversion, null checks, membership validation, Boolean OR, short-circuit evaluation, `while (true)`, `continue`, early returns, smart casts, incrementing counters, comparisons, subjectless `when` branches, and string interpolation.
