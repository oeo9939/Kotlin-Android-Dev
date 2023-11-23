// Basics Kotlin
fun main(args: Array<String>) {
    val user1 = User(name = "Name 1")
    val user2 = User(name = "Name 2")
    val user3 = User(name = "Name 3")
    val user4 = User(name = "Name 4")
    val user5 = User(name = "Name 5")
    val user6 = User("Alex")
    val user7 = User("Alex")

    val names = mutableSetOf<User>(user1, user2, user3, user4, user5, user6, user7)



    names.forEach { println(it.name) }

}

data class User(val name: String)