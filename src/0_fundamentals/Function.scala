object Function extends App {

    def sumFunction(x: Int, y: Int): Int = x + y


    def sumFunctionBlock(x: Int, y: Int): Int = {
        x + y

    }

    // recursive functions
    def factorial(x: Int): Int = {
        if (x <= 1) 1
        else x * factorial(x - 1)
    }

    val sumResults = sumFunction(1,2)
    val sumBlockResults = sumFunctionBlock(1,2)
    val factResults = factorial(5)

    println(s"Sum Function: $sumResults")
    println(s"Sum FunctionBlock: $sumBlockResults")
    println(s"$factResults")
    
}