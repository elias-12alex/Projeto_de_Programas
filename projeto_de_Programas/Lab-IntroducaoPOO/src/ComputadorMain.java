/*
 * Projetos_de_Programas
 * Atividade_Lista_3
 * @EliasAlexander
 * 
 * */

public class ComputadorMain {
	public static void main(String[] args) {

		Processador processador = new Processador("Intel", "i7", 3.2, 8);
        Memoria memoria = new Memoria("Kingston", "DDR4", 8.0, 3200, 4);
        Disco disco = new Disco("Western Digital", "HDD", 4000.0, 9600);

        Computador computador = new Computador("Dell", processador, memoria, disco);
        System.out.println(computador.getDescricao());
    }
}
		
 /*       Processador proc = new Processador();	
        proc.marca = "Intel";
        proc.modelo = "i7";
        proc.velocidade = 3.2;
        proc.numNucleos = 8;
        
        Memoria memo = new Memoria();
        memo.marca = "Intel";
        memo.tipo = "i7";
        memo.tamanho = 3.2;
        memo.velocidade = 8;
        memo.numPentes = 1;
        
        Disco disc = new Disco();
        disc.marca = mara;
        disc.tipo = tip;
        disc.capacidade = capacidade;
        disc.rpm = rpm;
  */
