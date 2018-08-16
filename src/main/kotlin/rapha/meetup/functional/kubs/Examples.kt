package rapha.meetup.functional.kubs

fun main(args: Array<String>) {
    println("Hello, World")

    //Declaring function
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //Single-expression function
    fun sum2(a: Int, b: Int) = a + b

    //Declaring variables
    val aValue = "Functional Kubs"// Can't be changed
    var age = 5 // Can be changed
    age++

    //Variables with nullable types
    var name: String? = null
    val length: Int
    length = name?.length ?: 0 // length, or 0 if name is null
    // length = name?.length ?: return // length, or return when name is null
    //length = name?.length ?: throw Error() // length, or throw error when name is null

    //If as an expression
    fun bigger(a: Int, b: Int) = if (a > b) a else b

    //For loop
    val list = listOf("A", "B", "C")
    for (element in list) {
        println(element)
    }

    //When expression with predicates
    fun signAsString(x: Int) = when {
        x < 0 -> "Negative"
        x == 0 -> "Zero"
        else -> "Positive "
    }

    //Classes
    class FormalPerson( val title : String, val firstName : String, val surname : String) {
        fun greeting() = "$title $surname, $firstName"
    }

    println(FormalPerson("Mrs", "Lovelace", "Ada").greeting())

    fun FormalPerson.infiormalGreeting() = "whats the craic $firstName?"

    //Data classes
    data class Person(val name: String, var age: Int) // equals, hashCode, toString, copy for free :)

    val mike = Person("Mike", 23)
    println(mike == Person("Mike", 23))

    val jake = mike.copy(name = "Jake")

    //COLLECTION LITERALS
    //read only
    listOf(1,2,3,4)
    setOf("A", "B", "C")
    mapOf(1 to "A", 2 to "B")

    //mutable
    mutableListOf(1,2,3,4)
    mutableSetOf("A", "B", "C")
    mutableMapOf(1 to "A", 2 to "B")



}