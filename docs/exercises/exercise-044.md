# Exercise 044 - Payment Conditions

## Statement
Read a product's price and the payment method. Determine the total using these rules: payment in full by cash or
check receives a 10% discount; payment in full by card receives a 5% discount; two card installments keep the original
price; three or more card installments add 20% to the price.

## Source code
[PaymentConditions.kt](../../src/exercises/conditionals/ex044/PaymentConditions.kt)

## How to run
Open PaymentConditions.kt and run its main function.

## Example

Input: <br>
100 <br>
3

Output: <br>
Choose a payment method: <br>
1 - Cash (paid in full): 10% discount <br>
2 - Check (paid in full): 10% discount <br>
3 - Card (paid in full): 5% discount <br>
4 - Card in 2 installments: original price <br>
5 - Card in 3 or more installments: 20% surcharge <br>

Selected payment method: Card (paid in full) <br>
Original price: BRL 100.00 <br>
Total price: BRL 95.00

The decimal separator depends on the system locale.

## Notes
- Learning concepts: mutable variable declarations with `var`, deferred variable initialization, repeating input validation with `while (true)`, restarting an iteration with `continue`, exiting a loop with `break`, combining multiple matching values in a `when` branch with `1, 2`, and defining reusable functions with typed parameters, explicit return types, and returned values, as in `formatPrice(price: Double): String`.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, console input and output, read-only variables, type inference, explicit type declarations, integer and decimal values, whitespace trimming, safe numeric conversion, null checks, finite-number checks, positive-value constraints, ranges and membership checks, Boolean operators, early returns, smart casts, subject-based `when` expressions, menu selection, percentage discounts and increases, multiplication by reduction and growth factors, decimal formatting, locale-dependent decimal separators, and expressions inside string templates.
