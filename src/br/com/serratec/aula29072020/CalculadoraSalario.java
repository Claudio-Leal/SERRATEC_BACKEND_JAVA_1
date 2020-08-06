package br.com.serratec.aula29072020;

public class CalculadoraSalario {

	public static void main(String[] args) {
		double faixa1 = 0.08;
		double faixa2 = 0.09;
		double faixa3 = 0.10;
		double faixa4 = 0.11;
		double valorInss;
		double salarioBruto = 10000.0;
		double salarioLiquido = 0.0;
		
		if (salarioBruto <= 1751.81) {
			valorInss = salarioBruto * faixa1;			
		} else if (salarioBruto <= 2912.72) {
			valorInss = salarioBruto * faixa2;
		} else if (salarioBruto <= 5839.45) {
			valorInss = salarioBruto * faixa3;
		} else {
			valorInss = 5839.456 * faixa4;
		}
		
		salarioLiquido = salarioBruto - valorInss;
		System.out.println("Salário Bruto......:" + salarioBruto);
		System.out.println("Desconto INSS......:" + valorInss);
		System.out.println("Salário líquido....:" + salarioLiquido);
		
	}

}
