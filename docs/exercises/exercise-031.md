# Exercise 031 - Trip Fare

## Statement
Read a trip's distance in kilometers and calculate the fare. For distances up to 200 km, charge BRL 0.50 per kilometer;
for longer distances, charge BRL 0.45 per kilometer for the entire trip.

## Source code
[TripFare.kt](../../src/exercises/conditionals/ex031/TripFare.kt)

## How to run
Open TripFare.kt and run its main function.

## Example

Input:
300

Output:
The fare for your trip is R$ 135.00.

The decimal separator depends on the system locale.

## Notes
- Learning concepts: using `if` as an expression that returns a value, and selecting a distance-based rate that applies to the entire trip.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, whitespace trimming, safe numeric conversion, null checks, conditional validation, early returns, smart casts, decimal values, finite-number checks, non-negative constraints, Boolean operators, comparisons, conditional branching, multiplication by a rate, decimal formatting, and locale-dependent decimal separators.
