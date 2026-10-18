# Exercise 028 - Guess the Number

## Statement
Randomly select an integer from 0 to 5 and ask the user to guess it. After a single attempt, report whether the guess was correct or incorrect.

## Source code
[GuessTheNumber.kt](../../src/exercises/conditionals/ex028/GuessTheNumber.kt)

## How to run
Open GuessTheNumber.kt and run its main function.

## Example

Input:
3

Output:
Nice! You won! I chose the number 3.

This example assumes the randomly selected number is 3. The selected number and result may differ between runs.

## Notes
- Learning concepts: random integer selection from an inclusive numeric range with `(0..5).random()`.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, whitespace trimming, safe numeric conversion, null checks, conditional validation, early returns, smart casts, integer ranges and membership checks, Boolean OR and short-circuit evaluation, random selection and nondeterministic results, equality checks, conditional branching, and string interpolation.
