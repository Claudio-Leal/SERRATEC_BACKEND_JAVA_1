package br.com.serratec.aula29072020;

public class Conversao {

	public static void main(String[] args) {
		// Conversão implícita. 
		int a = 100;
		float b = a;
		
		// Conversão explícita. 
		// Casting de um double para inteiro.
		// A variável d recebe a parte inteira de c. 
		// Obs.: int d = c; ---> não funciona. 
		double c = 4.19;
		int d = (int) c;
		
		// Conversão explícita. 
		// Letra f indica que a variável é do tipo double.
		// Obs.: float e = c; ---> não funciona.
		float e = (float) c;
		float f = 6.18f;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);

	}

}
