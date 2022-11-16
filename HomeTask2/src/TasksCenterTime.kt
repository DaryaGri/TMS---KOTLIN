fun main() {

    println(center(mutableListOf(1.0, 2.0, 3.0)))
    println(times(listOf(1, 2, 3), listOf(2, 3, 4)))
}

fun center(list: MutableList<Double>): MutableList<Double> =
    when {
        list.isEmpty() -> list
        else -> {
            var average = list.sum() / list.size
            for (i in list.indices) {
                list[i] -= average
            }
            list
        }
    }

fun times(a: List<Int>, b: List<Int>): Int =
    when {
        a.isEmpty() || b.isEmpty() -> 0
        else -> {
            var result = 0
            for (i in a.indices) {
                result += a[i] * b[i]
            }
            result
        }
    }