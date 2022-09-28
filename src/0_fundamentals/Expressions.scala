object Expressions extends App {

    // expressions -> structures that can be reduced to a single value
    val myExpression = 12 + 15

    // if-expression -> an entire condition expression that is reduced to a single value
    val ifExpression = if (myExpression < 30) true else false

    val chainedIfExpression = 
        if (myExpression < 30) 0
        else if (myExpression > 50) 1
        else 2


    // printing
    println(f"If-expression result is $ifExpression")
    println(f"Chained-if-expression result is $chainedIfExpression")
}