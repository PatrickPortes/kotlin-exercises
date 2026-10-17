# Exercise 022 - Full Name Analysis

## Statement
Ask for a full name. Display an uppercase version, a lowercase version, the total number of letters excluding spaces, and the number of letters in the first name.

## Source code
[FullNameAnalysis.kt](../../src/exercises/strings/ex022/FullNameAnalysis.kt)

## How to run
Open FullNameAnalysis.kt and run its main function.

## Example

Input:
Patrick Portes

Output:
Uppercase Version: PATRICK PORTES
Lowercase Version: patrick portes
Total Number of Letters Excluding Spaces: 13
Number of letters in your first name: 7

## Notes
- Learning concepts: changing string case with `uppercase()` and `lowercase()`, counting characters that match a predicate with `count`, whitespace detection with `isWhitespace()`, extracting a leading sequence of characters with `takeWhile`, and string length with `length`.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, strings, read-only variables, type inference, whitespace trimming, blank-string checks, conditional validation, early returns, lambdas and the implicit `it` parameter, character predicates, Boolean negation, and expressions inside string templates.
