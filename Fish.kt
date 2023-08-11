fun solution(A: IntArray, B: IntArray): Int {
    val ds = mutableListOf<Int>()
    var c = 0
    for (i in 0 until B.size) {
        if (B[i] == 1) ds.add(A[i])
        else {
            while(ds.size > 0) {
                if (ds[ds.size - 1] > A[i]) { c++; break }
                else if (ds[ds.size - 1] < A[i]) { ds.removeAt(ds.size - 1); c++ }
            }
        }
    }
    
    return A.size - c
}
