
public class Sala {
	
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;

	Sala(){}
	
	Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;

		
	}

    public String getDescricao() {
        String descricao = "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, ";
        if (acessivel) {
            descricao += "acessível";
        }
        else {
        	descricao += " não acessível";
        }
        descricao += ")";
        return descricao;
    }


}
