package br.com.alura.maven;

public class Produto {
	private final String nome;
	private final double preco;
	//private final String comida = "comida";
	
	 public Produto(String nome, double preco, String categoria) {
	        super();
	        this.nome = nome;
	        this.preco = preco;
	    }
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}

	public double getProdutoComImposto() {

		return preco * 1.1;
	}

}
