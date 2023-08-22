/*
 * Projeto de Programas
 * 
 * Atividade_Lista2
 * 
 * @ELIAS ALEXANDER
 * 
 * */

import java.util.Scanner;

public class PontoReta {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
	
		
		if(2*x + y == 3) {
			System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.", x,y);
		}else {
			System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.", x,y);
		}
		
		
		sc.close();
	}
}