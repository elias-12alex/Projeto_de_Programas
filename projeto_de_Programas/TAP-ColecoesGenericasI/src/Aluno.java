import java.util.Calendar;

public class Aluno {
	
	String nome;
	int matricula;
	int anoNascimento;
	int ano = Calendar.getInstance().get(Calendar.YEAR);
	
	Aluno(String nome, int matricula, int anoNascimento){
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}
	
	public Aluno(){
	}
	
	
	int	getIdade() {
		
		
		return (anoNascimento);
	}
	
	String getDescricao() {
		return ("" + nome + " (mat=" + matricula + ", idade=" + getIdade() + ")");
	}
	/*public int getMatricula() {
        return matricula;
    }*/
	
	
    public String toString() {
        return nome + " (mat=" + matricula + ", idade=" + getIdade() + ")";
    }
    
}


