package br.com.alura.Model;

public class Produto {
	
	
	private String nome;
	private double preco;

	public Produto(String nome, double preco)
	{
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Nome:" + nome + "\n" +
				"Preco: " + preco + "\n";
	}
	

}
