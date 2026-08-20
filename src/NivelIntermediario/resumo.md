# Nível Intermediário
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
Por padrão, todos os atributos de uma interface são `final` e **devem** ser inicializados.
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

## Sobrecarga de métodos
Permite criar métodos com o mesmo nome, porém, com argumentos diferentes...
```java
package interfaces;

void listarUsuarios();
void listarUsuarios(String nome);
void listarUsuarios(String email);
void listarUsarios(int id);
```
<hr>

## @Override - Sobrescrita de Métodos
Os métodos **NÃO** precisão ser sobrescritos. Usamos a notação override pelos padrões da convenção Java.
Isso é um padrão e uma das boas práticas do desenvolvimento java. 
Além disso, a notação override ajuda a evitar sobrescrever errôneamente métodos, ao errar um caracter do método ou coisas do tipo.
<hr>

## Referência de memória e Valor em memória
Instâncias de objetos não armazenam o objeto em si, mas, armazenam uma referência ao local da memória onde se encontra o objeto.
Já, os atributos do objetos, quando acessados a partir do objeto, retornam um valor em memória.<br>
Exemplo:

```java
import NivelIntermediario.Personagem;

Personagem p = new Personagem();
System.out.print(p);    // retorna o espaço da memória em que o objeto está armazenado
System.out.print(p.nome); // retorna o valor de nome alocado na memória
```
<hr>

## toString
Método que deve ser sobrescrito em todas as classes para mostrar em forma de String os valores alocados na memória e não os valores de referência alocados!
<hr>

## final
Métodos e atributos marcados com `final` não podem **NUNCA** serem sobrescritos e alterados.
A marcação torna um método ou atributo numa constante, algo imutável.
Uma classe marcada com `final` não pode se tornar uma superclasse.
<hr>

## Enums
Arquivo para armazenar valores que nunca podem mudar. Um armazenamento de constantes.
Um enum pode ter atributos. Caso tenha atributos, ele precisa ter o construtor dentro de si e criar os enums.

## Refatoração

