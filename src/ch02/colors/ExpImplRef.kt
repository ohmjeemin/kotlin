package ch02.colors

import geometry.shapes.Expr
import geometry.shapes.Expr.*

//refactoring 1 . 함수를 값으로
fun eval_2(e:Expr):Int =
    if(e is Num) {
        e.value
    }
    else if (e is Sum) {
        eval(e.right) + eval(e.left)
    }else{
        throw IllegalArgumentException("Unknown expression")
    }
