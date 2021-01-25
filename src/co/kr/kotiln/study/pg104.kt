package co.kr.kotiln.study

val set = hashSetOf(1,7,53)
val list = arrayListOf(1,7,53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun <T> Collection<T>.joinToString(
    collection : Collection<T>,
    seperator: String =", ",
    prefix : String ="(",
    postfix : String =")"
): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(seperator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}