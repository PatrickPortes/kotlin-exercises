# Exercise 021 - MP3 Player

## Statement
Develop a program that opens an MP3 file and plays its audio.

## Source code
[Mp3Player.kt](../../src/exercises/media/Mp3Player.kt)

## How to run
Open Mp3Player.kt and run its main function.
The playback example is currently commented out, so running the file produces no audio or console output.
To try the example, add the JLayer dependency shown in the source comments to the project's dependencies, uncomment the imports and playback block, and replace the MP3 path with an existing audio file.

## Example

Input:
No console input. The playback example references an MP3 file at C:/Users/Patrick/Music/song.mp3.

Output:
No console output. After enabling and configuring the playback example, the program plays the MP3 audio.

## Notes
- Learning concepts: external library dependencies and their declaration in Gradle Kotlin DSL, file paths and binary input streams with `FileInputStream`, resource management with `use`, explicit lambda parameter names, object creation with constructors, audio playback with JLayer's `Player`, and resource cleanup with `try` and `finally`.<br><br>

- Reinforced concepts: `main()`, package declarations, block comments, imports, Java interoperability, read-only variables, type inference, and lambda expressions, as illustrated by the commented playback example.
