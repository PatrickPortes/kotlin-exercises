package exercises.strings.ex004

/*
Exercise 004: Text Type and Properties.

Read text from the keyboard and display its type in Kotlin. Also report whether it
contains only whitespace, only letters, only digits, or a combination of letters
and digits, and whether its letters are all uppercase or all lowercase.

Full statement: docs/exercises/exercise-004.md
*/

fun main() {

    println("Type Something: ")
    val text = readln()

    val value: Any = text.toIntOrNull()
        ?: text.toDoubleOrNull()
        ?: text.toBooleanStrictOrNull()
        ?: text


    val hasText = text.isNotEmpty()
    val letters = text.filter { it.isLetter() }
    val hasLetters = letters.isNotEmpty()

    val onlySpaces = hasText && text.isBlank()
    val onlyDigits = hasText && text.all { it.isDigit() }
    val isNumber = value is Int || value is Double

    val isAlphabetic = hasText && text.all { it.isLetter() }
    val isAlphanumeric = hasText && text.all { it.isLetterOrDigit() }

    val isUppercase = hasLetters && letters.all { it.isUpperCase() }
    val isLowercase = hasLetters && letters.all { it.isLowerCase() }

    val isCapitalized = text.firstOrNull()?.isUpperCase() == true &&
            letters.drop(1).all { it.isLowerCase() }


    println("The type of this value is: ${value::class.simpleName}")
    println("Is it empty? ${text.isEmpty()}")
    println("Does it contain only whitespace? $onlySpaces")
    println("Does it contain only digits? $onlyDigits")
    println("Is it a number? $isNumber")
    println("Is it alphabetic? $isAlphabetic")
    println("Is it alphanumeric? $isAlphanumeric")
    println("Is it uppercase? $isUppercase")
    println("Is it lowercase? $isLowercase")
    println("Is it capitalized? $isCapitalized")

}
