
object Variables extends App {

    //IMMUTABLE
    // defining a value
    val employeeNo: Int = 1512 // it is liek a constant. We can't asign new values to it

    // there is no need to declare the value type. The compiler is able to infer it
    val isActive = true

    val employeeName = "Bilbo Baggins"

    // concatenating strings
    val employeeFirstRole = "eat" + " " + "good" + " " + "food"
    val employeeSecondRole = "drink" + " " + "good" + " " + "ale"
    val employeeRole = s"$employeeFirstRole, $employeeSecondRole"
    
    println(s"Employee name: $employeeName")
    println(s"Employee is active? $isActive")
    println(s"Employee Number: $employeeNo")
    println(s"Employee First Role: $employeeFirstRole")
    println(s"Employee Second Role: $employeeSecondRole")
    println(s"Employee Role: $employeeRole")

    //MUTABLE

    var employeeJobPlace = "The Shire"

    println(s"Employee Place: $employeeJobPlace")

    employeeJobPlace = "Rivendell"

    println(s"Employee New Place: $employeeJobPlace")
}