/*
 * Projeto de Programas
 * 
 * Atividade_Lista2
 * 
 * @ELIAS ALEXANDER
 * 
 * */
import java.util.Scanner;

public class RotaOrtodromica {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double latitudeA = sc.nextDouble();
		double longitudeA = sc.nextDouble();
		double latitudeB = sc.nextDouble();
		double longitudeB = sc.nextDouble();

		double latiA = Math.toRadians(latitudeA);
		double longA = Math.toRadians(longitudeA);
		double latiB = Math.toRadians(latitudeB);
		double longB = Math.toRadians(longitudeB);
		
		double d = 6371 * Math.acos(Math.sin(latiA) * Math.sin(latiB) + Math.cos(latiA) * Math.cos(latiB) * Math.cos(longA - longB));	
		System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", latitudeA,longitudeA,latitudeB,longitudeB, d);
		
		
		sc.close();
	}
}
