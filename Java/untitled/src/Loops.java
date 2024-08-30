import java.util.Scanner;
public class Loops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //For
        //Obs* utilizaremos o loop for, quando soubermos de antemão quantas vezes preciso executar o loop
        /*for (int contador = 0; contador < 10; contador++){
            System.out.printf("CFB CURSOS, valor do contador: %d%n", contador);
        }
        System.out.println("Fim do programa");*/
        //WHILE
        //OBS* utilizaremos o loop for, quando NÃO soubermos de antemão quantas vezes preciso executar o loop
        /*System.out.println("Por favor informe um número:");
        int contador = scanner.nextInt();
        while (contador < 10){
            System.out.printf("CFB CURSOS, valor do contador: %d%n", contador);
            contador++;
        }*/
        //DO WHILE
        // Começa executando e testa depois
        int contador = 0;
        do {
            System.out.printf("Contador: %d%n", contador);
            contador++;
        }while (contador < 5);
        System.out.println("Fim do programa");
    }
}
