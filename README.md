# 📚 Sistema de Gerenciamento de Biblioteca Digital

Este projeto é uma demonstração prática e aprofundada da aplicação de conceitos de **Programação Orientada a Objetos (POO)** para a construção de um sistema de software coeso e funcional. O sistema simula o gerenciamento do acervo, usuários e operações de empréstimo de uma biblioteca digital.

> **Status:** Em construção...

-----

## 🚀 Funcionalidades Principais

  * **Gerenciamento Completo do Acervo:** Cadastro de diferentes tipos de itens (Livros, Mídias Digitais) e autores.
  * **Cadastro de Usuários:** Manutenção de uma lista de usuários do sistema.
  * **Sistema de Empréstimo e Devolução:** Lógica para emprestar e devolver itens, com atualização automática de status.
  * **Validação de Regras de Negócio:** Tratamento de erros, como tentar emprestar um item indisponível, através de exceções customizadas.
  * **Relatórios Polimórficos:** Geração de "fichas catalográficas" detalhadas e específicas para cada tipo de item no acervo.
  * **Interface Interativa via Console:** Um menu simples para simular as operações da biblioteca em tempo real.

-----

## 🧠 Demonstração de Conceitos de POO

Este projeto foi cuidadosamente desenhado para aplicar os seguintes conceitos:

  * **Herança**  
    A classe abstrata `ItemAcervo` serve como base, enquanto `Livro` e `MidiaDigital` herdam seus atributos e comportamentos comuns, adicionando suas próprias especializações.

  * **Polimorfismo**  
    Demonstrado através do método `gerarFicha()`. Ao iterar por uma lista de `ItemAcervo`, a mesma chamada de método produz resultados diferentes e específicos, dependendo se o objeto real é um `Livro` ou uma `MidiaDigital`.

  * **Classes Abstratas e Interfaces**  
    `ItemAcervo` é `abstract` pois não faz sentido existir um "item genérico" no acervo. A interface `Imprimivel` define um contrato que obriga todas as classes do acervo a serem capazes de gerar uma ficha.

  * **Encapsulamento**  
    Todos os atributos das classes são `private`, com acesso controlado por métodos públicos (`getters` e `setters`), garantindo a integridade dos dados dos objetos.

  * **Associação entre Classes**  
    Relações claras de "tem-um" são estabelecidas: um `Livro` tem um `Autor`; uma `Biblioteca` tem uma lista de `ItemAcervo`; um `Usuario` tem uma lista de itens emprestados.

  * **ArrayList**  
    Utilizado extensivamente na classe `Biblioteca` e `Usuario` para gerenciar coleções dinâmicas de objetos (acervo, usuários, itens emprestados).

  * **Enums**  
    O `enum StatusItem` garante segurança de tipo e clareza ao representar os estados possíveis de um item (`DISPONIVEL`, `EMPRESTADO`).

  * **Exceções Customizadas**  
    A classe `EmprestimoException` permite um tratamento de erros de negócio específico e semântico, tornando o código mais limpo e previsível.

-----

## 💻 Tecnologias Utilizadas

  * **Java (JDK 11 ou superior)**
  * **Git e GitHub** para controle de versão e hospedagem.

-----

## 🚀 Como Executar o Projeto

**Pré-requisitos:** Você precisa ter o Java Development Kit (JDK) instalado em sua máquina.

1. **Clone o repositório:**
    ```bash
    git clone https://github.com/lsantanadev/BibliotecaDigital.git
    ```

2. **Navegue até o diretório do projeto:**
    ```bash
    cd BibliotecaDigital
    ```

3. **Compile os arquivos Java:**  
   O comando abaixo compila todos os arquivos `.java` e organiza os arquivos `.class` em um diretório `out` para manter o projeto limpo.
    ```bash
    javac -d out src/BibliotecaDigital/*.java
    ```

4. **Execute a classe principal:**  
   Este comando executa o programa, especificando que as classes compiladas estão no diretório `out`.
    ```bash
    java -cp out BibliotecaDigital.Main
    ```

   O menu interativo será iniciado no seu terminal.

-----

## 👨‍💻 Autor

Projeto desenvolvido por Leonardo Santana da Silva.

-----

## 📄 Licença

Este projeto está sob a licença MIT.
