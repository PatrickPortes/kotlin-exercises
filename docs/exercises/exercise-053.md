# Exercise 053 - Factorial

## Statement
Calculate n! using a loop and Long, for n from 0 to 20. Reject values outside this range and invalid input. Treat 0! as 1.
Explain why accepting 21 without changing the representation would cause a problem.

## Source code
[Factorial.kt](../../src/exercises/loops/ex053/Factorial.kt)

## How to run
Open Factorial.kt and run its main function.

## Example

Input:
5

Output:
5! = 120

The factorial of 0 is 1: the range 1..0 is empty, so the initial product is unchanged. 20! is 2432902008176640000, while 21! is 51090942171709440000, exceeding Long.MAX_VALUE (9223372036854775807). Accepting 21 with the same representation would cause integer overflow.

## Notes
- Learning concepts: factorials, the multiplicative identity as an initial accumulator, empty-range behavior for `0!`, multiplication assignment with `*=`, and choosing input limits according to the maximum representable result.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only and mutable variables, type inference, safe integer conversion, null checks, numeric ranges, membership validation, Boolean OR, short-circuit evaluation, early returns, smart casts, `for` loops, accumulators, multiplication, `Long` values and literals, integer overflow awareness, and string interpolation.
