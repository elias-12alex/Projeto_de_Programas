/*
 * Projeto de Programas
 * 
 * Atividade_Lista2
 * 
 * @ELIAS ALEXANDER
 * 
 * */
import java.util.Scanner;
public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int numeroDeTermos = sc.nextInt();
        double pi = calcularPi(numeroDeTermos);
        if(numeroDeTermos == 1) {
        	System.out.printf("3.000000");
        }
    }

    public static double calcularPi(int numeroDeTermos) {
        double pi = 3.0;
        int denominador = 2;
        
        for (int i = 1; i < numeroDeTermos; i++) {
        	if (i == 1) {
        		System.out.printf("%.6f\n", pi);
        	}
        	if (i % 2 == 1) {
        		pi += 4.0 / (denominador * (denominador + 1) * (denominador + 2));
            } else {
            	pi -= 4.0 / (denominador * (denominador + 1) * (denominador + 2));
            }
            denominador += 2;
            System.out.printf("%.6f\n", pi);
        }

        return pi;
    }
}

