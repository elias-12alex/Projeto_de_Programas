package br.edu.ufam.icomp.lab_excecoes;

public class RoverCaminhoException extends RoverException  {
	private static final long serialVersionUID = 1L;
	private static String s;
	public RoverCaminhoException() {
		this(null);
	}
	public RoverCaminhoException(String s) {
		super(s);
	}
	
	public String getMessage() {
		return "Exceção geral de caminho do rover";
	}
}
