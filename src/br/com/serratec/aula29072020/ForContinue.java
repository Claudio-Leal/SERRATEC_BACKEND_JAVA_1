package br.com.serratec.aula29072020;

public class ForContinue {
	
	public static void main (String argString []) {
		// iteração prevista: 0 a 10.
		for (int i = 0 ; i <= 10 ; i++) {
			
			  
			System.out.println("i de dentro: " + i);
			
			// permanece no laço enquanto i < 5.
			if (i < 5) {
				continue;				
			}
			
			// quando i >= 5, esta instrução passa a ser executada.   
			System.out.println("i de fora: " + i);
		}
	}

}
