class SphinxesException(): Exception()
fun checkClient(client: String){
    if(client == "dog") throw SphinxesException()
}





fun main(args: Array<String>) {
    checkClient("dog")
}