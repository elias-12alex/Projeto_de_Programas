import java.util.Scanner;
public class ContaEnergia {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int consumo = sc.nextInt();
		//int tipo = sc.nextInt();
		char tipo = sc.next().charAt(0);
		double valor;
		
		if(consumo <= 0) {
			System.out.printf("-1.00");
		}else if(consumo <= 500 && tipo == 'R') {
			valor = consumo*0.4;
			System.out.printf("%.2f", valor);
		}else if (consumo > 500 && tipo == 'R'){
			valor = consumo*0.65;
			System.out.printf("%.2f", valor);
		}else if(consumo <= 1000 && tipo == 'C') {
			valor = consumo*0.55;
			System.out.printf("%.2f", valor);
		}else if(consumo > 500 && tipo == 'C'){
			valor = consumo*0.6;
			System.out.printf("%.2f", valor);
		}else if(consumo <= 5000 && tipo == 'I') {
			valor = consumo*0.55;
			System.out.printf("%.2f", valor);
		}else if(consumo > 5000 && tipo == 'I') {
			valor = consumo*0.6;
			System.out.printf("%.2f", valor);
		}else {
			System.out.printf("-1.00");
		}
		sc.close();
		
	}
}

