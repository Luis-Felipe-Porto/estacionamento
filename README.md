# Estacionamento
Back-end para o sistemas de gestão de selos de estacionamento do IFMA Monte castelo, destinado ao módulo de análise de cadastro
# Estacionamento
[![IFMA](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Documentação do projeto

https://ifma-api-estacionamento.herokuapp.com/swagger-ui.html#/analise-controller

API construida para o modulo de gestão de gereciamento de selos do estacionamento do ifma monte castelo **IFMA ** (#sds1), uso da métodologia agil XP [IFMA](https://montecastelo.ifma.edu.br "Site do IFMA").

A API consiste em uma seleção de cadastro pendentes, onde os dados podem ser cadastrado por servidor aluno ou tercerizado, e depois são analisados por um colaborador da prefeitura do campus, que faz um deferimento ou indeferimento baseados nestes dados.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação em produção
- Back end: Heroku
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 8

```bash
# clonar repositório
git clone https://https://github.com/Luis-Felipe-Porto/estacionamento

# entrar na pasta do projeto back end
cd estacionamento

# executar o projeto
./mvnw spring-boot:run
```


# Autor

Luis Felipe Porto

https://www.linkedin.com/in/luisporto-developer/
