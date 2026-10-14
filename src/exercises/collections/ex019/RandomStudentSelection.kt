package exercises.collections.ex019

/*
Exercise 019: Random Student Selection.

Ask for the names of four students. Randomly select one to erase the board and display the selected name.

Full statement: docs/exercises/TODO
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

    /*
    val selectedStudent = studentList.random()
    println("The randomly selected student is: $selectedStudent")
    */

    println("The randomly selected student is: ${studentList.random()}")
}
