/*
 * Projetos_de_Programas
 * Atividade_Lista_2 
 * @EliasAlexander
 * 
 * */
import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor = sc.nextLine();
        String[] partes = valor.split(" ", 2); 
        String textoOriginal = partes[1];
        
        int deslocamento = Integer.parseInt(partes[0]);
        
        String textoCriptografado = criptografarCesar(textoOriginal, deslocamento);
        System.out.println(textoCriptografado.toUpperCase());

        sc.close();
    }

    private static String criptografarCesar(String texto, int deslocamento) {
        StringBuilder textoCriptografado = new StringBuilder();
        int i;
        for (i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char inicioAlfabeto = Character.isUpperCase(caractere) ? 'A' : 'a';
                char novoCaractere = (char) (((caractere - inicioAlfabeto + deslocamento) % 26) + inicioAlfabeto);
                textoCriptografado.append(novoCaractere);
            } else {
                textoCriptografado.append(caractere);
            }
        }

        return textoCriptografado.toString();
    }
}