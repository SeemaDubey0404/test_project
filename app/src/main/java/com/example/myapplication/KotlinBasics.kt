package com.example.myapplication

fun main() {
    //TODO: understanding val and var
    /*val - immutable variable, cannot be changed at runtime, cannot be re-assigned
    var - mutable variable, can be changed at the run time, can be reassigned*/

    // an immutable variable
    //val myName = "Semma"

    var myName = "Seema" // a mutable variable
    myName = "Rani" //changed the value of myName at runtime
    var myAge = 28;
    //type inference - kotlin assign a type to any variable
    /*
    byte - 8bit
    short -16 bit
    int 32 -bit
    long -64 bit
     */
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_0769_8676_6567_578

    val myFloat: Float = 13.32F
    val myDouble: Double = 3.12354789876653234

    //boolean
    var isSunny = false

    //characters
    val letterChar = 'A'
    val digitChar = '1'

    val mystr = "Hello World"
    var firstCharinStr = mystr[0]
    var lastString = mystr[mystr.length - 1]
    print("\nFirst character " + firstCharinStr)
    print("\nLast character " + lastString)
    //  print("Hello "+myName)
    //  or
    print("\nHello $myName")

    //Artithemetic operators (+ _ * %)
    var a = 10
    var b = 3.0
    var result = a + b
    var resultDouble: Double = a / b
    print("\n" + resultDouble)


    //comparision operator
    //val isEqual = 5 != 5
    val isEqual = 5 == 5
    print("\n" + isEqual)

    //assignment operators
    // if else statement

    var heightperson1 = 190;
    var heightperson2 = 178;
    if (heightperson1 > heightperson2) {
        println("use raw force")
    } else if (heightperson1 == heightperson2) {
        println("use your power technique 123")
    } else {

        println("\n use technique")
    }
    var age = 17;
    if (age >= 21) {
        println("you may drive")
    } else if (age >= 18) {
        println("you may vote")
    } else if (age == 18) {
        println("you can work ")
    } else {
        println("you are too young")
    }
    when (age) {
        !in 21..150 -> println("you may drive") // not within 20-150
        in 21..150 -> println("you may drive") //  within 20-150
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else -> println("you are too young")
    }

    var ageNew = 31
    if (ageNew == 31)
        println("you are above 30")

    var myString = "Seema"
    if (myString.equals("seema")) {
        println("my name is seema")
    } else {
        println("myname is rani")
    }
    var isRainy = false
    if (isRainy) {
        println("bring pakodas")
    } else {
        println("need cold coffee")
    }
    //Switch statements
    var season = 5
    when (season) {
        1 -> println("spring")
        2 -> println("summer")
        3 -> {
            println("fall")
            println("Autmn")
        }
        4 -> println("winter")
        else -> println("invalid season")
    }

    var month = 3
    when (month) {
        in 3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 9..11 -> println("fall")
        12, 1, 2 -> println("winter")
        else -> println("invalid season")
    }
    //TODO is keyword in kotlin
    //is keyword , getting data type of x
    var x: Any = 13.56
    // var x: Any = 13.56f
    when (x) {
        is Int -> println("$x is an int")
        !is Double -> println("$x is not a double")
        is Double -> println("$x is  a double")
        is String -> println("$x is a string")
        else -> println("$x is non of the above")
    }

    //TODO understanding loops
    //while loop
    var z = 1
    while (z <= 10) {
        print("$z")
        z++
    }
    println("\n while loop is done")

//TODO WRITE A While loop to print every second value decending from 100 to 0, like 100. 98,96...

    var y = 100
    while (y >= 0) {
        print("$y")
        y -= 2
    }
    println("\n while loop is done")


//TODO write a do while loop
//do while runs once always without checking the condition
    var d = 15
    do {
        print("$d")
        d++
    } while (d <= 10)
    println("\n do while loop is done")

//another example for do while loop
    var felTtemp = "cold"
    var roomTemp = 10

    while (felTtemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            felTtemp = "comfy"
            println("it is comfy now")
        }
    }
//TODO Learn for loop
    for (num in 1..10) {
        print("$num")
    }
    for (j in 1 until 10) {
        print("$j ")
    }
    for (k in 10 downTo 1) {
        print("$k")
    }
    for (m in 10 downTo 1 step 2) { // same as   for ( m  1.untill(10))
        print("$m")
    }

    //TODO write a for loop that runs from 0-10000, once its at 9 it should write "ITS over 9001
    var o = 0
    for (o in 0..10000) {
        if (o == 9001) {
            print("its over 9")
        }
    }
    // TODO: 5/22/2021  *write a while loop the checks the humidity(not the humidity level) the variable humiditylevel starts
    //  at 80 , the variablehumidity is initialized with humid, if it is humid, it
    // should reduce the humidity level by 5 and print humidity reduced
    //  once the humidity is below 60 it should print its comfy now and set the humidity to comfy

    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        print("\n$humidityLevel")
        if (roomTemp < 60) {
            humidity = "comfy"
            println("\n it is comfy now")
        }
    }
    //working with functions
    myfunction();

}





