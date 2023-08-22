import java.util.Scanner;

public class AreaVolume {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextInt();
		double areaCirculo = Math.PI * raio * raio;
		double volumeEsfera = (4.0/3.0)*Math.PI*Math.pow(raio, 3.0);
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", raio, areaCirculo);
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", raio, volumeEsfera);
		//System.out.println("Uma esfera com raio de " +45,00 "centimetros tem um volume de " +381703,51 " centimetros cubicos.");
		
	}
}
