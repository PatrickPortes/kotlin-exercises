package exercises.collections.ex020

/*
Exercise 020: Random Presentation Order.

Read the names of four students and generate a random order for their presentations. Display all four names in that order.

Full statement: docs/exercises/exercise-020.md
*/

fun main() {

    val studentList = mutableListOf<String>()

    print("Enter the name of the first student: ")
    val firstName = readln()
    print("Enter the name of the second student: ")
    val secondName = readln()
    print("Enter the name of the third student: ")
    val thirdName = readln()
    print("Enter the name of the fourth student: ")
    val fourthName = readln()

    studentList.addAll(listOf(firstName, secondName, thirdName, fourthName))

    print("The Presentation Order Will Be: ${studentList.shuffled()}")

}
