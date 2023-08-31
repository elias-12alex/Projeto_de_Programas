package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(2, 3, 5.0);
        formas[1] = new Retangulo(10, 15, 8.0, 6.0);
        formas[2] = new Quadrado(20, 16, 6.0);

        for (FormaGeometrica forma : formas) {
            System.out.println(forma);
        }
    }
}
