import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        int soma = 0;
        int contador = 0;

        while (true) {
            int valor = sc.nextInt();
            if (valor == -1) {
                break;
            }
            soma += valor;
            contador++;
        }

        media = (double) soma / contador;
        System.out.printf("%.2f", media);
    }
}
