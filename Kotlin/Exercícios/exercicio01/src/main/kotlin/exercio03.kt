
fun main(){
    bonusXPTO("Gerente");
    bonusXPTOQt02("Coordenador", 3)
}

//Controle de fluxo
/*
* Qt01 Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
*
* */

fun bonusXPTO(cargo: String){
   if (cargo == "Gerente"){
       println("Bônus de R$ 2.000,00")
   } else if (cargo === "Coordenadores"){
       println("Bônus de R$ 1.500,00")
   }else if (cargo == "Engenheiro de Software"){
       println("Bônus de R$ 1.000,00")
   }else if (cargo == "Estagiário"){
       println("Bônus de R$ 500,00")
   }
}

/* Qt02 Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00*/

fun bonusXPTOQt02(cargo: String, tempo: Int){
   if (cargo == "Gerente"){
       if (tempo < 2) {
           println("Bônus de R$ 2.000,00")
       }else{
           println("Gerente com 2 anos ou mais. Bônus de R$ 3.000,00")
       }
   }else if (cargo == "Coordenador"){
       if (tempo < 1){
           println("Bônus de R$ 1.500,00")
       }else{
           println("Coodenador com 1 ano ou mais. Bônus de R$ 1.800,00")
       }
   } else if (cargo == "Engenheiro de Software"){
       println("Bônus de R$ 1.000,00")
   }else if (cargo == "Estagiário"){
       println("Bônus de R$ 500,00")
   }else{
       println("Cargo não reconhecido!!!")
   }
}

