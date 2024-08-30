public class Metodos {
    public static void main(String[] args){

        mensagem("Olá", 13);
        System.out.println(soma(10,10));
        System.out.println(soma(3.4,3.8));
        System.out.println(somaVariosNumeros(10,20,30,40));
        //Fazer chamada do método: colocar o nome do método criado;
    }

    public static void canal(){
        System.out.println("CFB Cursos!!!");
    }

    public static void mensagem(String mensagem, int numero){
        //Parâmetros tambem são chamados de argumentos
        for (int i =0; i < numero; i++){
            System.out.println(mensagem);
        }
    }

    public static int soma(int numero1, int numero2){
        int resposta = numero1 + numero2;
        return resposta;
    }

    public static int somaVariosNumeros(int...numeros){
        int resposta =0;//Variável resposta começa com zero
        for (int n:numeros){// Loop for irá interar o parâmetro array
            resposta+=n;//O loop irá armazenar os valores do array numeros na variável resposta
        }
        return resposta;
    }

    /*
    * /Sobrecarga de métodos: É quando existe dois ou mais métodos
    * com o mesmo nome porém com parâmetros de entrada e retorno de
    * tipos diferentes
    * */

    public static double soma(Double numero1, Double numero2){
        double resposta = numero1 + numero2;
        return resposta;
    }
}
