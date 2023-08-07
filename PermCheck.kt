fun solution(A: IntArray): Int {
    val set = mutableSetOf<Int>()
    set.addAll(A.toList())

    val totalSize: Long = set.size.toLong()
    val totalSum: Long = (1 + totalSize) * totalSize / 2
    var currentSum: Long = 0
    A.forEach {
        currentSum += it
    }

    return if (totalSum == currentSum) 1 else 0
}
