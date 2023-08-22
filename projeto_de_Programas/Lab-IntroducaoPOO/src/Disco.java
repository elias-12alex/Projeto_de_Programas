/*
 * Projetos_de_Programas
 * Atividade_Lista_3
 * @EliasAlexander
 * 
 * */

public class Disco {
	String marca;
	String tipo;
	double capacidade;
	int rpm;
	
	String getDescricao() {
		return ("Disco: marca=" + marca + ", tipo=" + tipo + ", capacidade=" + capacidade + "GB, rpm=" + rpm + "rpm.");
	}
	
	public Disco(String marca, String tipo, double capacidade, int rpm) {
		this.marca = marca;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.rpm = rpm;
	}
	
	public Disco() {	
	}
	
}
