import java.util.Scanner;

public class TanqueCombustivel {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raio = sc.nextInt();
        int altura = sc.nextInt();
        
        double volume_combustivel = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);;
        
        double volume_ar = (Math.PI / 3.0) * altura * altura * (3.0 * raio - altura);

        
        int opcao = sc.nextInt();
        if(opcao == 1) {
        	System.out.printf("%.4f\n", volume_ar);
        }else if (opcao == 2) {
        	System.out.printf("%.4f\n", volume_combustivel -  volume_ar);

        }
        
        
		sc.close();
	}
	
}


