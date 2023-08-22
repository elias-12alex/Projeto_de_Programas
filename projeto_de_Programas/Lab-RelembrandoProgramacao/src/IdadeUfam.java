import java.util.Scanner;

public class IdadeUfam {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int anoatual= sc.nextInt();
		
		int anos_fundacao = anoatual - 1909;
		
		System.out.printf("A UFAM tem %d anos de fundacao", anos_fundacao);
	}
}
