# gerenciador_avaliacao_funcionarios

Este projeto é uma aplicação Java que demonstra a integração dos padrões Repository, DAO (Data Access Object) e Factory Method. Utiliza o Maven como ferramenta de gerenciamento de projetos e é desenvolvido com Java 17.

## 🚀 Sobre o Projeto

**Gerenciador de Funcionários** é um exemplo de sistema para gerenciar dados de funcionários em uma empresa fictícia. O projeto permite realizar operações básicas como busca, inserção e exclusão de dados relacionados a funcionários e suas avaliações. Além disso, utiliza o padrão Factory Method para a criação de objetos relacionados aos funcionários e avaliações.

### Principais Funcionalidades

- **Busca de Funcionários**: Consulte informações sobre funcionários armazenados no banco de dados.
- **Inserção de Funcionários**: Adicione novos registros de funcionários.
- **Deleção de Funcionários**: Remova registros de funcionários do sistema.
- **Avaliações**: Gerencie avaliações associadas aos funcionários.

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada.
- **Maven**: Gerenciador de dependências e build.
- **Repository Pattern**: Padrão de design para encapsular o acesso a dados.
- **DAO Pattern**: Padrão de design para separar a lógica de acesso a dados da lógica de negócios.
- **Factory Method Pattern**: Padrão de design para criar objetos sem especificar a classe exata do objeto a ser criado.

## 🚧 Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`src/main/java`**: Contém o código fonte do projeto.
  - **`dao`**: Pacote que inclui as classes DAO responsáveis pelo acesso aos dados.
  - **`repository`**: Pacote que contém as classes de repositório que integram diferentes DAOs.
  - **`factory`**: Pacote que inclui as implementações do padrão Factory Method para a criação de objetos.
  - **`model`**: Pacote para as classes de modelo, representando as entidades do sistema (Funcionário, Avaliação, etc.).
  - **`service`**: Pacote para a lógica de negócios e serviços relacionados aos funcionários e avaliações.

## 💻 Como Rodar o Projeto

1. **Clone o Repositório:**

   ```bash
   git clone https://github.com/usuario/gerenciador_avaliacao_funcionarios.git
   ```

2. **Navegue até o Diretório do Projeto:**

   ```bash
   cd gerenciador_avaliacao_funcionarios
   ```

3. **Compile e Execute o Projeto com Maven:**

   Para compilar o projeto:

   ```bash
   mvn clean install
   ```

   Para executar a aplicação:

   ```bash
   mvn exec:java -Dexec.mainClass="com.ufes.gerenciadoravaliacoesfuncionarios.Principal"
   ```

## 🔧 Configuração do Ambiente

Certifique-se de ter o [JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) e o [Maven](https://maven.apache.org/download.cgi) instalados e configurados no seu ambiente de desenvolvimento.

## 📝 Contribuições

Contribuições são bem-vindas! Se você tiver sugestões, correções ou melhorias, fique à vontade para abrir uma issue ou um pull request.

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## 📧 Contato

Para dúvidas ou sugestões, entre em contato com [talles0h@gmail.com](mailto:talles0h@gmail.com).
