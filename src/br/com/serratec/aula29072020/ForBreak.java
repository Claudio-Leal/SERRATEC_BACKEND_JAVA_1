package br.com.serratec.aula29072020;

public class ForBreak {
	
	public static void main (String [] args) {
		// itera��o prevista: 0 a 10.
		for (int i = 0 ; i <= 10 ; i++) {
			
			// for de dentro: imprime a posi��o 5. 
			System.out.println("i de dentro: " + i);
			
			// interrup��o: quando i = 5.
			if (i == 5) {
				break;				
			}
			
			// for de fora: desconsidera a posi��o 5.  
			System.out.println("i de fora: " + i);
		}
	}
}
