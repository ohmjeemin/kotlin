package co.kr.kotiln.study


var opCount = 0
const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation() {
    opCount++
}

fun reportOperationCount (){
    println("Operation performed $opCount times")
}