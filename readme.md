## Objetivo

Automatizar um teste de API no sistema Reqres.in
 
#### Cenário a ser automatizado

1. Executar a request GET https://reqres.in/api/users?page=2
2. Validar que o status code é igual a 200
3. Validar os dados do usuário 12

```json
   {
      "id": 12,
      "email": "rachel.howell@reqres.in",
      "first_name": "Rachel",
      "last_name": "Howell",
      "avatar": "https://reqres.in/img/faces/12-image.jpg"
    }
```
 

## Pré-Condições

* java
* rest-assured
* TestNg ou Junit

## Entrega do Projeto

Faça um *Fork* do projeto atual

#### O que será avaliado

* lógica
* boa organização do código
* domínio das ferramentas

Boa sorte!
