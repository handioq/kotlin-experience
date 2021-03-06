/**
 * Created by Admin on 05-Aug-17.
 * Let's get it started...
 */

import basic.*

fun main(args: Array<String>) {
    // functions:
    println("Hello World")
    println("Sum of two numbers 3 and 5: " + sum(3, 5))
    println("Sum of 19 and 23 is ${sumExpressionBody(19, 23)}")
    printSum(-1, 8)

    // string templates:
    printSimpleStringTemplate(10)
    printStringLength("OlejaCpp")

    // conditional expressions:
    println(max(10, 20))
    println(max2(100, 200))
    println(max3(1000, 2000))

    whenExpression(2)
    whenExpression2(15)
    whenExpression3(20)
}