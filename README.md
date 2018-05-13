# Gera-Inteiro
Serviço REST que gera um número inteiro a partir de outros dois números informados, usando lógica específica

A aplicação(módulo) foi feita com Springboot e adicionalmente foi colocado o Swagger, implementação da especificação SpringFox, que permite criar documentação online de APIs REST.

Ao colocar a aplicação online, acessar o seguinte endereço: http://localhost:8080/swagger-ui.html, clicar em gera-inteiro-resource e em seguida em GET. Feito isso, uma interface abrirá e permitirá o teste online de requisições na aplicação.

# Exemplo:
Para os parâmetros: 123 e 456

A requisição: http://localhost:8080/gerainteiro/123/456 retornará como resultado o valor 142536, que segue a lógica abaixo:

Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:

O primeiro número de C é o primeiro número de A;
O segundo número de C é o primeiro número de B;
O terceiro número de C é o segundo número de A;
O quarto número de C é o segundo número de B;
Assim sucessivamente…

Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
Caso C seja maior que 1.000.000, retornar -1

O endpoint é: http://localhost:8080/gerainteiro/{numeroa}/{numerob}
