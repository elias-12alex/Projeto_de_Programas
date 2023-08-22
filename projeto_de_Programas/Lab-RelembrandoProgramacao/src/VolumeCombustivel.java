/*
 * Projeto de Programas
 * 
 * Atividade_Lista2
 * 
 * @ELIAS ALEXANDER
 * 
 * */

import java.util.Scanner;

public class VolumeCombustivel {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int alturaTotal = sc.nextInt();
        int nivelTanque = sc.nextInt();
        int raioBojos = sc.nextInt();
        
        if(nivelTanque <=0 || alturaTotal <= 0 || raioBojos <= 0) {
        	System.out.print("-1.000");
        }else {
	        double hCilindro = alturaTotal - nivelTanque;
	        // Calcula os volumes das partes do tanque
	        double volumeCilindro = Math.PI * raioBojos * raioBojos * hCilindro;
	        double volumeCalotaInferior = (2 * Math.PI * Math.pow(raioBojos, 3)) / 3;
	        double volumeCalotaSuperior = (Math.PI * Math.pow(raioBojos, 3) * hCilindro) / 3;
	        
	        System.out.printf("%.3f\n", volumeCilindro + volumeCalotaInferior + volumeCalotaSuperior);
        }sc.close();
	}
	
}