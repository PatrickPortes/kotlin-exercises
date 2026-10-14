# Exercise 020 - Random Presentation Order

## Statement
Read the names of four students and generate a random order for their presentations. Display all four names in that order.

## Source code
[RandomPresentationOrder.kt](../../src/exercises/collections/ex020/RandomPresentationOrder.kt)

## How to run
Open RandomPresentationOrder.kt and run its main function.

## Example

Input:
Patrick
Ana
Bruno
Carla

Output:
The Presentation Order Will Be: [Bruno, Patrick, Carla, Ana]

The presentation order may differ between runs.

## Notes
- Learning concepts: console input with `readln()`, generic collections of strings, mutable lists with `mutableListOf<String>()`, the distinction between a read-only `val` reference and mutable list contents, creating lists with `listOf()`, adding multiple elements with `addAll()`, random ordering with `shuffled()`, creating a shuffled copy without modifying the original list, nondeterministic results, and displaying lists through string interpolation.
