fun solution(A: IntArray): Int {
    val sum = A.sum().toLong()
    var sumLeft = 0L
    var min = Integer.MAX_VALUE
    for (p in 0 until A.size-1) {
        sumLeft += A[p]
        val diff = (Math.abs(sum - 2 * sumLeft)).toInt()
        min = Math.min(min, diff)
    }
    return min
}
