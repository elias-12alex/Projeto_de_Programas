import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double s = (a+b+c)/2.00;
		
		double areaTriangulo = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.printf("%.2f\n", areaTriangulo);
		}else{
			System.out.println("Triangulo invalido");
		}
		sc.close();
	}
	
}
