package geometry.example
import ch02.colors.Color.*
import ch02.colors.Color



fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"

    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE

        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN

        else -> throw Exception("Dirty color")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {  //when에 아무 인자가 없으면 조건이 불리언 결과를 계산해야 한다.
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW && c2 ==RED)->
            ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
                (c1 == BLUE && c2 == YELLOW) -> GREEN

        else -> throw Exception ("Dirty color")
    }

