package br.com.serratec.aula29072020;

public class AcessarAtributosAluno {
	public static void main (String [] args) {
		Aluno aluno = new Aluno();
		aluno.codAluno = 1;
		aluno.endereco = "Rua das flores, nº 100";
		aluno.nome = "Cláudio Leal";
		//aluno.telefone = "2198862-7953";
		
		System.out.println("Código: " + aluno.codAluno);
		System.out.println("Endereço: " + aluno.endereco);
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Telefone: " + aluno.telefone);
	}
}
