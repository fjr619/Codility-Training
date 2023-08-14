fun solution(N: Int): Int {
    var min = Int.MAX_VALUE

    if (N == 1) return 2*(N+N)

    var sqrtN = Math.sqrt(N.toDouble()).toInt()

    if (Math.pow(sqrtN.toDouble(), 2.toDouble()).toInt() != N) {
        sqrtN++
    }

    for(i in 1..sqrtN) {
        if (N % i == 0) {
            min = Math.min(min, 2 * (i + N/i))
        }
    }

    return min
}

// or

// fun solution(N: Int): Int {
//     var min = Int.MAX_VALUE

//     var sqrtN = Math.sqrt(N.toDouble()).toInt()

//     if (Math.pow(sqrtN.toDouble(), 2.toDouble()).toInt() != N) {
//         sqrtN++
//     }

//     for(i in sqrtN downTo 1) {
//         if (N%i == 0) return 2 * (i + N/i)
//     }

//     return 2*(N+N)
// }
