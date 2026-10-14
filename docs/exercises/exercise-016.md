# Exercise 016 - Integer Part

## Statement
Read a number with decimal places and display only its integer part, discarding the fractional part.

## Source code
[IntegerPart.kt](../../src/exercises/arithmetic/ex016/IntegerPart.kt)

## How to run
Open IntegerPart.kt and run its main function.

## Example

Input:
10.232354

Output:
Your number with the decimal part removed is: 10

## Notes
- Learning concepts: decimal input with `Double`, whitespace trimming with `trim()`, safe numeric conversion with `toDoubleOrNull()`, nullable values and null checks, conditional validation and early returns, conversion from `Double` to `Int` with `toInt()`, truncation toward zero instead of rounding, and string interpolation.
