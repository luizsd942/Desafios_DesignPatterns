﻿#  Desafio: Factory method

* Você precisa facilitar a criação de uma nota fiscal, que contém um número, uma data de emissão e itens de produtos.
A data de emissão deve ser do tipo java.util.Date, porém você irá facilitar a criação desse objeto, aceitando no seu 
builder a data em String do formato dd/MM/yyyy.

* O produto possui um nome, quantidade e valor. Este último do tipo BigDecimal mas, você deve aceitar esse valor 
como String ou como Double no builder.

* Para deixar um pouco mais interessante, vamos pensar que podemos criar dois tipos de notas fiscais, 
uma para pessoa física e outra para pessoa jurídica.
A diferença entre esses duas classes está no cálculo do imposto, que para pessoa física custa 7% do valor total 
e em pessoa jurídica, 4%.

* Vamos misturar alguns padrões? Nessa ideia de cálculo do imposto, podemos usar o Factory Method.

* Se o cáculo do imposto é sempre da mesma forma, podemos criar um método abstrato que recupera esse valor 
na superclasse NotaFiscal, e criar um método nessa mesma classe que faz as contas.

* Você terá apenas um builder, então crie dois métodos, um para criar cada instância, 
NotaFiscalPessoaFisica ou NotaFiscalPessoaJuridica.