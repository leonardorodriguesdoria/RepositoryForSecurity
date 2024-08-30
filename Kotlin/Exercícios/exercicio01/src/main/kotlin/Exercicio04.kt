fun main(){
    //quadrado()
//    triangulo()
    //qualASaida(4);
    portaria()
}

/*
* QT01
* Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).
* */
fun quadrado(){
    print("Por favor, informe o 1º lado:")
    val lado1 = readln();

    print("Por favor, informe o 2º lado:")
    val lado2 = readln();

    if (lado1 != null && lado1 != "" && lado2 != null && lado1 != ""){
        val x = lado1.toInt();
        val y = lado2.toInt();

        if (x == y){
            println("É um quadrado")
        }else{
            println("Não é um quadrado")
        }
    }
}

/*
* Qt02
* Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais)
* */

fun triangulo(){
    print("Por favor, informe o 1º lado:")
    val lado1 = readln();

    print("Por favor, informe o 2º lado:")
    val lado2 = readln();

    println("Por favor, informe o 3º lado:")
    val lado3 = readln();

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != ""){
        val x = lado1.toInt();
        val y = lado2.toInt();
        val z = lado3.toInt()
        if (x == y && y == z){
            println("É um triângulo equilátero")
        }else{
            println("Não é um triângulo equilátero")
        }
    }
}

/*
Qt03
* Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
 fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
 }
* */
//Considerando que o parâmetro da função recebe o valor 4
fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

/*Qt04
* Escreva um programa para ser usado na de portaria de um evento.
 a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
 b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes.  Mensagem: “Negado. Convite inválido.”.
 c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada.  Mensagem: “Negado. Convite inválido.”.
 d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”
* */

fun portaria(){
    println("Por favor, informe sua idade: ")
    val idade = readln()

    if (idade != null && idade != ""){
        if (idade.toInt() < 18){
            println("Negado.Menores de idade não são permitidos")
            return
        }
    }

    println("Agora por favor, informe o seu tipo de convite")
    val tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != ""){
        var tipoConvite = tipoConvite.lowercase()

        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo"){
            println("Qual o código do convite? :")
            var codigoConvite = readln();

            if (codigoConvite != null && codigoConvite != ""){
                codigoConvite = codigoConvite.lowercase()
                if (tipoConvite == "comum" && codigoConvite.startsWith("xt")){
                    println("Welcome :)")
                } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigoConvite.startsWith("xt")){
                    println("Welcome :)")
                } else{
                    println("Negado. Convite inválido")
                }
            }
        }else{
            println("Negado. Convite inválido")
            return
        }
    }
    println("""TABELA CÓDIGO INGRESSOS
        |Código(XL) - Para ingressos premium e/ou ingressos luxo
        |Código(XT) - Para Ingressos comum
    """.trimMargin())
    val codigoConvite = readln()

    when(codigoConvite){
        "XL" ->{
            println("Ingresso premium/luxo")
        }
        "XT" ->{
            println("Ingresso comum")
        }
    else ->{
        println("Negado. Convite inválido")
    }
    }
    println("Welcome :)")
}

