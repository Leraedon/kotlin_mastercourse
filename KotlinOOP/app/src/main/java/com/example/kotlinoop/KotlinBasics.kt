package com.example.kotlinoop

fun main() {
    /*var denis = Person("Denis", "Panjuta", 31)
    denis.stateHobby()
    denis.age = 32
    println("Denis is ${denis.age} years old")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")

    var phone1 = MobilePhone("a", "b", "c")

    //var myCar = Car()
    //println("brand is : ${myCar.myBrand}")


    val user1 = User(1, "Denis")


    user1.name = "Michael"
    val user2 = User(1, "Michael")

    println(user1.equals(user2))

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Denis Panjuta")
    println(updatedUser)

    println(updatedUser.component1())
    println(updatedUser.component2())

    val (id, name) = updatedUser
    println("id=$id, name=$name")*/
}
/*
data class User(val id: Long, var name: String)

class Car() {
    lateinit var owner: String

    val myBrand: String = "BMW"
    get() {
        return field.lowercase()
    }

    var maxSpeed: Int = 250
    get() = field

    init {
        this.owner = "Frank"
    }
}

class Person(firstName: String = "john", lastName: String = "Joe") {
    // Member Variables - Properties
    var age : Int? = null
    var hobby: String = "watch Netflix"
    var firstName : String? = null

    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName= $firstName and lastName = $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName) {
                this.age = age
            }

    // Member functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby")
    }
}

class MobilePhone(osName: String, brand: String, model: String) {
    init {
        println("osName: $osName, brand: $brand, model: $model")
    }
}*/