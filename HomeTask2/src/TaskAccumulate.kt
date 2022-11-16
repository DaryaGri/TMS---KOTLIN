fun main() {

    println(accumulate(mutableListOf(1, 2, 3, 4)))

}

fun accumulate(list: MutableList<Int>): MutableList<Int> {
    var sum = 0
    for (i in list.indices) {
        list[i] = sum + list[i]
        sum = list[i]
    }
    return list
}

