package day1

fun day1Part2(depths: List<Int>?, treeSize: Int): Int {
    val treeMeasure: MutableList<Int> = mutableListOf()
    depths?.forEachIndexed {index, _ ->
        if((index + treeSize) <= depths.size){
            treeMeasure.add(depths.slice(index until (index + treeSize)).sum())
        }
    }
    return day1Part1(treeMeasure)
}
