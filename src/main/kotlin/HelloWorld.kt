fun main() {
    println("Hello World")
    var name: String = "Jagan"
    println(name)
    val firstName: String = "Jagan"
    println(name)
    var sayHello: String = "My Name is $name"
    println(sayHello)
    var birthYear = 1988
    var currentYear = 2020
    var sayAge:String = "The current age is ${currentYear - birthYear}"
    println(sayAge)

    var age:Int = 32
    println("Age after 10 years is ${after10yrs(currentYear - birthYear)}")
    println( null == null)
    println("""Hello , "How are you"""")
    println(AreYouMajor(age))
    println(maxValue(intArrayOf(3,1,1000, 5, 9)))
    println(greet("Jagan", "Evening"))
    greetPeople("Jagan", "Lakshmi")
    for ( i in 1..5) {
        println("$i")
    }

    for ( ch in 'a'..'e') {
        println("$ch")
    }

    val seekHelp: ClosedRange<String> = "Help".."Helu"
    println(seekHelp.contains("Helpq"))
    println(seekHelp.contains("Helx"))
    for ( i in 5 downTo 1) {
        println(i)
    }
    for (i in 'e' downTo 'a') {
        println(i)
    }
    for (i in 1 until 5) {
        println(i)
    }

    for (i in 1 until 13 step 4) {
        println(i)
    }

    for (i in 1 .. 13 step 4) {
        println(i)
    }

    for ( i in 13 downTo 3 step 5) {
        println(i)
    }

    for ( i in (1 until 12).filter {  it % 6 == 0} ) {
        println(i)
    }

    val list = listOf<String>("Jagannathan","Balaji", "Rajagopalan")

    for (str in list) {
        println("$str")
    }
    for (index in list.indices) {
        println(" The string in position $index is ${list.get(index)}")
    }

    for ((index, value) in list.withIndex()) {
        println(" The string in position $index is $value")
    }

    var fruits : List<String> = listOf("Apple", "Orange", "Pineapple")
    println(fruits)
    println("Apple" in fruits)
    println("Orange" in fruits)
    println(" ${fruits.get(0)} ..... ${fruits[0]}")
    println(fruits - "Apple")
    println(fruits)
    println(fruits + "Grapes")
    fruits = fruits + "Grapes"
    println(fruits + fruits)
    var books = mapOf("Cat Among Pegions" to "Agatha Christie",
                      "Shiva Trioloogy" to "Amish Tripathi" )
    println(books)
    println(books.containsKey("Cat Among Pegions"))
    println(books.containsValue("Agatha Christie"))
    println(books.contains("Agatha Christie"))
    println(books.contains("Cat Among Pegions"))
    println(books.get("Cat Among Pegions"))
    println("Cat Among Pegions" in books)
    println("Agatha Christie" in books)
    var book: String? = books.get("Sherlock")
    println(book)
    println(books.getOrDefault("Study In Scarlet", "UnKnown Author"))

    for (entry in books) {
        println(" ${entry.key} ..... ${entry.value}")
    }

    println(reverseString("Shakespeare"))
    println(reverseString("Lemon"))
    println(reverseString(null))
}

fun reverseString(name: String?) : String {
    if (name == "William") {
        return "Bill";
    }
    var result =  name?.reversed()?.toUpperCase()
    return if (result == null) "Joker" else result
}

fun greetPeople(vararg names: String ) {
    println(names.joinToString(","))
}
fun greet(name : String, period: String = "Morning") :String {
    return "Good $period , $name"
}

fun maxValue(numbers: IntArray) : Int {
    var large = 0
    for (number in numbers) {
        if (number > large) large = number
    }
    return large
}
fun after10yrs(n:Int) : Int {
    return (n + 10)
}

fun AreYouMajor(age:Int) : String {
    val result = if (age > 18 ) "You are a major" else "You are a minor"
    return result
}