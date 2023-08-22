/*
 * Projeto de Programas
 * 
 * Atividade_Lista2
 * 
 * @ELIAS ALEXANDER
 * 
 * */
import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int valor = scanner.nextInt();

        while (valor != -1) {
            soma += valor;
            valor = scanner.nextInt();

            if (valor == -1) {
                System.out.println(soma);
                soma = 0;
                
            } 

        }       
        
        int valor1 = scanner.nextInt();

        while (valor1 != -1) {
            soma += valor1;
            valor1 = scanner.nextInt();

            if (valor1 == -1) {
                System.out.println(soma);
                soma = 0;
                
            } 

        } 
        int valor2 = scanner.nextInt();

        while (valor2 != -1) {
            soma += valor2;
            valor2 = scanner.nextInt();

            if (valor2 == -1) {
                System.out.println(soma);
                soma = 0;
                
            } 

        } 

        scanner.close();
    }
}
