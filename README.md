# 🍝 Restaurante Paparoto Cucina

Sistema simples de gerenciamento de pedidos de um restaurante, desenvolvido em **Java** utilizando a **Eclipse IDE**.

## 📋 Funcionalidades

- Registrar pedidos com:
  - Nome do cliente
  - Itens e preços
- Listar pedidos ordenados por **ID**
- Cálculo automático do **valor total do pedido**

## 🛠 Tecnologias

- **Java 17+** (ou compatível)
- **Eclipse IDE** para desenvolvimento

## 📂 Estrutura do Projeto

src/
├── Item.java
├── Pedido.java
└── Restaurante.java // classe principal com o menu e execução

markdown
Copiar código

- `Item.java` → representa um item do pedido (nome e preço).  
- `Pedido.java` → representa o pedido (id, cliente, lista de itens).  
- `Restaurante.java` → contém o `main` e os métodos `registrarPedido()` e `listarPedidos()`.  

## ▶️ Como executar

1. Clone este repositório ou baixe os arquivos.
2. Abra o projeto no **Eclipse IDE**:
   - `File > Import > Existing Projects into Workspace`
   - Selecione a pasta do projeto.
3. Execute a classe `Restaurante.java` com `Run As > Java Application`.

## 📌 Exemplo de Uso

=== REGISTRAR PEDIDO ===

Digite o nome do cliente: João Silva
Digite o nome do item: Pizza
Digite o preço do item: 45.00

Deseja adicionar outro item?
1 | Sim
2 | Não
Insira a sua opção: 2

========================================
RESTAURANTE PAPAROTO CUCINA
Pedido N°: 1
Cliente: João Silva
Itens:

Pizza | R$ 45.0
Valor total: R$ 45.0

css
Copiar código

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo em Java utilizando a **Eclipse IDE**.  
