fun solution(A: IntArray): Int {
    var min = Double.MAX_VALUE
    var index = -1
    for (i in 0 until A.size-2) {
        val av1 = (A[i] + A[i+1]).toDouble() / 2
        val av2 = (A[i] + A[i+1] + A[i+2]).toDouble() / 3

        if (min > av1 || min > av2) {
            index = i
            min = Math.min(av1, av2)
        }
    }

    if (min > ((A[A.size-2] + A[A.size-1]).toDouble()/2)) {
        min = A[A.size-2].toDouble()
        index = A.size-2
    }

    return index
}
