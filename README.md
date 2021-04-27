# Estacionamento
Back-end para o sistema de gestão de selos de estacionamento do IFMA Monte Castelo, destinado ao módulo de análise de cadastro
# Estacionamento
[![IFMA](https://img.shields.io/npm/l/react)](https://github.com/Luis-Felipe-Porto/estacionamento/blob/main/LICENSE) 

# Documentação do projeto

https://ifma-api-estacionamento.herokuapp.com/swagger-ui.html

API construida para o modulo de gestão de gerenciamento de selos do estacionamento do ifma monte castelo **Instituto Federal de Educação, Ciência e Tecnologia do Maranhão**, [IFMA](https://montecastelo.ifma.edu.br "Site do IFMA"),com o uso da métodologia agil XP.

A API consiste em uma seleção de cadastro pendentes, onde os dados de cadastro podem ser solicitados por servidor, aluno ou tercerizado, e depois são analisados por um colaborador da prefeitura do campus, que faz um deferimento ou indeferimento baseados nestes dados,essa análise é feita devido integridade de verificar que os condutores possuem vínculo com o IFMA pra realizar o estacionamento de seus veiculo no campus.
## DOC HTTP
![HTTP 1](https://github.com/Luis-Felipe-Porto/Luis-Felipe-Porto/blob/master/assets/doc%20API.JPG)
## RELEASES NA METODOLOGIA XP
![HTTP 1](https://github.com/Luis-Felipe-Porto/Luis-Felipe-Porto/blob/master/assets/Realeses.JPG)

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
