# Exercise 041 - Athlete Category

## Statement
Read an athlete's birth year and determine their category based on their age in the current year:
Under 10 for ages up to 9; Under 15 for ages 10 to 14; Junior for ages 15 to 19; Senior for ages 20 to 25; Master for ages above 25.

## Source code
[AthleteCategory.kt](../../src/exercises/conditionals/ex041/AthleteCategory.kt)

## How to run
Open AthleteCategory.kt and run its main function.

## Example

Input: 
2008

Output: <br>
Age reached this year: 18 <br>
Athlete category: Junior

This example assumes the current year is 2026. The age and category may change with the year returned by Year.now().

## Notes
- Learning concepts: chaining conditions with `else if` as an alternative to a subjectless `when`, illustrated by the commented implementation.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, imports, Java interoperability, retrieving the current year with `Year.now().value`, console input and output, read-only variables, type inference, whitespace trimming, safe integer conversion, null checks, ranges and membership validation, Boolean OR and short-circuit evaluation, early returns, smart casts, calculating the age reached during a calendar year, subtraction, comparisons, ordered conditional classification, returning values from conditional expressions, and string interpolation.
