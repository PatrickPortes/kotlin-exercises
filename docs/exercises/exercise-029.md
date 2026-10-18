# Exercise 029 - Speeding Fine

## Statement
Read a vehicle's speed in km/h. If it exceeds 80 km/h, display a speeding notice and the fine amount, charging BRL 7.00 for each km/h above the limit.

## Source code
[SpeedingFine.kt](../../src/exercises/conditionals/ex029/SpeedingFine.kt)

## How to run
Open SpeedingFine.kt and run its main function.

## Example

Input:
90

Output:
You were speeding at 90.0 km/h. The speed limit is 80.0 km/h.
Fine amount: R$ 70,00

## Notes
- Learning concepts: calculating charges only on the amount above a threshold, and explicitly selecting a formatting locale with `Locale.forLanguageTag("pt-BR")`.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, whitespace trimming, safe numeric conversion, null checks, conditional validation, early returns, smart casts, decimal values, finite-number checks, non-negative constraints, Boolean operators, comparisons, subtraction, multiplication by a rate, decimal formatting, locale-dependent decimal separators, imports, Java interoperability, conditional branching, and string interpolation.
