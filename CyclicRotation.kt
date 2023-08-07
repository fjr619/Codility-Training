fun solution(A: IntArray, K: Int): IntArray {
    // Implement your solution here
    val result = IntArray(A.size)
    A.forEachIndexed { index, value ->
        result[(index + K) % A.size] = value
    }
    return result
}
