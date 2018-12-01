package day1

import java.io.File

fun main(args: Array<String>) {
    val result = File("src/day1/input")
        .readLines()
        .map(String::toInt)
        .sum()

    print(result)
}


