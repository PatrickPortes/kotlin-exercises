# Exercise 002 - Personalized Greeting

## Statement
Ask for the user's name and display a personalized greeting
using the provided name.

## Source code
[PersonalizedGreeting.kt](../../src/exercises/fundamentals/ex002/PersonalizedGreeting.kt)

## How to run
Open PersonalizedGreeting.kt and run its main function.

## Example

Input:
Patrick

Output:
Hello, Patrick!

## Notes
- This exercise introduces console input with `readln()` and string interpolation with `$name`. The input is stored in a read-only `val` of type `String`, then inserted into a personalized greeting. `println()` adds a line break after the output, while `print()` does not.