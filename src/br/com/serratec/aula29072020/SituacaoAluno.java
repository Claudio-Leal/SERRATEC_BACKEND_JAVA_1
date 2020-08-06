package br.com.serratec.aula29072020;


public class SituacaoAluno {

	public static void main(String[] args) {
		double nota1 = 8.0;
		double nota2 = 9.0;
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
