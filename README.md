# Restaurante Paparoto Cucina

Laboratório 1 - Sistema de Gerenciamento de Pedidos: projeto de POO (Programação Orientada a Objetos) desenvolvido em Java para a disciplina de Linguagem de Programação II (LP II).<br><br>

## 📋 Funcionalidades

- registrarPedido()
- removerPedido()
- listarPedidos()<br><br>

## 🛠 Tecnologias

- **Java 17+**
- **Eclipse IDE**<br><br>

## 📂 Estrutura Principal do Projeto

```
src/
├── app/
  └── Main.java
└── lab01_lp2/
  ├── Item.java
  ├── Menu.java
  └── Pedido.java
```

<br>

## ▶️ Como executar

1. Clone este repositório ou baixe os arquivos.<br><br>
2. Abra o projeto no **Eclipse IDE**:
   - `File > Import > Existing Projects into Workspace`
   - Selecione a pasta do projeto.<br><br>
3. Execute a classe `Main.java` com `Run As > Java Application`.<br><br>

## 📌 Exemplo de Uso
```
  ____                             _           ____           _             
 |  _ \ __ _ _ __   __ _ _ __ ___ | |_ ___    / ___|   _  ___(_)_ __   __ _ 
 | |_) / _` | '_ \ / _` | '__/ _ \| __/ _ \  | |  | | | |/ __| | '_ \ / _` |
 |  __/ (_| | |_) | (_| | | | (_) | || (_) | | |__| |_| | (__| | | | | (_| |
 |_|   \__,_| .__/ \__,_|_|  \___/ \__\___/   \____\__,_|\___|_|_| |_|\__,_|
            |_|                                                             

Bem-vind@ ao Gestor de Pedidos!
Digite o número da função que deseja executar:
 1 | Registrar Pedido
 2 | Remover Pedido
 3 | Listar Pedidos
 4 | Sair

Insira a sua opção: 1

=== REGISTRAR PEDIDO ===

Digite o nome do cliente: João Silva
Digite o nome do item: Pizza
Digite o preço do item: 45,00

Deseja adicionar outro item?
1 | Sim
2 | Não
Insira a sua opção: 2

========================================
      RESTAURANTE PAPAROTO CUCINA
========================================

Pedido N°: 1
Cliente: João Silva
----------------------------------------

Itens:
- Pizza | R$ 45.0
```
<br>

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo em Java por Caio Justino.
