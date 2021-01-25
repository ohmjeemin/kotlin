package ch02.colors

import geometry.shapes.Expr
import geometry.shapes.Expr.*

//refactoring 2 . if를 when으로
fun eval(e:Expr):Int =
    when(e) {
        is Num ->
            e.value
        is Sum ->
            eval(e.left) + eval(e.right)
        else ->
            throw java.lang.IllegalArgumentException("Unknown")
    }
