import java.util.Scanner;
public class comandosDeEntrada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double nota5;
        double nota6;
        double mediaAluno;

        //final - declaracao de constantes
        final double MEDIA = 6.0;


        String nomeAluno = "";

        System.out.println("Informe o nome do aluno(a): ");
        nomeAluno = entrada.nextLine();
        System.out.println("Informe a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = entrada.nextDouble();
        System.out.println("Digite a quinta nota: ");
        nota5 = entrada.nextDouble();
        System.out.println("Digite a sexta nota: ");
        nota6 = entrada.nextDouble();
        mediaAluno = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6)/6;

        if (mediaAluno >= MEDIA){
            System.out.printf("Media do Aluno(a): %f, Aluno(a) %s Aprovado(a)", mediaAluno, nomeAluno);
        }else if (mediaAluno == 4.0){
            System.out.printf("Media do Aluno(a): %f, Aluno(a) %s em recuperação", mediaAluno, nomeAluno);
        }else {
            System.out.printf("Media do Aluno(a): %f, Aluno(a) %s Reprovado(a)", mediaAluno, nomeAluno);
        }
    }
}
