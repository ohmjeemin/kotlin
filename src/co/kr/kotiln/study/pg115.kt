package co.kr.kotiln.study


//함수
//fun String.lastChar(): Char = this.get(this.length -1)

//프로퍼티로 바꾸기
val String.lastChar: Char
    get() = get(length-1)
var StringBuilder.lastChar: Char    //확장함수 추가되었음
    get() = get(length-1)
    set(value:Char) {
        this.setCharAt(length-1, value)
    }

fun main(args: Array<String>) {
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
    val list = listOf(2,3,4,5,6)

   // list = listOf(*args)
    println(list)
}