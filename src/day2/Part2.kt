package day2

import java.io.File

fun main(args: Array<String>) {
    val lines = File("src/day2/input").readLines()

    var max = 0
    var result = ""

    for (i in lines.indices) {
        for (k in lines.indices) {
            if (i == k) continue
            var same = 0
            var resultTemp = ""
            for (x in lines[i].toList().indices) {
                if (lines[i][x] == lines[k][x]) {
                    same++
                    resultTemp += lines[i][x]
                }
            }
            if (same > max) {
                result = resultTemp
                max = same
            }
        }
    }

    print(result)
}