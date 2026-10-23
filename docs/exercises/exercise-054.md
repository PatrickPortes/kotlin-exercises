# Exercise 054 - Prime Numbers

## Statement
Determine whether an integer from 0 to 1,000,000 is prime and list the primes within a valid interval in that domain.
Treat 0 and 1 as non-prime. Avoid unnecessary divisor checks and explain your stopping criterion.

## Source code
[PrimeNumbers.kt](../../src/exercises/loops/ex054/PrimeNumbers.kt)

## How to run
Open PrimeNumbers.kt and run its main function.

## Example

Input:
17
0
20

Output: <br>
PRIME NUMBER CHECKER <br>
17 is prime.

Prime numbers from 0 to 20:
2
3
5
7
11
13
17
19 <br>
Total prime numbers: 8

The helper treats 0 and 1 as non-prime, handles 2 separately, and rejects other even numbers. For remaining values it tests only odd divisors while divisor * divisor <= number: any composite number has a divisor no greater than its square root, so larger divisors are unnecessary.

## Notes
- Learning concepts: primality, the special cases 0, 1 and 2, trial division limited by the square root, skipping even divisors after checking 2, and underscores as digit separators in numeric literals such as `1_000_000`.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, reusable functions with typed parameters and return types, returned Boolean values, read-only and mutable variables, type inference, safe integer conversion, whitespace trimming, null checks, numeric ranges, interval-bound validation, Boolean operators, early returns, smart casts, comparisons, remainder-based divisibility checks, conditional branches, `for` and `while` loops, incrementing counters, `+=`, multiplication, and string interpolation.
