<div align="center">
  <h1>Cadastro de Colaboradores</h1>
</div>



Este projeto é uma aplicação desenvolvida em Java para realizar o gerenciamento de colaboradores, com as funcionalidades de cadastrar, listar, remover, buscar por ID e atualizar. O projeto utiliza o padrão DAO (Data Access Object) e JavaBeans, integrando-se a um banco de dados Oracle por meio do SQL Developer.

## Funcionalidades🚀 
- Cadastrar Colaborador: Adicionar novos colaboradores ao sistema.
- Listar Colaboradores: Exibir todos os colaboradores cadastrados.
- Remover Colaborador: Excluir um colaborador do sistema pelo seu ID.
- Buscar Colaborador por ID: Consultar um colaborador específico no banco de dados.
- Atualizar Colaborador: Editar as informações de um colaborador existente.

## Tecnologias Utilizadas 🛠️ 
- Java: Linguagem de programação principal.
- DAO: Padrão para abstração e gerenciamento de dados.
- JavaBeans: Estruturação de classes com encapsulamento.
- Oracle Database: Banco de dados utilizado para armazenar as informações dos colaboradores.
- SQL Developer: Ferramenta para interação com o banco de dados.

## Estrutura de Diretórios 📂 

```plaintext
src/
├── br.com.empresa.bean/
│   └── Colaborador.java          # Classe JavaBean que representa o colaborador
├── br.com.empresa.conexaoBD/
│   └── ConexaoBD.java            # Classe para conexão com o banco de dados
├── br.com.empresa.dao/
│   ├── ColaboradorDAO.java       # DAO genérico para operações com colaboradores
│   └── OracleColaboradorDAO.java # Implementação do DAO para Oracle
├── br.com.empresa.teste/
│   ├── ChamadaProcedure.java     # Teste de chamada de procedure
│   ├── TesteAlteracao.java       # Teste para atualizar registros
│   ├── TesteCadastro.java        # Teste para cadastrar registros
│   ├── TesteListagem.java        # Teste para listar registros
│   └── TesteRemocao.java         # Teste para remover registros
└── lib/
    └── ojdbc11.jar               # Driver JDBC para conexão com o Oracle
````    
    
   
## Configuração do Banco de Dados 🛠️

### 1. Certifique-se de que o Oracle Database está configurado e rodando.

### 2. Crie a tabela no SQL Developer

Execute o seguinte script SQL para criar a tabela de colaboradores:

```sql
CREATE TABLE colaboradores (
    cod_colaborador NUMBER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    nome VARCHAR2(100) NOT NULL,
    email VARCHAR2(50) NOT NULL,
    salario FLOAT(10, 2) NOT NULL,
    dataContratacao DATE NOT NULL
);
```
### 3.Configuração de Conexão com o Banco de Dados

No arquivo `ColaboradorDAO.java`, atualize as configurações de conexão com os dados do seu banco de dados:

```java
private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
private static final String USER = "seu_usuario";
private static final String PASSWORD = "sua_senha";
```


## Como Executar ▶️ 

- Clone este repositório: https://github.com/ThamyCorrea/CadastroColaborador.JAVA
- Importe o projeto em sua IDE (Ex.: Eclipse, IntelliJ).
- Certifique-se de que as dependências do Oracle JDBC Driver estão configuradas no seu projeto.
- Execute a classe Main.java.

## Autora 🧑‍💻 

Seu Nome: ThamyCorrea, junto com o curso FIAP - Fundamentos em JAVA

GitHub: https://github.com/ThamyCorrea

LinkedIn: https://www.linkedin.com/in/thamiris-corrêa/

### Se precisar de ajustes ou tiver sugestões, é só avisar! 😊
