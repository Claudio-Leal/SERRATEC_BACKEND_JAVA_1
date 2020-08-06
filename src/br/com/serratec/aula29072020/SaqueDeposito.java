package br.com.serratec.aula29072020;

public class SaqueDeposito {
	public static void main (String [] args) {
		
		Conta conta = new Conta();
		conta.banco = "Bradesco";
		conta.nome = "Cláudio Leal";
		conta.numAgencia = 1125;
		conta.numConta = 54280;
		
		conta.saldo = 300.0;
		System.out.println("Saldo atual: " + conta.saldo);
		System.out.println("Banco: " + conta.banco);
		System.out.println("Nome: " + conta.nome );
		System.out.println("Agência: " + conta.numAgencia);
		System.out.println("Conta: " + conta.numConta);		
		conta.deposito(100);
		conta.saque(50);								
	}
}
