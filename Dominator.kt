fun solution(A: IntArray): Int {
    val sortA = mutableListOf<Int>()
    var c = 0L
    var tempLast = Long.MIN_VALUE
    var valueResult = Long.MAX_VALUE

    if (A.isNotEmpty()) {
        sortA.addAll(A.sorted())
        c = 1
    }

    for (i in 0 until sortA.size) {
        if(tempLast == sortA[i].toLong()) {
            c++
        }

        tempLast = sortA[i].toLong()

        if (c > (sortA.size/2)) {
            valueResult = sortA[i].toLong()
            break;
        }
    }

    if (valueResult == Long.MAX_VALUE) return -1
    return A.indexOfFirst {
        it.toLong() == valueResult
    }
}
