/*
 * Projetos_de_Programas
 * Atividade_Lista_2 
 * @EliasAlexander
 * 
 * */

import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as respostas do candidato, seguidas pelo gabarito (-1 para finalizar):");
        int[] respostas = lerVetor(sc);
        int[] gabarito = lerVetor(sc);

        double porcentagemAcerto = calcularPorcentagemAcerto(respostas, gabarito);
        System.out.printf("Porcentagem de acerto: %.2f\n", porcentagemAcerto);
        sc.close();
    }

    public static int[] lerVetor(Scanner sc) {
        int tamanho = 0;
        int valor = sc.nextInt();
        while (valor != -1) {
            tamanho++;
            valor = sc.nextInt();
        }

        int[] vetor = new int[tamanho];
        sc.nextLine(); // Limpa o buffer após a leitura do último número

        //System.out.print("Digite os elementos do vetor separados por espaços: ");
        String[] elementos = sc.nextLine().split(" ");

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(elementos[i]);
        }

        return vetor;
    }

    public static double calcularPorcentagemAcerto(int[] respostas, int[] gabarito) {
        int totalQuestoes = respostas.length;
        int acertos = 0;

        for (int i = 0; i < totalQuestoes; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }

        return (acertos / (double) totalQuestoes) * 100.0;
    }
}


