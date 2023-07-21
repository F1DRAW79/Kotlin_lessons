fun main() {
    val name = NibirunianClass()
    val Name: String = readln()
    name.createNamePlate(Name)
}

class NibirunianClass(){
    var namePlate: String = ""
    fun createNamePlate(name: String){
        namePlate = "Live long and prosper, $name"
        println(namePlate)
    }
}
