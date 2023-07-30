fun main(args: Array<String>) {
    SugarStorage(10).increaseSugar(999)
}



class SugarStorage(var volume: Int){
    fun increaseSugar(v: Int) {
        if (v > 0) volume += v
    }
    fun decreaseSugar(v: Int){
        if(v>0){
            if(v>volume) volume = 0
            else volume -= v
            }
    }
}
