// Pacotes
package lab01_lp2;

// Imports
import java.util.ArrayList;

public class Pedido {
	private int id;
	private String nome_cliente;
	private ArrayList<Item> lista_itens;
	
	// Construtor
	public Pedido(int i, String n) {
		id = i;
		nome_cliente = n;
		lista_itens = new ArrayList<Item>();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	
	public String getNomeCliente() {
		return nome_cliente;
	}
	
	public ArrayList<Item> getListaItens() {
		return lista_itens;
	}
	
	// Setters
	public void setId(int i) {
		this.id = i;
	}
	
	public void setNomeCliente(String n) {
		this.nome_cliente = n;
	}
	
	public void setListaItens(ArrayList<Item> li) {
		this.lista_itens = li;
	}
}
