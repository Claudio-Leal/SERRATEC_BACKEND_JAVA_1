package br.com.serratec.aula29072020;

public class Conta {	
		
		// Atributos (variáveis)
		String nome;
		String endereco;
		String banco;
		int numAgencia;
		int numConta;
		double saldo;
		

		// Método deposito - SEM retorno
		public void deposito (double valor) {
		this.saldo += valor;
		System.out.println("Saldo atual após depósito: " + this.saldo);
		}
		
		// Método saque - SEM retorno
		public void saque (double valor) {			
		this.saldo -= valor;
		System.out.println("Seu atual após saque: " + this.saldo);
		}			
}
