fun solution(A: IntArray): Int {

    if (A.isEmpty()) return 0

    var min = A[0]
    var diff = 0
    var maxDiff = 0
    for (i in 1 until A.size) {
        min = Integer.min(min, A[i])

        if(A[i] > A[i-1]) {
            diff = A[i] - min
        }

        maxDiff = Integer.max(diff, maxDiff)
    }

    return maxDiff
}
