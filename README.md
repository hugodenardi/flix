# Flix: Seu Catálogo Local de Séries e Filmes

Flix é uma aplicação Java que permite catalogar suas séries e filmes favoritos. Ela interage com uma API REST para obter informações dos títulos e armazena tudo localmente em um banco de dados para fácil acesso.

## Funcionalidades

* **Integração com API REST:** Busca detalhes de séries e filmes através de uma API RESTful.

* **Armazenamento em Banco de Dados Local:** Persiste as informações dos títulos em um banco de dados local.

* **Troca de Dados JSON:** Envia e recebe dados de títulos no formato JSON.

* **Configuração Facilitada:** As configurações do banco de dados são gerenciadas no arquivo `application.properties`.

## Tecnologias Utilizadas

* **Java SDK 21**

* **Spring Boot** 

* **MySQL**

## Primeiros Passos

Estas instruções ajudarão você a ter uma cópia do projeto funcionando em sua máquina local para fins de desenvolvimento e teste.

### Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado:

* **Java SDK 21**

* **Maven** 

* **Seu cliente/servidor de banco de dados escolhido** (se aplicável, por exemplo: MySQL Workbench, pgAdmin, etc.)

### Instalação

1. **Clone o repositório:** 

    `git clone https://github.com/hugodenardi/flix.git`

2. **Configure o Banco de Dados:**
Abra o arquivo `src/main/resources/application.properties` e configure as suas definições de conexão com o banco de dados.

## Configuração do Banco de Dados (Exemplo para H2 - ajuste para o seu banco de dados)
```
spring.datasource.url=jdbc:h2:file:./data/flixdb
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
**Importante:** Substitua a configuração de exemplo do H2 pelos detalhes específicos do seu banco de dados (por exemplo, para MySQL, PostgreSQL, etc.).

A aplicação deve iniciar e estar acessível, geralmente em `http://localhost:8080` por padrão.

## Endpoints da API

Uma vez que a aplicação esteja em execução, você pode interagir com ela usando uma ferramenta como Postman, Insomnia ou curl.

* **`GET /titulos`**: Recupera todas as séries e filmes catalogados.

* **`POST /titulos`**: Adiciona uma nova série ou filme ao catálogo.

* **Corpo da Requisição (Exemplo JSON):**

 ```
 {
   "nome": "A Origem",
   "genero": "Ficção Científica",
   "tipo": "FILME",
   "anoLancamento": 2010,
   "jaAssitiu": true
   "avaliacao": 8.5
 }
 
 ```

* **`GET /titulos/id`**: Recupera um título específico pelo seu ID.

* **`PUT /titulos/id`**: Atualiza um título existente.

* **Corpo da Requisição (Exemplo JSON - similar ao POST):**

 ```
 {
     "nome": "A Origem",
   "genero": "Ficção Científica",
   "tipo": "FILME",
   "anoLancamento": 2010,
   "jaAssitiu": true
   "avaliacao": 8.5
 }
 
 ```

* **`DELETE /api/titulos/{id}`**: Exclui um título do catálogo.

## Contribuições

Contribuições são o que tornam a comunidade open source um lugar incrível para aprender, inspirar e criar. Quaisquer contribuições que você fizer são **muito apreciadas**.

1. Faça um Fork do Projeto

2. Crie sua Branch de Feature (`git checkout -b feature/NovaFuncionalidadeIncrivel`)

3. Faça Commit das suas Alterações (`git commit -m 'Adiciona alguma NovaFuncionalidadeIncrivel'`)

4. Envie para a Branch (`git push origin feature/NovaFuncionalidadeIncrivel`)

5. Abra um Pull Request

## Licença

Distribuído sob a Licença MIT. Veja `LICENSE` para mais informações.

## Contato

Hugo Denardi Domiciano - [hugodenardi@gmail.com](mailto:hugodenardi@gmail.com)

Link do Projeto: <https://github.com/hugodenardi/flix>
