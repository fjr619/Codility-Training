fun solution(N: Int, A: IntArray): IntArray {
    var list = IntArray(N)
    var currMax = 0
    var lastMax = 0
    
    A.forEach {

        if (it >= 1 && it <= N) {
            if (list[it-1] < lastMax)
            	list[it-1] = lastMax + 1
            else
            	list[it-1] = list[it-1] + 1
            currMax = Math.max(currMax, list[it - 1])
        }  else {
            lastMax = currMax
        }
        
    }
    
    for (i in 0 until list.size) {
        if (list[i] < lastMax) {
            list[i] = lastMax
        }
    }
        
    return list
}
