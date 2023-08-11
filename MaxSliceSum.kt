fun solution(A: IntArray): Int {
    var sum: Long = Integer.MIN_VALUE.toLong()
    var maxSum: Long = Integer.MIN_VALUE.toLong()

    A.forEach {
        sum = Math.max(sum+it.toLong(), it.toLong())
        maxSum = Math.max(maxSum, sum)
    }

    return maxSum.toInt()
}
