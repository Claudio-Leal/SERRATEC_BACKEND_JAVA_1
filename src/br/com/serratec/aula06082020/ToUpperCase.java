package br.com.serratec.aula06082020;

public class ToUpperCase {

	public static void main(String[] args) {
		String nomeA = "Cl�udio Leal!";
		nomeA.toUpperCase();
		System.out.println(nomeA);
		
		
		try {
			String nomeB = null;
			nomeB.toUpperCase();
			System.out.println(nomeB);			
		} catch (Exception e) {
			System.out.println("Valor n�o atribu�do � vari�vel null!");
		}	
	}
}
