package br.edu.ufam.icomp.lab_excecoes;

public class RoverException extends Exception  {
	private static String str;
	public RoverException() {
		this(null);
	}
	
	public RoverException(String str) {
		this.str = str;
	}
	
	public String getMessage() {
		return "Exceção geral do rover";
	}
}
