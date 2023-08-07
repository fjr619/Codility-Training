fun solution(A: IntArray): Int {
//    val c = A.groupBy {
//        it
//    }.filter {
//        it.value.size % 2 == 1
//    }.map {
//        it.key
//    }.first()
//    System.out.println("$c")

    var result = 0
    A.forEach {
        result = result xor it
    }

    return result
}
