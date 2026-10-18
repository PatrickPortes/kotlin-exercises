# Exercise 036 - House Loan Approval

## Statement
Ask for a house's price, the buyer's salary, and the repayment period in years. Calculate the monthly payment by dividing the price by the number of months. Approve the loan only if the payment does not exceed 30% of the salary.

## Source code
[HouseLoanApproval.kt](../../src/exercises/conditionals/ex036/HouseLoanApproval.kt)

## How to run
Open HouseLoanApproval.kt and run its main function.

## Example

Input: <br>
120000 <br>
4000 <br>
10

Output: <br>
Monthly payment: BRL 1000.00 <br>
Maximum allowed payment (30% of monthly salary): BRL 1200.00 <br>
Loan approved. The monthly payment is within your salary limit.

## Notes
- Learning concepts: converting a repayment period from years to months, comparing a monthly payment against an income-based eligibility limit, and escaping a literal percent sign with `%%` in format strings.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, whitespace trimming, safe numeric conversion, null checks, conditional validation, early returns, smart casts, integer and decimal values, combined null checks, finite-number checks, positive-value constraints, Boolean operators, comparisons, multiplication, division, percentages, parentheses, conditional branching, explicit formatting locales, and decimal formatting.
