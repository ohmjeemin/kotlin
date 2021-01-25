package ch02.colors

import geometry.shapes.Expr
import geometry.shapes.Expr.*

fun eval_1(e:Expr):Int {
    if(e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}