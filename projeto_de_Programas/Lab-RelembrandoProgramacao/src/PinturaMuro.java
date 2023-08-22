import java.util.Scanner;

public class PinturaMuro {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	double comprimentoMuro = 12.0f; // em metros
    double alturaMuro = 3.0f; // em metros
	double valorCobrado = sc.nextDouble();
	
	double valorTotal = valorCobrado*comprimentoMuro*alturaMuro + 100.0f;
	System.out.printf("%.1f\n", valorTotal);
	
	
	sc.close();
	}
	
}
