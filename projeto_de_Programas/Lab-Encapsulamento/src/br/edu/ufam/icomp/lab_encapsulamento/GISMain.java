package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {

	    Localizavel[] vetor = new Localizavel[2];
	    	
	    vetor[0] = new Celular(55, 92, 930154926);
	    vetor[1] = new CarroLuxuoso("dsd1234");
		

	      for (int i = 0; i < vetor.length; i++) {
	            System.out.println(vetor[i].getPosicao());
	        }
	}
}