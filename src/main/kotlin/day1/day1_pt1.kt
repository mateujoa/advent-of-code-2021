package day1

fun day1Part1(depths: List<Int>?): Int {
    var currentDepth = 0
    var increased = 0
    depths?.forEach { depth ->
        run {
            if (currentDepth != 0 && currentDepth < depth) {
                increased++
            }
            currentDepth = depth
        }
    }
    return increased
}
