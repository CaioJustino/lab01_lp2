// Pacotes
package lab01_lp2;

// Imports
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Menu {
    private boolean ativo;
    private ArrayList<Pedido> lista_pedidos;

    // Construtor
    public Menu() {
        ativo = true;
        lista_pedidos = new ArrayList<>();
    }

    // Getters
    public boolean getAtivo() {
        return ativo;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return lista_pedidos;
    }

    // Setters
    public void setAtivo(boolean s) {
        this.ativo = s;
    }

    public void setListaPedido(ArrayList<Pedido> lp) {
        this.lista_pedidos = lp;
    }

    // Métodos Principais
    public void registrarPedido(Scanner sc) {
    	int id = 1;
    	if (!lista_pedidos.isEmpty()) {
    	    id = lista_pedidos.get(lista_pedidos.size() - 1).getId() + 1;
    	}

        System.out.println("\n=== REGISTRAR PEDIDO ===");

        System.out.print("\nDigite o nome do cliente: ");
        String nome_cliente = sc.next();

        Pedido pedido = new Pedido(id, nome_cliente);
        boolean loop = true;

        while (loop) {
            System.out.print("\nDigite o nome do item: ");
            String nome_item = sc.next();

            System.out.print("Digite o preço do item: ");
            double preco = sc.nextDouble();

            Item item = new Item(nome_item, preco);
            pedido.getListaItens().add(item);

            int op = 0;
            while (op != 1 && op != 2) {
                System.out.println("\nDeseja adicionar outro item?");
                System.out.println("1 | Sim");
                System.out.println("2 | Não");
                System.out.print("Insira a sua opção: ");

                op = sc.nextInt();
                sc.nextLine();
                if (op != 1 && op != 2) {
                    System.out.println("Opção inválida! Digite 1 ou 2.");
                }
            }

            if (op == 2) {
                loop = false;
                lista_pedidos.add(pedido);

                System.out.println("\n\n========================================");
                System.out.println("      RESTAURANTE PAPAROTO CUCINA ");
                System.out.println("========================================");
                System.out.println("\nPedido N°: " + pedido.getId());
                System.out.println("Cliente: " + pedido.getNomeCliente());
                System.out.println("----------------------------------------");
                System.out.println("\nItens:");
                for (Item i : pedido.getListaItens()) {
                    System.out.println("- " + i.getNome() + " | R$ " + i.getPreco());
                }
            }
        }
    }

    public void removerPedido(Scanner sc) {
        System.out.println("\n=== REMOVER PEDIDO ===");
        System.out.print("\nDigite o número do pedido que deseja remover: ");
        int pid = sc.nextInt();
 
        boolean encontrado = false;
        for (Pedido p : lista_pedidos) {
            if (p.getId() == pid) {
                lista_pedidos.remove(p);
                System.out.println("Pedido #" + pid + " removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Pedido não encontrado.");
        }
    }

    public void listarPedidos() {
    	System.out.println("\n=== LISTAR PEDIDOS ===");
    	if (lista_pedidos.isEmpty()) {
            System.out.println("\nNenhum pedido registrado!");
            return;
        }
    	
        lista_pedidos.sort(Comparator.comparingInt(Pedido::getId));
    	
        for (Pedido p : lista_pedidos) {
            System.out.println("\nPedido N°: " + p.getId());
            System.out.println("Cliente: " + p.getNomeCliente());
            System.out.println("Itens:");

            double total = 0;
            for (Item i : p.getListaItens()) {
                System.out.println("- " + i.getNome() + " | R$ " + i.getPreco());
                total += i.getPreco();
            }

            System.out.println("Valor total: R$ " + total);
            System.out.println("----------------------------------------");
        }
    }
}
