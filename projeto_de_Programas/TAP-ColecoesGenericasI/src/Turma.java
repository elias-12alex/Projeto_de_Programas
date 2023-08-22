import java.util.ArrayList;
import java.util.List;

public class Turma {

    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    List<Aluno> alunos = new ArrayList<>();

    Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
    }

    void addAluno(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.matricula == aluno.matricula) {
                return; // Aluno já existe na turma
            }
        }
        alunos.add(aluno);
    }

    Aluno getAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula == matricula) {
                return aluno;
            }
        }
        return null; // Aluno não encontrado na turma
    }

    double getMediaIdade() {
        if (alunos.isEmpty()) {
            return 0;
        }

        int totalIdades = 0;
        for (Aluno aluno : alunos) {
            totalIdades += aluno.getIdade();
        }

        return (double) totalIdades / alunos.size();
    }

    String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Turma ").append(disciplina).append(" - ").append(ano).append("/").append(semestre).append(" (Prof. Dr. ").append(professor).append("):\n");
        for (int i = 0; i < alunos.size(); i++) {
            descricao.append("  - ").append("Aluno ").append(i + 1).append(": ").append(alunos.get(i)).append("\n");
        }
        return descricao.toString();
    }
}