package br.com.serratec.aula29072020;

public class TestaAlunoReferencia {
	
	public static void main (String [] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = a1;
		System.out.println(a1);
		System.out.println(a2);
		
		 if (a1 == a2) {
		// if (a1.equals(a2)) {
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes!");
	}
	
	}

}
