import java.sql.Array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){

        /*final int tamanhoArray = 5;

        int[] numeros = new int[tamanhoArray];
        int[] numbers = {11, 12,13, 14, 15};

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for(int i = 0; i < numbers.length; i++){
            System.out.printf("Contador incrementar: %d%n", numbers[i]);
        }

        //System.out.printf("%d", numbers[3]);*/

        final int tamanho=5;
        char[] gabarito = {'a', 'a', 'd', 'b', 'c'};
        char[] respostasAluno = new char[tamanho];
        int nota =0;

        Scanner scanner = new Scanner(System.in);

        respostasAluno[0] = 'a';
        respostasAluno[1] = 'b';
        respostasAluno[2] = 'c';
        respostasAluno[3] = 'b';
        respostasAluno[4] = 'c';

        for (int i=0; i < gabarito.length; i++){
           System.out.printf("Informe a resposta: %d%n", i);
           respostasAluno[i] = scanner.nextLine().charAt(0);
        }

        for (int i=0; i < gabarito.length; i++){
            if (respostasAluno[i] == gabarito[i]){
                nota++;
            }
        }
        System.out.printf("Nota do aluno: %d", nota);
    }
}
