fun solution(N: Int): Int {
    // var i = 1
    var c = 0

    var sqrtN = Math.sqrt(N.toDouble()).toInt()

    if (Math.pow(sqrtN.toDouble(), 2.toDouble()).toInt() != N) {
        sqrtN++
    } else {
        c++
    }

    for(i in 1 until sqrtN) {
        if (N % i == 0) c += 2
    }

    return c
}
