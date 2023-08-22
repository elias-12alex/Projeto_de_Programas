import java.util.Scanner;

public class Xadrez {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int qtdLinhas = sc.nextInt();
		
		for (int i = 0; i < qtdLinhas; i++) {
			if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 1; j <= qtdLinhas; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
	
	}
}