fun solution(A: IntArray): Int {
    A.sort()

    for (i in 0 until A.size-2) {
        //if (A[i] > A[i+2] - A[i+1])
        if (A[i].toLong() + A[i+1].toLong() > A[i+2].toLong()) {
            return 1
        }
    }

    return 0
}
