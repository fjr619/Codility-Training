fun solution(S: String): Int {
  
   var a = mutableListOf<Char>()

   if (S.isEmpty()) return 1
   if (S[0] == '}' || S[0] == ']' || S[0] == ')')  return 0
   
   for (i in 0 until S.length) {
              
       if (S[i] == '{' || S[i] == '[' || S[i] == '(') {
           a.add(S[i])
       } else if (a.size > 0 && (a[a.size - 1] == '{' && S[i] == '}' ||
            a[a.size - 1] == '[' && S[i] == ']' ||
            a[a.size - 1] == '(' && S[i] == ')')
           ) {
    		a.removeAt(a.size - 1)            
       } else {
           return 0
       }
       
   }
       
    return if (a.size == 0) 1 else 0
}

//atau
// fun solution(S: String): Int {

//    var a = mutableListOf<Int>()
//    if (S.isEmpty()) return 1
//    for (i in 0 until S.length) {
//           var t = 0

//        if (S[i] == '[') t += 1
//        else if (S[i] == '(') t += 2
//        else if (S[i] == '{') t += 3
       
//        else if (S[i] == ']') t -= 1
//        else if (S[i] == ')') t -= 2
//        else if (S[i] == '}') t -= 3
       
//        if (i == 0 && t < 0) return 0 //first index ] } )
//        if (a.size > 0 && t < 0 && t != -a[a.size-1]) return 0 //current value compare to latest value a, return 0 if not same
//        else if (a.size > 0 && t < 0) a.removeAt(a.size - 1) // current value compare to latest value a, if same remove value from a
//        else a.add(t) //add value to a
//    }
   
//    return if (a.size ==0) 1 else 0
   
// }
