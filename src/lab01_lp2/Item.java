// Pacotes
package lab01_lp2;

// Imports


public class Item {
	private String nome;
	private double preco;
	
	// Construtor
	public Item(String n, double p) {
		nome = n;
		preco = p;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	// Setters
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setPreco(double p) {
		this.preco = p;
	}
}
