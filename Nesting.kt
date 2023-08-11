fun solution(S: String): Int {
    var t = 0
    
    if(S.isEmpty()) return 1
    for (i in 0 until S.length) {
        if (S[i] == '(') t += 1
        else if (S[i] == ')') t -= 1
        
        if (t < 0) return 0
        
    }
    
    return if (t != 0) 0 else 1
}
