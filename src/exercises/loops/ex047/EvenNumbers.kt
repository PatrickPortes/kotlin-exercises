package exercises.loops.ex047

/*
Exercise 047: Even Numbers.

Display all even integers in the inclusive range from 1 to 50.

Full statement: docs/exercises/exercise-047.md
*/

fun main() {

    for (number in 1..50) {

        if (number % 2 == 0) {
            println(number)
        }

    }

    /*
    for (number in 2..50 step 2) {
            println(number)
        }
    */

}
