package day1

fun main(){
    val day1 = Day1()
    val depths = day1.readFileUsingGetResource("/day1/input.txt")?.lines()
    val intDepths = depths?.filter { x: String? -> x != "" }?.map { x -> x.toInt() }
    println("Day 1 Part 1 Solution: ${day1Part1(intDepths)}")
    println("Day 1 Part 2 Solution: ${day1Part2(intDepths, 3)}")
}

class Day1 {
    fun readFileUsingGetResource(fileName: String)
            =  this::class.java.getResource(fileName)?.readText(Charsets.UTF_8)
}
