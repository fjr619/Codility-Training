fun solution(A: IntArray): Int {
    val totalSize: Long = A.size.toLong() + 1
    val totalSum: Long = (1 + totalSize) * totalSize / 2
    var currentSum: Long = 0
    A.forEach {
        currentSum += it
    }

    return (totalSum - currentSum).toInt()
}
