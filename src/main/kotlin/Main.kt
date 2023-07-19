fun main(args: Array<String>){
    println(calculateBugMentions(listOf("BUG", "fsdfs", "sdadad", "BUG", "BUG")))
}

fun calculateBugMentions(input: List<String>): Int{
    var count = 0
    for(i in input){
        if(i == "BUG") count++
    }
    return count
}