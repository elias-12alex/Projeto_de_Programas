import java.util.Scanner;

public class ArteAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numAsteriscos = sc.nextInt();

        for (int i = numAsteriscos; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // Imprimir a parte inferior do padrão
        for (int i = 1; i <= numAsteriscos; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
