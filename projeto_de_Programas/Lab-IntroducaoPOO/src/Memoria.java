/*
 * Projetos_de_Programas
 * Atividade_Lista_3
 * @EliasAlexander
 * 
 * */
public class Memoria {
    String marca;
    String tipo;
    double tamanho; 
    double velocidade;
    int numPentes;
    
    double getTamanhoTotal() {
        return numPentes * tamanho;
    }
    double getVelocidadeParalela() {
        return numPentes * velocidade;
    }
    String getDescricao() {
        return ("Memoria: marca=" + marca + ", tipo=" + tipo +", tamanho=" + tamanho + "GB, velocidade=" + velocidade + "GHz, numPentes=" + numPentes + ", tamanhoTotal=" + getTamanhoTotal() + "GB, velocidadeParalela=" + getVelocidadeParalela() + "GHz.");       
    }
    public Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
    }
    public Memoria() {
    	// Chama o construtor principal
    }
   
}
 