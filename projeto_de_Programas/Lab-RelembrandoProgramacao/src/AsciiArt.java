import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numAsteristicos = sc.nextInt();
        int total = numAsteristicos;
        int qtdEspaços = 0;

        for(int j = numAsteristicos; j > 0; j--){
            for(int i = 0; i < numAsteristicos; i++){
                System.out.print("*");
            }
            for(int k = 0; k < qtdEspaços; k++){
                System.out.print(" ");
            }
            for(int t = 0; t < numAsteristicos; t++){
                System.out.print("*");
            }      
            numAsteristicos--;
            qtdEspaços = (total - numAsteristicos) * 2;
            System.out.print("\n");
        }
    
    }
}
