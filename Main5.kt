import kotlin.math.pow

fun main(args: Array<String>) {
    println(getCubeList(9))

}
fun getCubeList(n:Int): List<Int>{
    return List<Int>(n, { i -> i*i*i})
}
