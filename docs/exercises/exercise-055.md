# Exercise 055 - Fibonacci Sequence

## Statement
Generate the first n Fibonacci terms, starting with 0 and 1, for n from 0 to 93, using Long. For n = 0,
return an empty list. Do not calculate an additional term after the final requested term.

## Source code
[FibonacciSequence.kt](../../src/exercises/loops/ex055/FibonacciSequence.kt)

## How to run
Open FibonacciSequence.kt and run its main function.

## Example

Input:
8

Output:
Fibonacci sequence: [0, 1, 1, 2, 3, 5, 8, 13]

For 0 terms the output is Fibonacci sequence: []. For 93 terms the final term is F92 = 7540113804746346429, which fits in Long. F93 = 12200160415121876738 does not fit; the loop ends before calculating that unrequested term.

## Notes
- Learning concepts: the Fibonacci recurrence, indexed list access with `[]`, appending individual elements with `add()`, exclusive upper bounds with `until`, and bounding generation so that no extra recurrence term is calculated.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only references to mutable lists, type inference, generic collections, `mutableListOf()`, whitespace trimming, safe integer conversion, null checks, numeric ranges, membership validation, Boolean OR, early returns, smart casts, `Long` values and literals, representable-result limits, conditional statements, `for` loops, zero-based indexing, subtraction, addition, and string interpolation.
