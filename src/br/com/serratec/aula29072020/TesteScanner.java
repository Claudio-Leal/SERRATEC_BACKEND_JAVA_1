package br.com.serratec.aula29072020;

import java.util.Scanner;

public class TesteScanner {
	public static void main (String [] args) {
	Scanner scanner = new Scanner(System.in);
	
	int valor1;
	int valor2;
	int soma;
	
	System.out.println("Digite o valor 1: ");
	valor1 = scanner.nextInt();
	System.out.println("Digite o valor 2: ");
	valor2 = scanner.nextInt();
	soma = valor1 + valor2;	
	System.out.println("Soma: " + soma);
	}
}
