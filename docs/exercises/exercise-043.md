# Exercise 043 - Body Mass Index

## Statement
Ask for weight in kilograms and height in meters. Calculate the Body Mass Index (BMI) and display the classification using the exercise's ranges: below 18.5,
“underweight”; from 18.5 to below 25, “ideal weight”; from 25 to below 30, “overweight”; from 30 to below 40, “obesity”; 40 or above, “morbid obesity”.

## Source code
[BodyMassIndex.kt](../../src/exercises/conditionals/ex043/BodyMassIndex.kt)

## How to run
Open BodyMassIndex.kt and run its main function.

## Example

Input: <br>
72 <br>
1.8

Output: <br>
Your BMI: 22.22 <br>
Classification: Ideal weight

The decimal separator depends on the system locale. The classification follows the ranges specified for this exercise.

## Notes
- Learning concepts: calculating BMI as weight divided by height squared.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, decimal values, whitespace trimming, safe numeric conversion, combined null checks, finite-number checks, positive-value constraints, Boolean operators, early returns, smart casts, multiplication, division, parentheses, comparisons, ordered subjectless `when` expressions, classification by numeric thresholds, decimal formatting, locale-dependent decimal separators, and string interpolation.
