package com.example.edu

class Person (val name: String, val age: Int)
fun main() {
    val name: String? = "jeemin"
    println("name: $name length: ${name?.length ?: -1}")

    // 스마트 캐스트
    var test: Number = 12.2

    // 자료형 검사하기
    if (test is Int) {
        print(test)
    } else if (test !is Int) {
        print("Not a Int")
    }

    //Any형으로 자료형을 결정하지 않은 채로 변수를 선언하면 is로 검사한 자료형으로 캐스팅 된다
    val x: Any
    x = "Heelo"
    if (x is String) {
        println(x.length)
    }

    checkArg("lulu")
}

//Any형으로 인자를 받는 함수 만들기
fun checkArg(x: Any) {
    if(x is String) {
        println("str")
    }
    if(x is Int) {
        println("int")
    }
}
