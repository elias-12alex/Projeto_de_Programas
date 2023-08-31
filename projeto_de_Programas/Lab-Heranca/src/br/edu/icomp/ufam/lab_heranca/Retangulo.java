package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
	public double largura, altura;
	
	public Retangulo(int posX, int posY, double largura, double altura){
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
	}
	public double getArea() {
		double A = largura * altura ;
		return A; 
	}
	public double getPerimetro() {
		double C = 2 *(largura + altura);
		return C;
	}
	public String toString() {
		return "Retângulo na posição (" + posX + ", " + posY + ") com largura de " + largura + "cm e altura de " + altura + "cm (área=" + getArea() + "cm2, perímetro=" + getPerimetro() + "cm)";

	}

}
