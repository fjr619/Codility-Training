import java.util.Stack

fun solution(H: IntArray): Int {
    var stack = Stack<Int>()
    var count = 0
    H.forEach {
        while (!stack.empty() && it < stack.peek()) {
            stack.pop()
        }
        
        if (!stack.empty() && it == stack.peek()) {
            
        } else {
            stack.push(it)
            count++
        }
    }
    
    return count
}
