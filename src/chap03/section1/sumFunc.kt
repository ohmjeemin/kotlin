package chap03.section1

fun sum(a:Int, b:Int):Int {
    var sum = a + b
    return sum
}

fun add(name:String="지미니", email:String="default") {
    println("add 호출")
    println("$name  $email")
}

fun main() {
//    add()
    normalVarargs(3,4,2)
}

//가변인자 varargs

fun normalVarargs(vararg counts: Int) {
    for(num in counts) {
        println("$num")
    }
}