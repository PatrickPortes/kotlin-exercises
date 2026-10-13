package exercises.arithmetic.ex013

/*
Exercise 013: Salary Raise.

Ask for an employee's current salary and display the new salary after a 15% raise.

Full statement: docs/exercises/exercise-013.md
*/

fun main() {

    print("What's your current salary? ")
    val currentSalary = readln().trim().toDoubleOrNull()

    if (currentSalary == null) {
        println("Please enter a valid salary.")
        return
    }

//  Three ways to calculate the new salary after a 15% raise:

//  Alternative 1: Add the raise amount.
    val finalSalary = currentSalary + (currentSalary * 15 / 100)

//  Alternative 2: Use a configurable raise percentage.
//  val salaryRaisePercentage = 15.0
//  val finalSalary = currentSalary * (1 + salaryRaisePercentage / 100)

//  Alternative 3: Multiply by 1.15.
//  val finalSalary = currentSalary * 1.15

    println("Congratulations, You received a raise! Your new salary is: $finalSalary")

}
