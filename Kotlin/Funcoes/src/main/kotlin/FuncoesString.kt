fun main(){
    val string = "Programação Kotlin"

    println("Tamanho da string: ${string.length}")
    println("Posição (index) 0 da string: ${string[0]}")
    println(string.startsWith("Pro"))
    println(string.endsWith("abc"))

    println(string.substring(2, 4))

    println(string.replace("Kotlin", "Kotlin é show"))
    println(string.lowercase())
    print(string.uppercase())
}