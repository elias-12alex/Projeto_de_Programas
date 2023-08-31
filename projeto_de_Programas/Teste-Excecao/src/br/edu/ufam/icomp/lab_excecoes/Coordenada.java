package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {

	private int	posX;
    private int	posY;
    private int	digito;
        
    public	Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
    	if ((posX < 0) || (posY < 0)) {
    		throw new CoordenadaNegativaException();	
    	}
    	if ((posX >= 0) && (posX >= 30000)) {
    		throw new CoordenadaForaDosLimitesException();	
    	}else if ((posY >= 0) && (posY >= 30000)) {
    		throw new CoordenadaForaDosLimitesException();	
    	}
    	if (((posX + posY)% 10) != digito) {
    		throw new DigitoInvalidoException();	
  		
    	}else if ((digito <= 0) && (digito >= 9)) {
    		throw new DigitoInvalidoException();	
    	}
    	this.posX = posX;
    	this.posY = posY;
    	this.digito = digito;
    }
    public int	getPosX(){
        return posX;
    }
    public int	getPosY(){
        return posY;
    }
    public double distancia(Coordenada coordenada) {
        double distanciaX = coordenada.posX - this.posX;
        double distanciaY = coordenada.posY - this.posY;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
    public String	toString(){
    	return posX + ", " + posY;
    	//return "" + getPosX() + ", " + getPosY() ; 
	
		
    }
}
