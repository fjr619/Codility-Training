fun solution(A: Int, B: Int, K: Int): Int {
    var c = B/K - A/K
    if (A%K == 0) c++
    return c
}
