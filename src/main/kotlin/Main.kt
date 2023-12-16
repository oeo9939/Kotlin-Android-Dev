import java.util.*

// Basics Kotlin - String Representation
fun main() {
    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString))

    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 25, truncated = "<...>"))

    println("\n")
    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
    println(numbersStrings.joinToString { "Element: ${it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}" })
}