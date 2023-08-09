fun solution(A: IntArray): Int {
    A.sort()
    val a = A[A.size-3] * A[A.size-2] * A[A.size-1]
    val b = A[0] * A[1] * A[A.size-1]
    return Math.max(a,b)
}
