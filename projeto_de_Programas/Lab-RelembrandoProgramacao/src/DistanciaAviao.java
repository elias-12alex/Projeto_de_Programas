/*
 * Projetos_de_Programas
 * Atividade_Lista_4
 * @EliasAlexander
 * 
 * */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class DistanciaAviao {
    public static void main(String[] args) {
        Map<Integer, Map<Integer, Integer>> tabela = new HashMap<>();
        tabela.put(111, new HashMap<>());
        tabela.get(111).put(111, 0);
        tabela.get(111).put(222, 2);
        tabela.get(111).put(333, 11);
        tabela.get(111).put(444, 6);
        tabela.get(111).put(555, 15);
        tabela.get(111).put(666, 11);
        tabela.get(111).put(777, 1);

        tabela.put(222, new HashMap<>());
        tabela.get(222).put(111, 2);
        tabela.get(222).put(222, 0);
        tabela.get(222).put(333, 7);
        tabela.get(222).put(444, 12);
        tabela.get(222).put(555, 4);
        tabela.get(222).put(666, 2);
        tabela.get(222).put(777, 15);

        tabela.put(333, new HashMap<>());
        tabela.get(333).put(111, 11);
        tabela.get(333).put(222, 7);
        tabela.get(333).put(333, 0);
        tabela.get(333).put(444, 11);
        tabela.get(333).put(555, 8);
        tabela.get(333).put(666, 3);
        tabela.get(333).put(777, 13);

        tabela.put(444, new HashMap<>());
        tabela.get(444).put(111, 6);
        tabela.get(444).put(222, 12);
        tabela.get(444).put(333, 11);
        tabela.get(444).put(444, 0);
        tabela.get(444).put(555, 10);
        tabela.get(444).put(666, 2);
        tabela.get(444).put(777, 1);

        tabela.put(555, new HashMap<>());
        tabela.get(555).put(111, 15);
        tabela.get(555).put(222, 4);
        tabela.get(555).put(333, 8);
        tabela.get(555).put(444, 10);
        tabela.get(555).put(555, 0);
        tabela.get(555).put(666, 5);
        tabela.get(555).put(777, 13);

        tabela.put(666, new HashMap<>());
        tabela.get(666).put(111, 11);
        tabela.get(666).put(222, 2);
        tabela.get(666).put(333, 3);
        tabela.get(666).put(444, 2);
        tabela.get(666).put(555, 5);
        tabela.get(666).put(666, 0);
        tabela.get(666).put(777, 14);

        tabela.put(777, new HashMap<>());
        tabela.get(777).put(111, 1);
        tabela.get(777).put(222, 15);
        tabela.get(777).put(333, 13);
        tabela.get(777).put(444, 1);
        tabela.get(777).put(555, 13);
        tabela.get(777).put(666, 14);
        tabela.get(777).put(777, 0);

        Scanner sc = new Scanner(System.in);
        //System.out.println("Digite a sequência de cidades (números separados por espaço, -1 para encerrar):");
        int cidadePassada = sc.nextInt();
        int tempoTotal = 0;

        while (true) {
            int cidadeAtual = sc.nextInt();
            if (cidadeAtual == -1) {
                break;
            }

            if (!tabela.containsKey(cidadePassada) || !tabela.get(cidadePassada).containsKey(cidadeAtual)) {
                System.out.println("Cidades inválidas.");
                continue;
            }

            tempoTotal += tabela.get(cidadePassada).get(cidadeAtual);
            cidadePassada = cidadeAtual;
        }

        sc.close();
        System.out.println(tempoTotal);
    }
}