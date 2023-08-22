import java.util.Scanner;

public class DataExtenso {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String valorStr = sc.nextLine();
        String dia = valorStr.substring(0, 2); 
        String mes = valorStr.substring(2, 4); 
        String ano = valorStr.substring(4, 8); 

        int num = Integer.parseInt(dia);       // Converte a String "601" para o int 601
        int num2 = Integer.parseInt(mes);
        int num3 = Integer.parseInt(ano);
 
        String[] meses = {
                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        String dataExtenso = num + " de " + meses[num2 - 1] + " de " + num3;
        System.out.println("" + dataExtenso);

	}    
}
