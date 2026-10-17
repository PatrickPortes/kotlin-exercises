package exercises.conditionals.ex034

/*
Exercise 034: Salary Raise by Range.

Ask for an employee's salary and determine the raise amount. Apply 10% to salaries above BRL 1,250.00 and 15% to salaries equal to or below that amount.

Full statement: docs/exercises/exercise-034.md
*/

fun main() {

    print("Enter your salary: ")
    val salary = readln().trim().toDoubleOrNull()

    if (salary == null) {
        println("Invalid input. Please enter a valid salary.")
        return
    }

    val raiseRate = if (salary > 1250.0) {
        0.10
    } else
        0.15

    val newSalary = salary + (salary * raiseRate)

    println("Your new salary is: $newSalary")

}
