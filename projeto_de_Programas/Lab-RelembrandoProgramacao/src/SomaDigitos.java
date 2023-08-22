import java.util.Scanner;
public class SomaDigitos {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int soma = 0;
        while (num != 0) {
            int digito = num % 10;
            soma += digito;
            num /= 10;
        }
        System.out.println("" +soma);
        sc.close();
	}
}
