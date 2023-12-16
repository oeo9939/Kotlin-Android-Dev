// Basics Kotlin - Map Transformation

//Association
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length }))
    println("\n")

    //Flatten
    val numbersSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
//    for (numbers in numbersSets) {
//        for (number in numbers) {
//            println(number)
//        }
//        println("\n")
//    }

    //Flatten - Two dimensional array -> One dimensional array
    val numbersFlatten = numbersSets.flatten()
    for (number in numbersFlatten) {
        println(number)
    }
}