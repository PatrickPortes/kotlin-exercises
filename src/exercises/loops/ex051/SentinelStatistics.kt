package exercises.loops.ex051

/*
Exercise 051: Sentinel Statistics.

Read integers until receiving 0. Display the count, sum, and mean, excluding the sentinel. If the first value is 0,
report that there is no data. Use Long for the sum.

Full statement: docs/exercises/exercise-051.md
*/

fun main() {
    var sum = 0L
    var count = 0L

    while (true) {
        print("Enter an integer (0 to finish): ")
        val number = readln().trim().toIntOrNull()

        if (number == null) {
            println("Invalid input. Please enter an integer.")
            continue
        }

        if (number == 0) {
            break
        }

        sum += number
        count++
    }

    if (count == 0L) {
        println("No data entered.")
        return
    }

    val mean = sum.toDouble() / count

    println("Count: $count")
    println("Sum: $sum")
    println("Mean: %.2f".format(mean))
}
