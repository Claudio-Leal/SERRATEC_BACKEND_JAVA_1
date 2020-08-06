package br.com.serratec.aula30072020;

public class Produto {
	
	// Atributos (vari�veis) com o modificador private.
	private int cod;
	private String descricao;
	private double valor;
	
	// Construtor (sem declara��o de retorno).
	public Produto (String descricao) {
		this.descricao = descricao;
	}
	
	// M�todo (retorna String).
	public String getDescricao () {
		return descricao;
	}
	
	// M�todo (retorna void).
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}

}
