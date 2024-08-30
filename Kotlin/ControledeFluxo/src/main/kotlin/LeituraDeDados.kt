fun main(){
    println("Por favor, informe seu nome:");
    val nome: String = readln();
    if (nome.endsWith("o")){
        println("Seja bem vindo, $nome")
    }else if (nome.endsWith("a")){
        println("Seja bem vinda, $nome")
    }
}