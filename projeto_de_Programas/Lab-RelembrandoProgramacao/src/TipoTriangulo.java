import java.util.Scanner;

public class TipoTriangulo {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		int ladoA = sc.nextInt();
		int ladoB = sc.nextInt();
		int ladoC = sc.nextInt();
		
		if((ladoA < 0 || ladoB < 0 || ladoC < 0) || ((ladoA + ladoB <= ladoC) || (ladoA + ladoC <= ladoB) || (ladoB + ladoC <= ladoA))  ) {
			System.out.print("invalido");
		}else if (ladoA == ladoB &&  ladoB == ladoC) {
			System.out.print("equilatero");	
		}else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
			System.out.print("isosceles");
		}else if(ladoA != ladoB && ladoB != ladoC) {
			System.out.print("escaleno");
		}
		else {
			System.out.print("invalido");
		}
	}
}
