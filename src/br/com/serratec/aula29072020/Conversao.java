package br.com.serratec.aula29072020;

public class Conversao {

	public static void main(String[] args) {
		// Convers�o impl�cita. 
		int a = 100;
		float b = a;
		
		// Convers�o expl�cita. 
		// Casting de um double para inteiro.
		// A vari�vel d recebe a parte inteira de c. 
		// Obs.: int d = c; ---> n�o funciona. 
		double c = 4.19;
		int d = (int) c;
		
		// Convers�o expl�cita. 
		// Letra f indica que a vari�vel � do tipo double.
		// Obs.: float e = c; ---> n�o funciona.
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
