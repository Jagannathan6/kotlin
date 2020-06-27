class Employee {
     var firstName: String
         set(value)  {
             firstName = value
         }
         get() = firstName;
     var age:Int
        set(value)  {
            age = value
        }
        get() = age;
}
fun main() {
    var list1 = (1..100).filter { e -> e%2 ==0 }.map { e -> e * 2 }
    println(list1)

   
}

