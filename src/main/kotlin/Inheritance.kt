import java.lang.RuntimeException
import kotlin.system.exitProcess

open class Vehicle (var year:Int, open var color: String){

    open var km = 1000;
    open fun repaint(color : String) {
        println("Override in Vehicle Class")
        this.color = color
    }

}

open class Jeep (year: Int,color: String): Vehicle(year, color){

    override  var km = 5000
        set(value) {
            if (value < 1) {
                throw RuntimeException("No Negative values")
            }
            field = value;
        }
    override fun repaint(color: String) {
        println("Override in Jeep Class")
        km ++;
        println(super.km)
        this.color = color
    }
}

 class FamilyCar(year: Int, color: String) : Jeep(year, color) {
    override var color: String
        get() = super.color
        set(value) {

            if (value == "Purple") {
                println("Setter Value is $value")
                color = "Red"
                super.color = color
            } else {
                println("Setter Value is $value")
                super.color = value
            }

        }

}


fun main() {
    val jeep =  Jeep(2020, "Red")
    println (" Color is ${jeep.color} and the make is ${jeep.year} and the KM covered is ${jeep.km}")
    jeep.repaint("Black")
    println (" Color is ${jeep.color} and the make is ${jeep.year} and the KM covered is ${jeep.km}")
    println("----Family Car --------")
    val familyCar = FamilyCar(2021, "")
    println(familyCar.color)
    println (" Color is ${familyCar.color} and the make is ${familyCar.year} and the KM covered is ${familyCar.km}")
    familyCar.color = "Black"
    println (" Color is ${familyCar.color} and the make is ${familyCar.year} and the KM covered is ${familyCar.km}")
    println("----------------------")
    familyCar.repaint("Purple")
    println (" Color is ${familyCar.color} and the make is ${familyCar.year} and the KM covered is ${familyCar.km}")
}