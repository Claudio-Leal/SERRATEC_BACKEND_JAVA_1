package br.com.serratec.aula30072020;

public class Produto {
	
	// Atributos (variáveis) com o modificador private.
	private int cod;
	private String descricao;
	private double valor;
	
	// Construtor (sem declaração de retorno).
	public Produto (String descricao) {
		this.descricao = descricao;
	}
	
	// Método (retorna String).
	public String getDescricao () {
		return descricao;
	}
	
	// Método (retorna void).
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}

}
