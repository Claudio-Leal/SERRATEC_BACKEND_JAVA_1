package br.com.serratec.aula29072020;

public class AvaliacaoPrintf {
	public static void main (String [] args) {
		double a = 135.4528;
		double b = 23050.568;
		double c = 5.0;
		
		// 8 posi��es com 2 casas decimais. 
		System.out.printf("Vari�vel a:  = %8.2f\n", a);
		System.out.printf("Vari�vel b:  = %8.2f\n", b);
		System.out.printf("Vari�vel c:  = %8.2f\n", c);	
		System.out.printf("-------------------------\n");
		
		int d = 1;
		int e = 10;
		int f = 100;
		
		// 3 posi��es.
		System.out.printf("Vari�vel d:  = %3d\n", d);		
		System.out.printf("Vari�vel e:  = %3d\n", e);		
		System.out.printf("Vari�vel f:  = %3d\n", f);		
	}
}
