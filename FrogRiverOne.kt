fun solution(X: Int, A: IntArray): Int {
    val tempArray = HashSet<Int>()

    for ((index, value) in A.withIndex()) {
        tempArray.add(value)

        if (tempArray.size == X) {
            return index
        }
    }
    return -1
}
