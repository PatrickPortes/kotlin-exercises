package exercises.arithmetic.ex012

/*
Exercise 012: Product Discount.

Read a product's price and display the final price after applying a 5% discount.

Full statement: docs/exercises/exercise-012.md
*/

fun main() {

    print("Enter the product's price: ")
    val price = readln().trim().toDoubleOrNull()

    if (price == null) {
        println("Please enter a valid price.")
        return
    }

//  Three ways to calculate the final price after a 5% discount:

//  Alternative 1: Subtract the discount amount.
    val finalPrice = price - (price * 5 / 100)

//  Alternative 2: Use a configurable discount percentage.
//  val discountPercentage = 5.0
//  val finalPrice = price * (1 - discountPercentage / 100)

//  Alternative 3: Multiply by 0.95.
//  val finalPrice = price * 0.95

    println("The product's price after a 5% discount is: $finalPrice")

}
