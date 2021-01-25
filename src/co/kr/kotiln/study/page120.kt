package co.kr.kotiln.study

class page120 {
}

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a VIew!222")
fun Button.showOff() = println("I'm a Button!")

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff()
}