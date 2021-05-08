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
    print("\n"+isEqual)

    //assignment operators

}