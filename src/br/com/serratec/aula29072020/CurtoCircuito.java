package br.com.serratec.aula29072020;

public class CurtoCircuito {

	public static void main(String[] args) {
		 
		boolean a = 1==1; // true.
		boolean b = 1==2; // false.
		boolean c = 10==10; // true.
		boolean d = 1==20; // false.
		
		//--------------------------------------------------------
		
		// &&: como a primeira � true, vai avaliar a segunda.  
		if (a && b) {
			System.out.println("&&: Verdadeiro!");
		} else {
			System.out.println("&&: Falso!");
		}
		
		// &&: como a primeira � false, o teste � interrompido e a
		// segunda n�o � avaliada. 
		if (b && c) {
			System.out.println("&&: Verdadeiro!");
		} else {
			System.out.println("&&: Falso!");
		}			
		//--------------------------------------------------------
		
		// ||: como a primeira � true, vai avaliar apenas a primeira.  
		if (a || c) {
			System.out.println("||: Verdadeiro!");
		} else {
			System.out.println("||: Falso!");
		}
		
		// ||: como a primeira � false, o teste vai avaliar as duas 
		// express�es. 
		if (b && c) {
			System.out.println("||: Verdadeiro!");
		} else {
			System.out.println("||: Falso!");
		}		
	
	}

}
