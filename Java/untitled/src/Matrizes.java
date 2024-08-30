import java.security.SecureRandom;

public class Matrizes {
    public static void main(String[] args){
        final int linhas = 3;
        final int colunas = 5;

        int[][] numeros = new int[linhas][colunas];
        int[][] num = {{10,20,30,40,50}, {1,2,3,4,5}, {100,200,300,400,500}};

        for (int linha = 0; linha<linhas; linha++){
            for (int coluna=0; coluna < colunas; coluna++){
                numeros[linha][coluna] = new SecureRandom().nextInt(100);
            }
        }

        /*for (int linha = 0; linha<linhas; linha++){
            for (int coluna=0; coluna < colunas; coluna++){
                System.out.printf("%d", numeros[linha][coluna]);
            }
            System.out.printf("%n");
        }*/

        for(int[] numero:num){
            for(int valor:numero){
                System.out.printf("2%d |", valor);
            }
        }

        /*[0,1,2,3,4,5,6],[0,1,2,3,4,5,6], [0,1,2,3,4,5,6]
        [0,1,2,3,4,5,6],[0,1,2,3,4,5,6], [0,1,2,3,4,5,6]*/
    }
}
