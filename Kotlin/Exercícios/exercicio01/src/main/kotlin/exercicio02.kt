import java.text.StringCharacterIterator

fun main(){

    anosInformacoesTemporarias(3)
    println("Questão02: ${quantidadeCaracteres("Leonardo")}")
    println("Questão03: ${cuboNumero(3)}")
    println("Questão04: ${converterMilhaParaQuilometro(2.053)}")
    trocaDeCaracteres("Leonardo")
}

//Qt01
/*
* Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
* */
fun anosInformacoesTemporarias(ano:Int){
    println("Quantidade de dias: ${ano * 365}")
    println("Quantidade de meses: ${ano * 12}")
    println("Quantidade de horas: ${ano * 8766}")
    println("Quantidade de minutos: ${ano * 525960}")
    println("Quantidade de segundos: ${ano * 31.536_000}")
}

//Qt02
/*
* Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres
* */

fun quantidadeCaracteres(string: String): Int{
    return string.length
}

//Qt03
/*
*Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
* */
fun cuboNumero(numero: Int): Int{
    return numero * numero * numero
}

//Qt04
/*
* Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
* */
fun converterMilhaParaQuilometro(milhas: Double): Double{
    return milhas * 1.6f
}

//Qt05
/**
 * Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
 * a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
 * b. Escrever uma função para a troca de letras e impressão do valor final.
 * c. String final deve estar com todas as letras minúsculas
 */

fun trocaDeCaracteres(string: String) {
    //Leonardo
    var alteredString: String = string.replace("A", "x", true)
    println(alteredString.lowercase())
}

//Qt06
/*
* Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.
* */

//fun quantidadeCaracteres (string: String): Int = (string.length)
//fun cuboNumero (numero: Int): Int = (numero * numero * numero)
//fun converterMilhaParaQuilometro (milhas: Double): Double = (milhas * 1.6f)