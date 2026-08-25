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
Deve ser usado sempre que se deseja padronizar o código. **Mas** é necessário ter certeza de que os valores nunca mudarão.
Arquivo para armazenar valores que nunca podem mudar. Um armazenamento de constantes.
Um enum pode ter atributos. Caso tenha atributos, ele precisa ter o construtor dentro de si e criar os enums.

## Encapsulamento
Uso da palavra reservada `private` para proteger os atribudos das classes de atribuições de valores.
Obriga uma padronização das atribuições de valores aos atributos de classe. 
Para inserir valores, usamos o prefixo _set_ e para buscar os valores _get_.
### Quais problemas o encapsulamento resolve?
- Segurança
  - Garante que o código não tenha vazamentos nem alterações inesperadas
- Code review
  - Facilita a leitura e revisão do código
  - Os _getters_ e _setters_ tornam a leitura do código mais lógica
- Padronização
  - Força todas as pessoas a usarem os _gets e sets_

## Arrays e Listas
Um array é um objeto de memória, ou seja, eu referencio espaços de memória dentro do array. 
Além disso, os arrays são estáticos. Após se definir o tamanho dele, não é possível alterar.
Métodos para manusear uma Lista:
```java
// cria a lista
List<tipo-da-lista> nomeLista = new Lista<tipo-da-lista>();

// adiciona elementos
nomeLista.add("Nome do elemento");

// remove elementos
nomeLista.remove("nome do elemento");

// altera um elemento
// set(index elemento, conteúdo novo elemento)
nomeLista.set(0, "novo nome elemento");

// ver tamanho da lista
nomeLista.size();
```

## Generics 
Deixa o código mais escalável.
Facilita manutenção.
Torna o código mais reutilizável.

Ao usar Generics, devemos definir na criação da uma classe, que essa classe recebe **quaisquer tipos**.
`public class Classe<T>{}`
O uso da letra `T` é o caso mais comum para mostra que uma classe é genérica.
As classes genéricas, armazenam conteúdos de diversas classes. Sendo assim, em seus atributos, devemos inserir uma lista para armazenar esses conteúdos.
`private List<T> lista = new ArrayList<>()`

## Records
São um tipo de "classe", onde, todos os atributos são criados, porém, são do tipo `final`.
Ao criar um record, definimos os seus atributos e automaticamente já são definidos os: gets, sets, construtores e outros métodos Java.
Além disso, os records também pode ter métodos escritos em seu escopo.

## Stack (pilha)
Se assemelha a uma lista, porém, devemos olhar para esse lista de forma vertical. 
Onde o último elemento a entrar é o primeiro a sair. (Li-Fo)
As pilhas possuem 4 métodos:
- `push` - adiciona elementos na pilha
- `pop` - retira elementos da pilha
- `peek` - mostra o próximo elemento da pilha
- `size` - mostra o tamanho da pilha

