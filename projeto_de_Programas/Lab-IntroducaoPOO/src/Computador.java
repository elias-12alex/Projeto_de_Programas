/*
 * Projetos_de_Programas
 * Atividade_Lista_3
 * @EliasAlexander
 * 
 * */

public class Computador {
	String fabricante;
	Processador processador;
	Memoria memoria;
	Disco disco;
	
    public String getDescricao() {
        String descricao = "Computador da fabricante " + fabricante + ". ";
        descricao += "" + processador.getDescricao() + "";
        descricao += " " + memoria.getDescricao() + "";
        descricao += " " + disco.getDescricao() + "";
        return descricao;
    }
	
	
	
	public Computador(String fabricante, Processador processador, Memoria memoria, Disco disco) {
		this.fabricante = fabricante;
		this.processador = processador;
		this.memoria = memoria;
		this.disco = disco;
	}
	
	public Computador() {	
	}
	
}