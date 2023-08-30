package com.example.kotlinbasics

fun main() {
    //val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    //val numbers = intArrayOf(1, 2, 3, 4, 5, 6)

    val numbers = arrayOf(1,2,3,4,5,6)

    print("initial values ${numbers.contentToString()}")

    for(element in numbers) {
        print(" ${element+2}")
    }

    println()
    print(numbers[3])

    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1

    println("\nfinal values ${numbers.contentToString()}")

    val numbersD: DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)

    numbersD[0] = 6.0
    numbersD[4] = 2.0

    val days = arrayOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())

    for(fruit in fruits) {
        print(" ${fruit.name}")
    }

    for(index in fruits.indices) {
        print("${fruits[index].name} is in index $index")
    }


    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")
    println(anyTypes.size)
    println(months[1])

    for(month in months) {
        println(month)
    }
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    print(additionalMonths)

    val days2 = mutableListOf<String>("Mon", "Tue", "Wed")
    days2.add("Thu")
    days2[2] = "Sunday"
    days2.removeAt(3)
    val removeList = mutableListOf<String>("Mon", "Wed")
    days2.removeAll(removeList)
    println(days2)

    val fruits2 = setOf("Orange", "Apple", "Mango", "Grape", "Apple")
    println(fruits2.size)
    println(fruits2.toSortedSet())

    val newFruits = fruits2.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    print(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys){
        print("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit("Grape", 2.5), "OK" to Fruit("Apple", 1.0))

    val newDayOfWeek = daysOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"

    println(newDayOfWeek.toSortedMap())

    val doubleArrayList = ArrayList<Double>()
    doubleArrayList.add(2.1)
    doubleArrayList.add(2.6)
    doubleArrayList.add(2.7)
    doubleArrayList.add(3.3)
    doubleArrayList.add(3.5)

    var sum = 0.0;
    for(i in doubleArrayList) {
        sum += i;
    }
    println("avg: ${sum/doubleArrayList.size}")

    val lambdaSum: (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    println(lambdaSum(10, 5))

    val lambdaSumPrint = {a: Int, b: Int -> println(a+b)}
    lambdaSumPrint(10, 5)
}

data class Fruit(val name: String, val price: Double)

