package chap03.section1

fun sum(a:Int, b:Int):Int {
    var sum = a + b
    return sum
}

fun add(name:String="지미니", email:String="default") {
    println("add 호출")
    println("$name  $email")
}


//가변인자 varargs

fun normalVarargs(vararg counts: Int) {
    for(num in counts) {
        println("$num")
    }
}
//람다식
// 반환 자료형이 아예 없거나 매개변수가 하나만 있을 때
val greet: () -> Unit = {println("Hello world")}
val square: (Int) -> Int = {x-> x*x }

// 람다식 안에 람다식이 있을 때
val nestedLambda: () -> () -> Unit = {{println("nestedd")}}

fun highOrder(sum:(Int, Int)->Int, a:Int, b:Int) :Int {
    return sum(a,b)
}

// 다른 함수의 참조에 의한 일반 함수 호출
// 일반 함수를 또 다른 함수의 인자에서 호출하는 고차 함수의 경ㅇ우
fun sum2(x:Int, y:Int)=x+y
//이것을 고차 함수인 funcParam()에서 호출
fun funcParam(a:Int, b:Int, c:(Int,Int)->Int):Int {
    return c(a,b)
}


fun main() {
    // add()
    normalVarargs(3,4,2)
    var result: Int
    result = highOrder({x,y-> x+y}, 10,20)
    println(result)
    // 인자의 반환값이 없는 람다식 함수
    val out: () -> Unit = {println("hello world!")}
    out()
    val new = out
    new()
    //아래 코드는 sum이 람다식이 아니기 때문에 오류가 난다
    //funcParam(3,2,sum)

    funcParam(3,2,::sum)
}
