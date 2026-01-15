# 💰 Gestão de Despesas API

Este é um projeto simples de API REST desenvolvido para colocar em prática conhecimentos de **Java** e **Spring Boot**. O sistema permite gerenciar despesas financeiras, permitindo criar, listar, atualizar e excluir registros.

## 🚀 Tecnologias Utilizadas

* **Java 17** ou superior
* **Spring Boot 4**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória para testes)
* **Lombok** (Produtividade com anotações)

## 🛠️ Funcionalidades (CRUD)

* **Cadastrar Despesa**: Registra descrição, valor, data, categoria e e-mail.
* **Listar Todas**: Retorna todas as despesas salvas no banco.
* **Buscar por ID**: Localiza uma despesa específica via UUID.
* **Atualização Parcial (PATCH)**: Permite alterar apenas um campo (ex: só o valor) sem perder os outros dados.
* **Excluir**: Remove uma despesa do sistema.

## 📦 Como rodar o projeto

1. **Clone o repositório:**
   ```bash
   https://github.com/KaiqueCarvalho01/Gestao-Despesa.git
     ```


2. **Execute a aplicação:** Abra o projeto na sua IDE (IntelliJ ou VS Code) e execute a classe principal GestaoDespesaApplication.

