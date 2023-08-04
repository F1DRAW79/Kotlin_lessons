fun main(args: Array<String>) {
    calculateWordStat("BAMMWC ZTSKPZ LLXMOU BAMMWC BAMMWC BAMMWC IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB LLXMOU GSLXNL BAMMWC GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB IFYXBAB GSLXNL IFYXBAB LLXMOU BAMMWC IFYXBAB ZTSKPZ BAMMWC BAMMWC BAMMWC IFYXBAB LLXMOU")
}
fun calculateWordStat(input:String): String{
    val MainList: List<String> = input.split(" ").sorted()
    var Max = 0
    var Thisword: String = ""
    for (it in MainList){
        var count: Int = 0
        for (j in MainList)
            if (j == it) count += 1
        if (count > Max){Thisword = it
            Max = count
        }
    }
    return Thisword
}