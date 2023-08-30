package com.example.kotlinoop

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The Drivable is braking")
    }
}

open class Car2(override val maxSpeed: Double,
                val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0) range += amount
    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}