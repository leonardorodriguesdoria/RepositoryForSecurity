public class ComandosDecisao {
    //Comandos de tomada de decisão
    // == > < >= <= != ! (true / false)
    //If
    // else
    //Swithc
    public static void main(String[] args){

        int nota = 65;
        int faltas = 10;
        int maxFaltas = 5;
        int media = 60;

        //Tabela verdade AND
        /*
        *  VV = V
        *  VF = F
        * FV = F
        * FF = F
        * */
        // Operador Ternário

        String resultado;
        resultado = (nota >= media ? "Apovado" : "Reprovado");

        System.out.printf("O aluno(a) está: %s%n", resultado);

        /*if(nota >= media && faltas <= maxFaltas){
            System.out.println("Aluno Aprovado");
        }else if (nota >= 40){
            System.out.println("Aluno em Recuperacao");
        }else {
            System.out.println("Aluno Reprovado");
        }*/

        int posicaoCorredor = 1;

        //Switch
        switch (posicaoCorredor){
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Prêmio de participação");
                break;
            default:
                System.out.println("Não subiu ao pódio");
                break;
        }
    }

}
