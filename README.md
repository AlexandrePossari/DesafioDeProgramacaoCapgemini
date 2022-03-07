# DesafioDeProgramacaoCapgemini

API criada para o desafio de programação da Capgemini

### Tecnologias usadas
- Java 11;
- Spring Framework 2.6.4;

## Requerimentos

Para rodar o projeto é necessário:

- [Java 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html);
- [Maven](https://maven.apache.org/download.cgi);
- [Postman](https://www.postman.com/downloads/);
- [IntelliJ](https://www.jetbrains.com/idea/download);

Com tudo instalado, basta executar o projeto no IntelliJ.

## Documentação da API

- Questão 1: 
  - URL: /questao1
  - Método: POST
  - Body: Questão 1 Request
- Questão 2:
  - URL: /questao2
  - Método: POST
  - Body: Questão 2 Request  
- Questão 3:
  - URL: /questao3
  - Método: POST
  - Body: Questão 3 Request 

* Questão 1 Request
```
{
    "array": "[9, 2, 1, 4, 6]"
}
```

| Campo | Valor | Descrição |
|--|--|--|
| array | String | Deve ser usado no formato de vetor e com quantidade ímpar de números |

* Questão 2 Request
```
{
    "x": 2,
    "array":"[1, 5, 3, 4, 2]"
}
```

| Campo | Valor | Descrição |
|--|--|--|
| x | Inteiro >= 0 | |
| array | String | Deve ser usado no formato de vetor |

* Questão 3 Request
```
{
    "frase": "tenha um bom dia"
}
```

| Campo | Valor | Descrição |
|--|--|--|
| frase | String |  |

Observação: Também é possível rodar a collection `DesafioCapgemini.postman_collection` localizada na pasta `postman`. Apenas importe no Postman e rode.
