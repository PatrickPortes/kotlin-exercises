package exercises.conversions.ex010

/*
Exercise 010: Multiplication Table.

Read an amount in Brazilian reais and determine how many US dollars it can buy.

Full statement: docs/exercises/TODO
*/

fun main() {

    print("Enter the amount in Brazilian reais you want to convert to US dollars: ")
    val reais = readln().trim().toDoubleOrNull()

    if (reais == null ||
        !reais.isFinite() ||
        reais < 0
    ) {
        println("Invalid input. Please enter a valid amount in Brazilian reais.")
        return
    }

    val dollar = reais * 5.00
    print("The converted amount is $dollar US dollars.")

}
