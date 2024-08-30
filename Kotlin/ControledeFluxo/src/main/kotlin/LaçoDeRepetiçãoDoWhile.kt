//Operador "Do While"
//Do inglês significa: "Faça enquanto..." em inglês
/*
* A diferença crucial entre "while" e "do while", é que o
* do while, será executado pelo menos uma vez, enquanto que o while precisa que
* a condição seja verdadeira para executar os comandos, se a condição for falsa
* então o while nem executa
* */
fun main(){
    do {
        println("Qual o seu nome? :")
        val value: String = readln()
    } while (value == "")
}