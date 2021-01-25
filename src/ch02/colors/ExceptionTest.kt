package ch02.colors

import java.io.BufferedReader
import java.lang.NumberFormatException

class ExceptionTest {
}

fun readNumber(reader:BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}

fun readNumber_1 (reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e: NumberFormatException) {
        return
    }
    println(number)
}