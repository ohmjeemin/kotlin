package ch02.colors

enum class Color (
    val r:Int, val g:Int, val b:Int // 상수의 프로퍼티를 정의
    ) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);
    }
