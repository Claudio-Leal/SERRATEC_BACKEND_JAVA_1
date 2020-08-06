package br.com.serratec.aula06082020;

import java.util.Scanner;

public class NumeroInteiro {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		int valor1;
		System.out.println("Digite um número inteiro: ");
		valor1 = scanner.nextInt();
		System.out.println(valor1);
	}	
}
