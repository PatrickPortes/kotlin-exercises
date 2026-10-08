# Exercise 004 - Text Type and Properties

## Statement
Read text from the keyboard and display its type in Kotlin. Also report whether it
contains only whitespace, only letters, only digits, or a combination of letters
and digits, and whether its letters are all uppercase or all lowercase.

## Source code
[TextTypeAndProperties.kt](../../src/exercises/strings/ex004/TextTypeAndProperties.kt)

## How to run
Open TextTypeAndProperties.kt and run its main function.

## Example

Input:
Kotlin

Output:
The type of this value is: String
Is it empty? false
Does it contain only whitespace? false
Does it contain only digits? false
Is it a number? false
Is it alphabetic? true
Is it alphanumeric? true
Is it uppercase? false
Is it lowercase? false
Is it capitalized? true

## Notes
- Learning concepts: safe type conversions with `toIntOrNull()`, `toDoubleOrNull()`, and `toBooleanStrictOrNull()`; nullable values and fallback expressions with the Elvis operator `?:`; the `Any` type, type checks with `is`, and runtime type inspection with `::class.simpleName`; differences between empty and blank strings; character predicates; filtering and checking characters with `filter` and `all`; safe access with `firstOrNull()` and `?.`; skipping characters with `drop()`; and Boolean expressions with `&&` and `||`.
