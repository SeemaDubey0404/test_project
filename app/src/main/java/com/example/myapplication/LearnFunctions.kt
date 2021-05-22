package com.example.myapplication

fun main() {
    myfunction()
    //passing a value to function then it is called arguments
    var result = addUp(5, 3)
    print("result is $result")
}

// two parameters in the function addUp, input
fun addUp(a: Int, b: Int): Int {
    return a + b // output
}

fun myfunction() {
    println("called from myfunction")
}