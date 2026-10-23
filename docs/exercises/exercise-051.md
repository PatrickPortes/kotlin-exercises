# Exercise 051 - Sentinel Statistics

## Statement
Read integers until receiving 0. Display the count, sum, and mean, excluding the sentinel. If the first value is 0,
report that there is no data. Use Long for the sum.

## Source code
[SentinelStatistics.kt](../../src/exercises/loops/ex051/SentinelStatistics.kt)

## How to run
Open SentinelStatistics.kt and run its main function.

## Example

Input:
10
20
30
0

Output: <br>
Count: 3 <br>
Sum: 60 <br>
Mean: 20.00

The sentinel 0 is excluded from the statistics. If it is the first value, the output is No data entered. The decimal separator depends on the system locale.

## Notes
- Learning concepts: sentinel-controlled data entry, excluding the sentinel from accumulated results, counting accepted values with `++`, detecting an empty dataset before calculating a mean, and converting a total to `Double` with `toDouble()` to avoid integer division.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only and mutable variables, type inference, safe integer conversion, whitespace trimming, null checks, `while (true)`, `continue`, `break`, early returns, smart casts, equality checks, `Long` values and literals, accumulation with `+=`, arithmetic means, division, decimal formatting, locale-dependent decimal separators, and string interpolation.
