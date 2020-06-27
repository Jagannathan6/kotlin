data class car(var yearOfMake : Int, var color: String) {
    fun changeYearOfMake(newYearOfmake: Int) {
        yearOfMake = newYearOfmake;
    }

    fun raisePrices(money :Int) {
        price = price + money
    }

    fun reducePrices(money :Int) {
        price = price - money
    }

    companion object {
        var price = 10000
        fun currntPrice() {
            println("The price is $price")
        }
    }
}

fun main() {
  val car1 = car(2019, "Red")
    println(car1.yearOfMake)
    println(car1.color)
    car1.changeYearOfMake(2020)
    println(car1.yearOfMake)
    car.currntPrice()
    car1.raisePrices(2000)
    car.currntPrice()
    car1.reducePrices(3000)
    car.currntPrice()
    println(car1)
    var car2 = car1.copy()
    println(car2)
    val car3 = car1.copy(yearOfMake = 2030)
    println(car3)
}