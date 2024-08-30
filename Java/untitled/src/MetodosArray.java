import java.lang.reflect.Array;
import java.util.Arrays;

public class MetodosArray {
    public static void main(String[] args){
        //Metodos da classe Array

        final int length = 10;
        final int tamanho = 5;
        int[] numeros = {9,2,7,1,8,5,3,4,0,6};
        int[] numbers = new int[length];

        int[] meusNumeros = {69, 28, 18};

        int valor = 28;

        /*Arrays.sort(numeros);
        Arrays.fill(numbers, 27);
        System.arraycopy(numeros, 0, numbers, 0, tamanho);*/
        //System.out.printf("Arrays são iguais:%s",  Arrays.equals(numeros, numbers) ? "Sim": "Não");

        System.out.printf("O valor %d está referente ao index %d no array meusNumeros", valor, Arrays.binarySearch(meusNumeros, valor));


        /*for (int n:numbers){
            System.out.printf("%d - ", n);
        }*/
    }
}
