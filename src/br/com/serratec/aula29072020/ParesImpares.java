package br.com.serratec.aula29072020;

public class ParesImpares {
	
	public static void main (String [] args) {
		int par = 0;
		int impar = 0;
		
		for (int i = 0 ; i < 30 ; i++) {
			if (i % 2 == 0) {				
				par = par + 1;								
				System.out.println("N�meros pares: " + i);			
			} else {
				impar = impar + 1;
				System.out.println("N�meros �mpares: " + i);
			}
		}
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);
	}

}
