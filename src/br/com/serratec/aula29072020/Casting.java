package br.com.serratec.aula29072020;

public class Casting {

	public static void main(String[] args) {
		int inteiro1 = 100;
		int inteiro2 = 200;
		int soma = inteiro1 + inteiro2;
		System.out.println("(inteiro1 + inteiro2): " + soma);
		
		double double1 = (double) inteiro1;
		double double2 = (double) inteiro2;
		double divisao = double1 / double2;
		System.out.println("(double1 / double2): " + divisao);
	}

}
