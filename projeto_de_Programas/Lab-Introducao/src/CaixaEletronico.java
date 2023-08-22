import java.util.Scanner;
public class CaixaEletronico {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        
        if (valor <= 0 || valor % 2 != 0) {
            System.out.println("Valor Invalido");
        } else {
            // Passo 3: Calcular o número de notas de cada tipo (R$50, R$10 e R$2)
            int notas50 = valor / 50;
            valor %= 50;

            int notas10 = valor / 10;
            valor %= 10;

            int notas2 = valor / 2;

            // Passo 4: Exibir a saída com a quantidade de notas de cada tipo
            System.out.println(notas50 + " notas de R$50, " + notas10 + " notas de R$10 e " + notas2 + " notas de R$2");
        }
	
		sc.close();
	}

}
