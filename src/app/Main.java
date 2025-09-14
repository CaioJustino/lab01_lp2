// Pacotes
package app;

// Imports
import lab01_lp2.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        while (menu.getAtivo()) {
            System.out.println("\n  ____                             _           ____           _             \r\n"
                    + " |  _ \\ __ _ _ __   __ _ _ __ ___ | |_ ___    / ___|   _  ___(_)_ __   __ _ \r\n"
                    + " | |_) / _` | '_ \\ / _` | '__/ _ \\| __/ _ \\  | |  | | | |/ __| | '_ \\ / _` |\r\n"
                    + " |  __/ (_| | |_) | (_| | | | (_) | || (_) | | |__| |_| | (__| | | | | (_| |\r\n"
                    + " |_|   \\__,_| .__/ \\__,_|_|  \\___/ \\__\\___/   \\____\\__,_|\\___|_|_| |_|\\__,_|\r\n"
                    + "            |_|                                                             ");

            System.out.println("\nBem-vind@ ao Gestor de Pedidos!\nDigite o número da função que deseja executar:");
            System.out.println(" 1 | Registrar Pedido\n 2 | Remover Pedido\n 3 | Listar Pedidos\n 4 | Sair");
            System.out.print("\nInsira a sua opção: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    menu.registrarPedido(sc);
                    break;
                case 2:
                    menu.removerPedido(sc);
                    break;
                case 3:
                    menu.listarPedidos();
                    break;
                case 4:
                    menu.setAtivo(false);
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        sc.close();
        System.out.println("Programa encerrado!");
    }
}
