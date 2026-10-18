# Exercise 039 - Military Registration

## Statement
Read a person's birth year and determine their age in the current year. For this exercise, assume military registration takes place at age 18.
Report whether registration is still in the future, is due this year, or is overdue. Also display how many years remain or how many years have passed since the deadline.

## Source code
[MilitaryRegistration.kt](../../src/exercises/conditionals/ex039/MilitaryRegistration.kt)

## How to run
Open MilitaryRegistration.kt and run its main function.

## Example

Input:
2008

Output:
Age reached this year: 18
Your registration is due this year (2026).

This example assumes the current year is 2026. The result changes with the year returned by Year.now().

## Notes
- Learning concepts: retrieving the current year with `java.time.Year.now().value`, calculating the age reached during a calendar year, and calculating a deadline year and the time remaining or overdue.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, whitespace trimming, safe numeric conversion, null checks, conditional validation, early returns, smart casts, integer values, ranges, membership validation, Boolean OR and short-circuit evaluation, comparisons, subtraction, addition, imports, Java interoperability, subjectless `when` branches, and string interpolation.
