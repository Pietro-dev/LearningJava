# Resumo
## Classes e Objetos
As classes são moldes que criamos, definindo variáveis de instância(atributos) e métodos. Com esses moldes criados podemos criar os objetos. Os objetos podem inserir valores nos atributos da classe e usar os métodos delas.
<hr>
## Métodos e Parâmetros
Os métodos definem os comportamentos de uma classe (e consequentemente dos objetos criados por essa classe). Os métodos podem ter ou não ter um retorno. Além de receber, ou não, argumentos (parâmetros) no seu escopo.
<hr>
## Orientação a Objetos
É uma forma de organizar a aplicação pensando em objetos. Para isso, temos 4 pilares fundamentais da POO.
- Herança
- Polimorfismo
- Encapsulamento
- Abstração
<hr>
## Herança
Permite que classes filhas, sejam criadas a partir de uma classe pai e herdem os atributos e métodos dessa classe. Além de poderem criar outros atributos e outros métodos.
<hr>
## Herança Múltipla
Uma classe pode extender os métodos e atributos de apenas uma classe. Mas, pode implementar infinitas interfaces. Podendo assim, herdar métodos de múltiplas interfaces.
<hr>
## Interfaces
Uma interface define um contrato (definindo assinaturas de métodos) que qualquer classe que implementar a interface deverá cumprir.
<hr>
## Polimorfismo
No polimorfismo, os métodos herdados ou implementados podem assumir comportamentos diferentes dependendo da classe que o implementar.
<hr>
## Construtores
Os construtures padronizam a forma como um objeto é criado e inicializado.
- No args constructor
- All args constructor
<hr>
## Abstração
- Classes abstratas não podem ser instânciadas, evitando objetos serem criados a partir de uma classe pai.
- Métodos podem ser definidos como abstratos. Para isso, eles não podem ter um corpo. O corpo do método será definido em cada uma das classes filhas.
<hr>
## Classes Abstratas x Interfaces
É impossível criar objetos em classes abstratas e em interfaces. 
Objetos só podem ser criados a partir de classes comuns.
Uma classe abstrata obriga que quaiquer objetos sejam criados a partir das subclasses.
Classes abstratas são indispensáveis para escalabilidade e manutenção do código. 
<hr>
Toda vez que um método é criado em uma Interface, eles são abstratos.
Atributos criados em interfaces são automáticamente _final_. Ou seja, são constantes, seus valores não podem ser alterados depois de sua criação.
<hr>
## Super e Sub classes
Uma sub classe herda tudo da sua super classe, exceto, os métodos construtores. 
Para uma sub classes "herdar" um construtor, ela precisa instanciar este construtor dentro da sua classe, usar a palavra `super` ao invés de `this` para indicar que os atributos que serão inicializados pelos construtores são os da super classe.
<hr>
## Sobrecarga de Construtores
Os construtores são imutáveis. Caso precisemos refatorar uma classe, refatorar os atributos dela, não podemos refatorar o atual cosntrutor dessa classe. Precisamo criar um novo. Mas, não precisamos atribuir valores a todos os atributos novamente, apenas os novos. Os antigos podem ser reatribuidos pela palavra reservada `super`.
<br>Exemplo:

```java
public construtorAntigo(String nome){
    this.nome = nome;
}

public construtorNovo(String nome, int idade){
    super(nome);
    this.idade = idade;
}
```
<hr>

