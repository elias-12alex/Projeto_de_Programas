import java.util.Scanner;

public class Desconto {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		double valor = sc.nextDouble();
		
		if (valor >= 200) {
			System.out.printf("%.2f\n", valor * 0.95);
		}else {
			System.out.printf("%.2f\n", valor);
		}
		sc.close();
	}
}
