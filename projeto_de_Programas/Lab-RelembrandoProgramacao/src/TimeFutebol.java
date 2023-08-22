import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos vetores de gols
        int[] golsTime = lerVetorInt(scanner);
        int[] golsAdversario = lerVetorInt(scanner);

        // Contadores para vitórias, empates e derrotas
        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        // Verifica cada partida
        for (int i = 0; i < golsTime.length; i++) {
            if (golsTime[i] > golsAdversario[i]) {
                vitorias++;
            } else if (golsTime[i] < golsAdversario[i]) {
                derrotas++;
            } else {
                empates++;
            }
        }

        // Imprime os resultados
        System.out.println(vitorias + " " + empates + " " + derrotas);

        scanner.close();
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
