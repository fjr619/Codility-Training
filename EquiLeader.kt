fun solution(A: IntArray): Int {
    val sortA = A.sorted()
    var c = 1L
    var leader = Long.MAX_VALUE

    //find leader
    for(i in 1 until A.size) {
        if (sortA[i] != sortA[i-1]) c = 1
        else c++

        if (c > sortA.size/2) {
            leader = sortA[i].toLong()
            break
        }
    }

    //count leader in original A
    var n = 0
    for (i in 0 until A.size) {
        if (A[i] == leader.toInt()) n++
    }

    var eql = 0
    c = 0

    for (i in 0 until A.size) {
        if (A[i] == leader.toInt()) c++
        if (i+1 < 2*c && A.size-i-1 < 2*(n-c)) eql++
    }

    return eql
}
