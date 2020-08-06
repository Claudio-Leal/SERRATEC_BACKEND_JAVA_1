package br.com.serratec.aula29072020;

public class Multiplos {
	
	public static void main (String [] args) {
		int contador = 0;
		
		for (int i = 0; i <= 22; i++) {
			if (i % 2 == 0 && i > 2) {
				contador = contador + 1;
				System.out.println("i: " + i  + ". Java!");
			}
		}
		System.out.println("Qtde de múltiplos de dois: " + contador);			
	}

}
