package desafioAtual;
import java.util.Scanner;

public class DesafioFizzBuzz {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bem vindo ao Jogo fizz buzz, digite um número limite para nosso jogo!");
        
        int numero = scanner.nextInt();

        String resultado = jogarFizzBuzz(numero);
        System.out.println(resultado);

        scanner.close();
    }
    public static String jogarFizzBuzz(int numero) {
        //Escreva sua solução aqui
        String resultado = new String();
        return resultado.toString();
    }

    
}
