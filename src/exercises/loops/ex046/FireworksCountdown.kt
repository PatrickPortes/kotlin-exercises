package exercises.loops.ex046

/*
Exercise 046: Fireworks Countdown.

Display a countdown from 10 to 0 to announce a fireworks launch. Wait one second between displaying each number.

Full statement: docs/exercises/exercise-046.md
*/

fun main() {

    println("-=--=--=--=--=--=--=-")
    println("FIREWORKS COUNTDOWN:")
    println("-=--=--=--=--=--=--=-")
    println()

    for (number in 10 downTo 0) {
        println(number)

        // Skip the pause after 0; without this condition, the launch waits one extra second.
        if (number > 0) {
            Thread.sleep(1000)
        }
    }
    println("Launching Fireworks!")

}
