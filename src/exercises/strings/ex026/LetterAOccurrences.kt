package exercises.strings.ex026

/*
Exercise 026: Letter A Occurrences.

Ask for a sentence. Display how many times the letter “A” appears, the position of its first occurrence, and the position of its last occurrence.

Full statement: docs/exercises/exercise-026.md
*/

fun main() {

    println("Enter a sentence: ")
    val sentence = readln().trim()

    if (sentence.isBlank()) {
        println("Invalid input. Please enter a sentence.")
        return
    }

    val total = sentence.count { it.equals('a', ignoreCase = true) }
    val firstIndex = sentence.indexOf('a', ignoreCase = true)
    val lastIndex = sentence.lastIndexOf('a', ignoreCase = true)

    println("Number of occurrences of the letter A: $total")

    if (total > 0) {
        println("Position of the first occurrence: ${firstIndex + 1}")
        println("Position of the last occurrence: ${lastIndex + 1}")
    } else {
        println("The sentence doesn't contain the letter A.")
    }

}
