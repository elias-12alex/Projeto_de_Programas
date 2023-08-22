import java.util.Scanner;
public class AnimaisCedulas {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();

		if(valor==2) {
			System.out.println("Tartaruga");
		}else if(valor==5) {
			System.out.println("Garça");
		}else if(valor==10) {
			System.out.println("Arara");
		}else if(valor==20) {
			System.out.println("Mico-leão-dourado");
		}else if(valor==50) {
			System.out.println("onça-pintada");
		}else if(valor==100) {
			System.out.println("Garoupa");
		}else {
			System.out.println("erro");
		}
		sc.close();
		
	}
}
