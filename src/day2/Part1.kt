package day2

import java.io.File

fun main(args: Array<String>) {
    val lines = File("src/day2/input").readLines()

    var two = 0
    var three = 0

    for (l in lines) {
        val charOccurMap = l.toCharArray().toList()
            .groupingBy { c -> c }
            .eachCount()
        if (charOccurMap.containsValue(2))
            two += 1
        if (charOccurMap.containsValue(3))
            three += 1
    }

    print(two * three)
}
