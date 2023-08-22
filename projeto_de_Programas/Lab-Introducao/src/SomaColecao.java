import java.util.Scanner;

public class SomaColecao {	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int soma = 0;
	        while(true) {
	        	int valor = sc.nextInt();
	        	if(valor == -1) {
	        		break;
	        	}soma +=valor;
	        }System.out.printf("%d", soma);
		}
}
