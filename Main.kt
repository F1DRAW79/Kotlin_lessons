fun main(args: Array<String>) {
    println(BugCivilian(12,"LOL").getSugarLimit())

}

open class Bug(val rank: Int, val name:String) {
    open fun getSugarLimit(): Int{
        return rank
    }

    open fun getId(): String{
        return "${rank}.${name}"
    }
}

class  BugCivilian(rank: Int, name: String ):Bug(rank, name){
    override fun getSugarLimit(): Int {
        return super.rank/2
    }
}