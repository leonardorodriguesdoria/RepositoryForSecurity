fun main(){

    helloWorld()
    println(soma(5, 5))
    println("A soma de 5 e 5 é ${soma(5, 5)}")
}

fun soma(numero1: Int, numero2: Int): Int{
    return (numero1 + numero2);
}

fun helloWorld(){
    println("Hello World")
}