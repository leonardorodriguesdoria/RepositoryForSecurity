fun maiorDeIdade(idade: Int){
    if (idade >= 18){
        println("Maior de idade")
        if (idade > 60){
            println("Idoso")
        }
    }else if (idade < 10){
        println("Criança")
    }
    else{
        println("Menor de idade")
    }
}

/*fun saudacao(dia: Boolean): String{
    return if (dia){
        "Bom dia"
    }else{
        "Boa Noite"
    }
}*/

fun saudacao(dia: Boolean) = if (dia){
    "Bom dia"
}else{
    "Boa noite"
}

fun main(){
    maiorDeIdade(19)
    maiorDeIdade(15)
    maiorDeIdade(9)
}

