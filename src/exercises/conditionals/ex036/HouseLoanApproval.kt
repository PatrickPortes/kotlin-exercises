package exercises.conditionals.ex036

import java.util.Locale

/*
Exercise 036: House Loan Approval.

Ask for a house's price, the buyer's salary, and the repayment period in years. Calculate the monthly payment by dividing the price by the number of months. Approve the loan only if the payment does not exceed 30% of the salary.

Full statement: docs/exercises/exercise-036.md
*/

fun main() {

    println("-=--=--=--=--=--=--=-")
    println("  Home Loan Approval")
    println("-=--=--=--=--=--=--=-")

    print("Enter the house's price (BRL): R$")
    val housePrice = readln().trim().toDoubleOrNull()

    print("Enter the buyer's monthly salary (BRL): R$")
    val monthlySalary = readln().trim().toDoubleOrNull()

    print("Enter the repayment period in whole years: ")
    val repaymentYears = readln().trim().toIntOrNull()

    if (housePrice == null || monthlySalary == null || repaymentYears == null) {
        println("Invalid input. Enter numeric values and a whole number of years.")
        return
    }

    if (!housePrice.isFinite() || housePrice <= 0 ||
        !monthlySalary.isFinite() || monthlySalary <= 0 ||
        repaymentYears <= 0
    ) {
        println("Invalid input. The price, salary, and repayment period must be positive and finite.")
        return
    }

    val monthlyPayment = housePrice / (repaymentYears * 12.0)
    val maximumPayment = monthlySalary * 0.30

    println()
    println(
        "Monthly payment: BRL %.2f"
            .format(Locale.US, monthlyPayment)
    )
    println(
        "Maximum allowed payment (30%% of monthly salary): BRL %.2f"
            .format(Locale.US, maximumPayment)
    )

    if (monthlyPayment <= maximumPayment) {
        println("Loan approved. The monthly payment is within your salary limit.")
    } else {
        println("Loan denied. The monthly payment exceeds 30% of your monthly salary.")
    }

}
