fun solution(A: IntArray): Int { 
    val setA = A.toHashSet().filter {
        it > 0
    }.sorted()
    
    var ans = 1
            
    for (i in 0 until setA.size) {
        if (setA[i] > 0 && setA[i] == ans) ans++
    }
   
    return ans
}
