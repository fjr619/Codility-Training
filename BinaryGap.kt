fun solution(N: Int): Int {
    // Implement your solution here
    val bin = Integer.toBinaryString(N)
    val oneList = mutableListOf<Int>()
    var maxGap = 0

    for ( i in bin.indices) {
        if (bin[i] == '1') {
            oneList.add(i)
        }
    }

    for (i in 0 until oneList.size-1) {
        val currGap = oneList[i+1] - oneList[i] - 1
        maxGap = Math.max(currGap, maxGap)
    }

    return maxGap
}
