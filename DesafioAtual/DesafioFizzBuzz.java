package DesafioAtual;
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

        StringBuilder resultado = new StringBuilder();
              
        for (int i = 1; i <= numero; i++){
            if (i % 15 == 0){
                resultado.append("Fizzbuzz");
            }
            else if (i % 5 == 0){
                resultado.append("Buzz");
            }
            else if (i % 3 == 0){
                resultado.append("Fizz");
            }
            else {
                resultado.append(i);
            }

        resultado.append("\n");

        }

        return resultado.toString();
    }

    
}
