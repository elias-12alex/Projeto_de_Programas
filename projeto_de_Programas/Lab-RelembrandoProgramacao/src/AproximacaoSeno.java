/*
 * Projeto de Programas
 * 
 * Atividade_Lista2
 * 
 * @ELIAS ALEXANDER
 * 
 * */
import java.util.Scanner;

public class AproximacaoSeno {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double alpha = sc.nextDouble();
		double kTermos = sc.nextDouble();

		double alphaRadi = Math.toRadians(alpha);
		
		double senoAproximado = calcularSeno(alphaRadi, kTermos);
		
		//System.out.printf("%.10f\n", senoAproximado);
		
		sc.close();
	}

	public static double calcularSeno(double alphaRadi, double kTermos) {
	    double senoAproximado = 0.0;
	
	    for (int i = 0; i < kTermos; i++) {
	        int termo = 2 * i + 1;
	        double numerador = Math.pow(-1, i) * Math.pow(alphaRadi, termo);
	        double denominador = fatorial(termo);
	        senoAproximado += numerador / denominador;
	        System.out.printf("%.10f%n", senoAproximado);
	    }
	
	    return senoAproximado;
	}
	
	public static double fatorial(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        double result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }
	
	}
}