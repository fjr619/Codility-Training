fun solution(A: IntArray): Int {
    val b = IntArray(A.size)
    var count = 0
    var sum = 0L
    for (i in 0 until A.size) {
        if(A[i] == 0) {
            count += 1
        }
        
        b[i] = count
        
        if(A[i] == 1) {
            sum += b[i]
        }
    }
    
    if (sum > 1000000000L) sum = -1
    
    return sum.toInt()
}
