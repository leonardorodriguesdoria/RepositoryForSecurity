public class CursoJava {
    public  static void main(String[] args){
        int numero = 28;
        String nome = "Lucas";
        numero = 30;

        int valor1= 10;
        int valor2= 20;
        int valor3= 30;
        int somaDosValores = valor1 + valor2 + valor3;

        System.out.print("CFB Cursos\n");//Impressão em linha única
        System.out.println("Curso de Java");//Executa quebra de linha no final
        System.out.printf("Canal:%s - Ano:%d%n", "PhantomSkyrim", 2022);//Formatação de saída, parametrização da saida
        System.out.printf("Valor da variável numero:%d%n",numero);
        System.out.printf("Valor da variável nome:%s%n",nome);
        System.out.printf("Resultado da soma:%d", somaDosValores);
    }
}
