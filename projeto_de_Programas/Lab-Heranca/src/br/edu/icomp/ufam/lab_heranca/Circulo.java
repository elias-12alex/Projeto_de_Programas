package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {

	public double raio;
	public Circulo(int posX, int posY, double raio){
		super(posX, posY);
		this.raio = raio;
	}
	
	public double getArea() {		
		double a = (double) Math.PI * (raio*raio);
		return a;
	}
	
	public double getPerimetro(){
		double C = (double) Math.PI * 2 * raio;
		return C;
	}
	
	public String toString() {
		return "Círculo na " + getPosString() + " com raio de " + raio + "cm (área=" + getArea() + "cm2, perímetro=" + getPerimetro() + "cm)";
	}
}
