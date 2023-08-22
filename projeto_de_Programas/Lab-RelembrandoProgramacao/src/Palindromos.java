/*
 * Projetos_de_Programas
 * Atividade_Lista_2 
 * @EliasAlexander
 * 
 * */
import java.util.Scanner;
public class Palindromos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String linha = sc.nextLine();
        String linhaMais = linha.toUpperCase();
        linhaMais = linhaMais.replace(" ", "");
        int flag = 0;
        int fim = linhaMais.length() - 1;
        for(int i = 0; i < (linhaMais.length()/2); i++){
            if(i<=fim){
                if(linhaMais.charAt(i) == linhaMais.charAt(fim)){
                    flag = 1;
                }else{
                    flag = 0;
                }
            }
            fim--;
        }
        System.out.printf(linhaMais +" "+ flag);
        sc.close();
    }
}
