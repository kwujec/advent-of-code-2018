package day1

import java.io.File

fun main(args: Array<String>) {
    print(yoyo())
}


fun yoyo(): Int {
    val ints = File("src/day1/input")
        .readLines()
        .map(String::toInt)

    val store = mutableListOf(0)
    var total = 0

    while (true) {
        for (i in ints) {
            total += i
            if (store.contains(total)) {
                return total
            }
            store.add(total)
        }
    }
}

