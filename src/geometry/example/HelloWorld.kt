package geometry.example
import geometry.shapes.createRandomRectangle
import ch02.colors.Color
import ch02.colors.Color.*
import ch02.colors.fizzBuzz
import ch02.colors.readNumber
import ch02.colors.readNumber_1
import co.kr.kotiln.study.Button
import co.kr.kotiln.study.View
import co.kr.kotiln.study.lastChar as last
import co.kr.kotiln.study.set
import co.kr.kotiln.study.showOff
import geometry.example.*
import geometry.shapes.Expr
import java.io.BufferedReader
import java.io.StringReader
import java.util.*

class HelloWorld {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val view:View = Button()
            view.showOff()
//            //*page115 start
//            val list = arrayListOf(4,5,6)
//            println(list.joinToString(";","(",")"))
//            //*page115 end
//                println("kotlin".last())
//            println(set.javaClass)

//            // try .. catch
//            val reader = BufferedReader(StringReader("239"))
//            println(readNumber(reader))
//
//            // try 를 식으로
//            val readers = BufferedReader(StringReader("not a number"))
//            readNumber_1(readers)
//
//            val age=1
//
//            // map 의 이터레이션
//            val binaryReps = TreeMap<Char, String>()
//            for (c in 'A'..'F') {
//                val binary = Integer.toBinaryString(c.toInt()) //ASCII 코드를 2진 표현으로 바꿈
//                binaryReps[c] = binary
//            }
//
//            for((letter, binary) in binaryReps) {
//                println("$letter=$binary")
//            }

//            //log 에
//            A=1000001
//            B=1000010
//            C=1000011
//            D=1000100
//            E=1000101
//            F=1000110


            // arrayList 의 이터레이션
//            val list = arrayListOf("10","11","1001")
//            for((index, element) in list.withIndex()) {
//                println("$index: $element")
//            }


//            //log에
//            0: 10
//            1: 11
//            2: 1001



            // in을 컬렉션 범위와 원소 검사
//            fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'
//            fun isNotDigit(c:Char) = c !in '0'..'9'
//            println(isLetter('q'))
//            println(isNotDigit('x'))


//              for (i in 100 downTo 1 step 2) {
//                  print(fizzBuzz(i))
//              }
//            for(i in 1..10) {
//                print(fizzBuzz(i))
//            }

            //println(createRandomRectangle().isSquare)
            //println(mix(RED, YELLOW))
            //println(mixOptimized(BLUE, YELLOW))
            //println(eval(Sum(Sum(Num))))
        }
    }

}