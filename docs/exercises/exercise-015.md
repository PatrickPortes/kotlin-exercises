# Exercise 015 - Car Rental Cost

## Statement
Ask for the number of days a car was rented and the distance traveled in kilometers. Display the total cost, charging BRL 60.00 per day and BRL 0.15 per kilometer.

## Source code
[CarRentalCost.kt](../../src/exercises/arithmetic/ex015/CarRentalCost.kt)

## How to run
Open CarRentalCost.kt and run its main function.

## Example

Input:
2
150

Output:
The total cost is R$142.50.

## Notes
- Learning concepts: integer and decimal input with `Int` and `Double`, whitespace trimming, safe conversions with `toIntOrNull()` and `toDoubleOrNull()`, combined null checks, early returns and smart casts after validation, combining daily and distance-based charges, arithmetic with mixed numeric types, parentheses in arithmetic expressions, formatting decimal output with `"%.2f".format(...)`, and locale-dependent decimal separators.
