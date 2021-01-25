package geometry.example

import geometry.shapes.Expr.*
import geometry.shapes.Expr
import java.lang.IllegalArgumentException

fun eval(e: Expr):Int{
    if(e is Num) {
        return e.value
    }
    if(e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown Expression")
}