package co.kr.kotiln.study


val maps = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
infix fun Any.to(other: Any) = Pair(this,other)

fun main(args: Array<String>) {
    val (number, name) = 1 to "one"
    println("number: $number")
    println("name: $name")

    val strings = listOf("first", "second", "fourteen")
    for((index,element) in strings.withIndex()){
        println("$index: $element")
    }
}