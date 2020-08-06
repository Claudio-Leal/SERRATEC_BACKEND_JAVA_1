package br.com.serratec.aula29072020;

public class ForBreak {
	
	public static void main (String [] args) {
		// iteração prevista: 0 a 10.
		for (int i = 0 ; i <= 10 ; i++) {
			
			// for de dentro: imprime a posição 5. 
			System.out.println("i de dentro: " + i);
			
			// interrupção: quando i = 5.
			if (i == 5) {
				break;				
			}
			
			// for de fora: desconsidera a posição 5.  
			System.out.println("i de fora: " + i);
		}
	}
}
