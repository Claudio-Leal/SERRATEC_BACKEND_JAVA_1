package br.com.serratec.aula29072020;

public class Conta {	
		
		// Atributos (vari�veis)
		String nome;
		String endereco;
		String banco;
		int numAgencia;
		int numConta;
		double saldo;
		

		// M�todo deposito - SEM retorno
		public void deposito (double valor) {
		this.saldo += valor;
		System.out.println("Saldo atual ap�s dep�sito: " + this.saldo);
		}
		
		// M�todo saque - SEM retorno
		public void saque (double valor) {			
		this.saldo -= valor;
		System.out.println("Seu atual ap�s saque: " + this.saldo);
		}			
}
