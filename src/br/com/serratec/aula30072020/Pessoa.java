package br.com.serratec.aula30072020;

public class Pessoa {

	// Atributos (variáveis) com modificadores de acesso "private"
	private int idPessoa;
	private String nome;
	private double peso;
	private double altura;
	
	public int getIdPessoa() {
	return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Método COM retorno
	public double calculaImc () {
		double imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);
		return imc;
	}
	
	// Método COM retorno
	public String resultado () {
		String situacao;
		if (calculaImc() < 18.5) {
			return situacao = "abaixo do peso!";
		} else if (calculaImc() <= 24.9) {
			return situacao = "com o peso adequado!";
		} else {
			return situacao = "acima do peso!";
		}
	}
}
