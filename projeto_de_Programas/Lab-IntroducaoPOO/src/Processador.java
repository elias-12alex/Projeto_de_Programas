/*
 * Projetos_de_Programas
 * Atividade_Lista_3
 * @EliasAlexander
 * 
 * */
public class Processador {
    String marca;
    String modelo;
    double velocidade; // em GHz
    int numNucleos;
    
    double getVelocidadeParalela() {
        return velocidade * numNucleos;
    }
    String getDescricao() {
        return "Processador: marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade +
               "GHz, numNucleos=" + numNucleos + ", velocidadeParalela=" + getVelocidadeParalela() + "GHz.";
    }
    public Processador(String marca, String modelo, double velocidade, int numNucleos) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.numNucleos = numNucleos;
    }
    public Processador() {
    	// Chama o construtor principal
    }
   
}
 