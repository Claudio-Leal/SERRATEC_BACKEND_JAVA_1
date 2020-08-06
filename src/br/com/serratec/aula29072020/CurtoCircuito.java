package br.com.serratec.aula29072020;

public class CurtoCircuito {

	public static void main(String[] args) {
		 
		boolean a = 1==1; // true.
		boolean b = 1==2; // false.
		boolean c = 10==10; // true.
		boolean d = 1==20; // false.
		
		//--------------------------------------------------------
		
		// &&: como a primeira é true, vai avaliar a segunda.  
		if (a && b) {
			System.out.println("&&: Verdadeiro!");
		} else {
			System.out.println("&&: Falso!");
		}
		
		// &&: como a primeira é false, o teste é interrompido e a
		// segunda não é avaliada. 
		if (b && c) {
			System.out.println("&&: Verdadeiro!");
		} else {
			System.out.println("&&: Falso!");
		}			
		//--------------------------------------------------------
		
		// ||: como a primeira é true, vai avaliar apenas a primeira.  
		if (a || c) {
			System.out.println("||: Verdadeiro!");
		} else {
			System.out.println("||: Falso!");
		}
		
		// ||: como a primeira é false, o teste vai avaliar as duas 
		// expressões. 
		if (b && c) {
			System.out.println("||: Verdadeiro!");
		} else {
			System.out.println("||: Falso!");
		}		
	
	}

}
