package com.example.kotlinbasics

fun main() {
    /*var myName = "Frank"
    var myAge = 31

    val myLong: Long = 12_345_687_901_230
    val myFloat: Float = 13.37F
    val myDouble: Double = 13.37

    var isSunny = true
    isSunny = false

    val letterChar = 'A'
    val digitChar = '1'

    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    var myLength = myStr.length

    //print("Hello " + myName)
    //print("First character $firstCharInStr and the length of myStr is ${myStr.length}")
    //print("Last character " + lastCharInStr)

    var result = 5+3
    result /= 2

    val a = 5.0
    val b = 3
    var resultDouble: Double
    resultDouble = a/b
    print(resultDouble)

    val isEqual = 5 == 3
    print("\nisEqual is $isEqual")

    val isNotEqual = 5 != 5
    println("isNotEqual is $isNotEqual")

    println("is5greater3 ${-5>3}")

    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if(heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    } else {
        println("use technique")
    }

    val age = 17

    if(age >= 21) {
        println("now you may drink in the US")
    } else if(age >= 18) {
        println("you may vote now")
    } else if(age >= 16) {
        println("you may drive now")
    } else {
        println("you're too young")
    }

    when(age) {
        !in 0..20 -> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        in 16..17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var name = "Denis"

    if(name == "Denis") {
        println("welcome home denis")
    } else {
        println("Who are you?")
    }

    val isRainy = true
    if(isRainy)
        println("It's Rainy")

    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var x : Any = 13.37f
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    var xx = 1
    while(xx <= 10) {
        println("$xx")
        xx++
    }
    println("\n while loop is done")

    var y = 100
    while(y >= 0) {
        print("$y ")
        y -= 2
    }
    println("\n while loop is done")

    xx = 15
    do {
        print("$xx ")
        xx++
    } while(xx <= 10)
    println("\n while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    for(num in 1..10) {
        print("$num ")
    }

    for(i in 1 until 10) {
        print("$i ")
    }
    println("________")
    for(i in 10 downTo 1 step 2) {
        print("$i ")
    }

    /*for(i in 0..10000) {
        if(i == 9001) {
            println("IT'S OVER 9000!!")
        }
    }*/

    var humidityLevel = 80
    var humidity = "humid"

    while(humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")

        if(humidityLevel <= 60) {
            println("it's comfy now")
            humidity = "comfy"
        }
    }


    for(i in 1 until 20) {

        if(i/2 == 5) {
            continue
        }

        print("$i ")
    }
    print("Done with the loop")*/

    myFunction()
    var result = addUp(5, 3)
    print("result is " + result)

    var avg = avg(5.3, 13.37)
    print("result is $avg")

    //var name: String = "Denis"
    var nullableName : String? = "Denis"
    //nullableName = null

    //var len = name.length
    var len2 = nullableName?.length

    println(nullableName?.toLowerCase())

    nullableName?.let { println(it.length) }
    nullableName = null

    val name = nullableName ?: "Guest"
    println("name is $name")
}

fun avg(a:Double, b:Double): Double  {
    return (a+b)/2
}

// Parameter
fun addUp(a: Int, b: Int) : Int{
    return a+b
}

fun myFunction() {
    print("Called from myFunction")
}