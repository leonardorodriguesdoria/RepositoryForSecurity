fun main(){

}

fun bonusWhen(cargo: String): Float{
    var bonus = 0f
    when(cargo){
        "Gerente" ->{
            bonus = 2000f
        }
        "Coodenador" ->{
            bonus = 1500f
        }
        "Engenheiro de Software" ->{
            bonus = 1000f
        }
        "Estagiário" ->{
            bonus = 500f
        }
    }
    return bonus
}
