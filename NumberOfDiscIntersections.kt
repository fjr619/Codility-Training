//not 100%

fun solution(A: IntArray): Int {
    val diskStartPoint = mutableListOf<Long>()
    val diskEndPoint = mutableListOf<Long>()

    for (i in 0 until A.size) {
        diskStartPoint.add((i - A[i]).toLong())
        diskEndPoint.add(i + A[i].toLong())
    }

    diskStartPoint.sort()
    diskEndPoint.sort()

    var openDisk = 0
    var intersection = 0L

    var j = 0
    while (diskStartPoint.size > 0 && j < diskEndPoint.size) {
        var i = 0
        while (i < diskStartPoint.size) {
            if (diskStartPoint[i] <= diskEndPoint[j]) {
                if (openDisk > 0) {
                    intersection += openDisk
                }
                openDisk += 1
                diskStartPoint.removeAt(i)
            } else {
                openDisk -= 1
                i++
                break
            }
        }
        j++
    }

    return if (intersection > 10000000L) -1 else intersection.toInt()
}
