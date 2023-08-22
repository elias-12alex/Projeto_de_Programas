import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas e presenças
        double[] notas = lerVetor(scanner);
        int[] presencas = lerVetorInt(scanner);

        // Leitura da carga horária
        int cargaHoraria = scanner.nextInt();

        // Contadores para aprovação, reprovação por nota e reprovação por frequência
        int aprovados = 0;
        int reprovadosNota = 0;
        int reprovadosFrequencia = 0;

        // Verifica cada aluno
        for (int i = 0; i < notas.length; i++) {
            double nota = notas[i];
            int presenca = presencas[i];

            // Verifica se o aluno foi reprovado por frequência
            if (presenca < cargaHoraria * 0.75) {
                reprovadosFrequencia++;
            } else if (nota >= 5.0) {
                // Verifica se o aluno foi aprovado
                aprovados++;
            } else {
                // Se não foi aprovado e não foi reprovado por frequência, é reprovado por nota
                reprovadosNota++;
            }
        }

        // Imprime os resultados
        System.out.println(aprovados + " " + reprovadosNota + " " + reprovadosFrequencia);

        scanner.close();
    }

    // Função para ler um vetor de números reais
    public static double[] lerVetor(Scanner scanner) {
        String[] elementos = scanner.nextLine().split(" ");
        double[] vetor = new double[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            vetor[i] = Double.parseDouble(elementos[i].replace(",", "."));
        }
        return vetor;
    }

    // Função para ler um vetor de números inteiros
    public static int[] lerVetorInt(Scanner scanner) {
        String[] elementos = scanner.nextLine().split(" ");
        int[] vetor = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            vetor[i] = Integer.parseInt(elementos[i]);
        }
        return vetor;
    }
}
