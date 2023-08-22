/*
 * Projetos_de_Programas
 * Atividade_Lista_4
 * @EliasAlexander
 * 
 * */

import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] valores = input.split(" ");
        int valor = valores.length / 2;

        double[] x = new double[valor];
        double[] y = new double[valor];

        for (int i = 0; i < valor; i++) {
            x[i] = Double.parseDouble(valores[i]);
            y[i] = Double.parseDouble(valores[i + valor]);
        }

        double area = calcularAreaPoligono(x, y);
        System.out.printf("%.4f\n", area);
        sc.close();
    }
    
    static double calcularAreaPoligono(double[] x, double[] y) {
        double area = 0;
        int n = x.length;

        for (int i = 0; i < n - 1; i++) {
            area += (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
        }

        area += (x[n - 1] * y[0]) - (x[0] * y[n - 1]);

        return Math.abs((area)/2.0);
    }
}