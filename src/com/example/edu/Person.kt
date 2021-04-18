package com.example.edu

class Person (val name: String, val age: Int)
var name:String? = "jeemin"
fun main() {
    name = "hi"
    println("name: $name length: ${name?.length?:-1}")
}