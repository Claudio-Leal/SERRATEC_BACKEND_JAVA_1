package br.com.serratec.aula06082020;

public class DoisVetores {

	public static void main(String[] args) {
		int [] vetor1 = {1, 2, 3, 4, 5};
		int [] vetor2 = {3, 0, 2};
		
		for (int i = 0; i < 4; i++) {
			int resultado = vetor1[i] / vetor2[i];			
		}
	}
}
