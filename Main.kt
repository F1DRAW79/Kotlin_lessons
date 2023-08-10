class DogException() : Exception()
class CatException() : Exception()
fun main(args: Array<String>) {
    checkClient("dog")
}
fun checkClient(client : String){
    if(client == "dog") throw DogException()
    if(client == "cat") throw CatException()
}