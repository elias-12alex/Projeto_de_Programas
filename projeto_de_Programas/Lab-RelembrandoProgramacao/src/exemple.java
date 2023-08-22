
public class exemple {

	public static void main(String[] args) {
		String s1 = "UFAM";
	    String s2 = "UFAM"; //mesmo conteudo de s2 e mesma referência, só faz acessar novamente o que já existe
	    String s3 = new String("UFAM"); //referencia nova criada, ou seja, é diferente de s1 e s2
		    
	    System.out.println("s1 == s2 ? " + (s1 == s2));
	    System.out.println("s1 == s3 ? " + (s1 == s3));
		  
	
	


//comparar conteúdo é mais demorado e não tem a performance tão boa quanto comparar por referência
//Strings são imutáveis
//

/*
 * Aula - Slide3 recursos em JAVA
 * 
 * 
 //		classe -> objeto(referência) -> atributo
	    int numAlunos = 20;
	    int numAlunos = new Integer(30);
		


	    */
	    
	    
	    // Vetores
	    
	}
}