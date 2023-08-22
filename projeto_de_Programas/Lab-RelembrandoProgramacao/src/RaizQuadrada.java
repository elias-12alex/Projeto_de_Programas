import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		float num = sc.nextInt();
		
		double raiz = Math.sqrt(num);
		
		System.out.printf ("%.4f\n", raiz);
	}
}
