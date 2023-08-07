fun solution(X: Int, Y: Int, D: Int): Int {
    var distance = Y - X
    var plus = 0
    if (distance % D != 0) plus = 1
    var hop = distance / D + plus
    return hop
}
