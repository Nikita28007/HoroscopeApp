package com.horoscope.app

class Horoscope() {

    var image = 0
    lateinit var name: String
    lateinit var description: String

    constructor(image: Int, name: String) : this() {
        this.image = image
        this.name = name
    }

    constructor(image: Int, name: String, description: String) : this() {
        this.image = image
        this.name = name
        this.description = description
    }

}