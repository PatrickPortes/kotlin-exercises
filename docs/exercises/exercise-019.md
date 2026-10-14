# Exercise 019 - Random Student Selection

## Statement
Ask for the names of four students. Randomly select one to erase the board and display the selected name.

## Source code
[RandomStudentSelection.kt](../../src/exercises/collections/ex019/RandomStudentSelection.kt)

## How to run
Open RandomStudentSelection.kt and run its main function.

## Example

Input:
Patrick
Ana
Bruno
Carla

Output:
The randomly selected student is: Ana

The selected name may differ between runs.

## Notes
- Learning concepts: console input with `readln()`, collections of strings, explicit generic types with `<String>`, mutable lists with `mutableListOf()`, the distinction between a read-only `val` reference and mutable list contents, creating lists with `listOf()`, adding multiple elements with `addAll()`, random element selection with `random()`, nondeterministic results, and expressions inside string templates with `${...}`.
