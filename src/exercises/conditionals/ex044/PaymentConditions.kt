package exercises.conditionals.ex044

/*
Exercise 044: Payment Conditions.

Read a product's price and the payment method. Determine the total using these rules: payment in full by cash or
check receives a 10% discount; payment in full by card receives a 5% discount; two card installments keep the original
price; three or more card installments add 20% to the price.

Full statement: docs/exercises/exercise-044.md
*/

fun main() {

    print("Enter the product price (BRL): ")
    val price = readln().trim().toDoubleOrNull()

    if (price == null || !price.isFinite() || price <= 0) {
        println("Invalid input. Please enter a positive, finite price.")
        return
    }

    println()
    println("Choose a payment method:")
    println("1 - Cash (paid in full): 10% discount")
    println("2 - Check (paid in full): 10% discount")
    println("3 - Card (paid in full): 5% discount")
    println("4 - Card in 2 installments: original price")
    println("5 - Card in 3 or more installments: 20% surcharge")

    var choice: Int

    while (true) {
        print("Enter your choice: ")
        val input = readln().trim().toIntOrNull()

        if (input == null || input !in 1..5) {
            println("Invalid option. Please choose a number from 1 to 5.")
            continue
        }

        choice = input
        break
    }

    val paymentMethod = when (choice) {
        1 -> "Cash (paid in full)"
        2 -> "Check (paid in full)"
        3 -> "Card (paid in full)"
        4 -> "Card in 2 installments"
        else -> "Card in 3 or more installments"
    }

    val totalPrice = when (choice) {
        1, 2 -> price * 0.90
        3 -> price * 0.95
        4 -> price
        else -> price * 1.20
    }

    println()
    println("Selected payment method: $paymentMethod")
    println("Original price: BRL ${formatPrice(price)}")
    println("Total price: BRL ${formatPrice(totalPrice)}")

}

fun formatPrice(price: Double): String {
    return "%.2f".format(price)
}
