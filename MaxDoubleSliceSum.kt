fun solution(A: IntArray): Int {
    var LR = MutableList(A.size) {0}
    var RL = MutableList(A.size) {0}
    var sum = 0
    var max = 0

    if (A.size <=3) return 0

    for (i in 1 until A.size-1 ) {
        sum = Math.max(A[i], if (sum + A[i] > 0) sum + A[i] else 0)
        LR.set(i, sum)
    }


    sum = 0
    for (i in A.size-2 downTo 1) {
        sum = Math.max(A[i], if (sum + A[i] > 0) sum + A[i] else 0)
        RL.set(i, sum)
    }

    for (i in 0 until (A.size-2)) {
        max = Math.max(max, LR[i] + RL[i+2])
    }

    return max

}
