# Exercise 042 - Triangle Classification

## Statement
Extend exercise 035: read three lengths and check whether they form a triangle. If they do, classify it as equilateral if all three sides are equal,
isosceles if exactly two sides are equal, or scalene if all sides are different.

## Source code
[TriangleClassification.kt](../../src/exercises/conditionals/ex042/TriangleClassification.kt)

## How to run
Open TriangleClassification.kt and run its main function.

## Example

Input: <br>
5 <br>
5 <br>
3 <br>

Output: <br>
These lengths form a triangle. <br>
Triangle type: Isosceles

## Notes
- Learning concepts: classifying valid triangles by side equality, and checking the all-equal case before the two-equal case to distinguish equilateral and isosceles triangles.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, decimal values, whitespace trimming, safe numeric conversion, combined null checks, finite-number checks, positive-value constraints, early returns, smart casts, addition, comparisons, the triangle inequality, Boolean AND and OR, Boolean negation, equality checks, `if` expressions and `else if` chains, and string interpolation.
