//Continue e Break
fun main(){
    var i = 0;
    val stringGrande: String = "dsfdasdsadasdsa fsdgd"
    while (i < 80){
        if (i < 50){
            //break
            i++
            continue
        }
        println("${i}")
        i++
    }
}