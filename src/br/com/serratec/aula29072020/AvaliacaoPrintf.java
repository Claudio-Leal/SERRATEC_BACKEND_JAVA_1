package br.com.serratec.aula29072020;

public class AvaliacaoPrintf {
	public static void main (String [] args) {
		double a = 135.4528;
		double b = 23050.568;
		double c = 5.0;
		
		// 8 posições com 2 casas decimais. 
		System.out.printf("Variável a:  = %8.2f\n", a);
		System.out.printf("Variável b:  = %8.2f\n", b);
		System.out.printf("Variável c:  = %8.2f\n", c);	
		System.out.printf("-------------------------\n");
		
		int d = 1;
		int e = 10;
		int f = 100;
		
		// 3 posições.
		System.out.printf("Variável d:  = %3d\n", d);		
		System.out.printf("Variável e:  = %3d\n", e);		
		System.out.printf("Variável f:  = %3d\n", f);		
	}
}
