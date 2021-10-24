
<h1 align="center"> Fiap Hemocentro </h1>
<p align="center"> Api criada para o módulo "WEBSERVICES & RESTFUL TECHNOLOGIES" - FIAP - Grupo 1 <br></p>

###  Integrantes do Grupo<Br>
341417 - LUCAS GOIANA MALICIA<br>
340887 - VINICIUS BEZERRA LIMA<br>
342125 - JACKSON DOS SANTOS ROQUE DA SILVA<Br>

# Como utilizar o backend

### Pré-requisitos

- Java 11
- Gradle
- Mysql
- Spring Framework

# Tema
Todos os dias acontecem centenas de acidentes, cirurgias e queimaduras violentas que exigem transfusão, assim como os portadores de hemofilia, leucemia e anemias, para ajudar as pessoas nessas condições a encontrar os Hemocentros mais próximos, nós desenvolvemos o Sistema de Banco de Sangue - FiapBlood, o software mais completo para o gerenciamento de hemocentros.

# Projeto

Para esse projeto foi criado uma api com base nas opções de escolha que nos foi dada, por isso, optamos por fazer o nosso software com Spring Framework e Mysql. 

O Software foi dividido em duas camadas:

- **FiapBlood** - Contempla a API de Java com Mysql, Cadastro de Banco de Sangue, Controle de Estoque e tipo de Sangue.
- **bancodesanguefront** - Contempla o front end que informando somente o CEP busca a lista de Hemocentros/Bancos de Sangue mais próximos.

Cada diretório mencionado acima possui uma documentação no arquivo readme.md, essa documentação possui o passo a passo da execução do aplicativo e a documentação da api.

### Escolha Técnica

Utilizamos o SpringFramework pelo ganho de produtividade e pela otimização de tempo.
Vale destacar o Spring Data JPA, que nos permite utilizar todas as annotations, facilitando a conexão da aplicação java com qualquer banco de dados sem a necessidade de criar os
métodos de CRUD.

Por fim, escolhemos a estrutura MVC para os projetos, visando separação, estruturação e melhor legibilidade nos códigos.

### Modelo Logico - FiapBlood

![modelo logico](https://lucasgoiana.com/rest/bd.png)

> O modelo logico se encontra no arquivo "FiapBlood_MER.pdf"
