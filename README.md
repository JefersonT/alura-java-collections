# Alura - Java Collections
## AULA 03. Relacionamentos com coleções
E o mistério da `LinkedList`? E se tivéssemos usado `ArrayList` na declaração do atributo aulas da classe `Curso`? O resultado seria exatamente o mesmo!

Então qual é a diferença? Basicamente performance. A `ArrayList`, como diz o nome, internamente usa uma array para guardar os elementos. Ela consegue fazer umas operações de maneira muito eficiente, como invocar o método `get(indice)`. Se você precisa pegar o décimo quinto elemento, ele te devolve isso bem rápido. Onde uma `ArrayList` é lenta? Quando você for, por exemplo, inserir um novo elemento na primeira posição. Pois a implementação vai precisar mover todos os elementos que estão no começo da lista para a próxima posição. Se há muitos elementos, isso vai demorar... chamamos isso em computação de consumo de tempo linear.

Já a `LinkedList` possui uma grande vantagem aqui. Ela utiliza a estrutura de dados chamada lista ligada. Ela é muito rápida para adicionar e remover elementos na _cabeça_ da lista, isso é, na primeira posição. Mas ela é lenta se você precisar acessar um determinado elemento, pois a implementação precisará percorrer todos os elementos até chegar ao décimo quinto, por exemplo.

Confuso? Não tem problema. Sabe o que é interessante? Você não precisa tomar essa decisão desde já e oficializar para sempre. Como utilizamos a referência a `List`, comprometendo-nos pouco, podemos _sempre_ mudar a implementação, isso é, em quem damos `new`, caso percebamos que é melhor uma ou outra lista nesse caso em particular.

## AULA 04. Mais práticas com relacionamentos

Além do método `sort()` que vimos neste capítulo, a classe `Collections` também possui muitos outros métodos interessantes. Vamos dar uma olhada em alguns:

`Collections.reverse()`

O método `reverse()` serve para inverter a ordem de uma lista. As vezes precisamos imprimir uma lista de nomes do último para o primeiro, ou uma lista de ids do maior para o menor e é nestas horas que utilizamos o reverse para inverter a ordem natural da lista para nós.

`Collections.shuffle()`

O método `shuffle()` serve para embaralhar a ordem de uma lista. Por exemplo em um caso de um sistema de sorteio, em que precisamos de uma ordem aleatória na nossa lista, utilizamos o método shuffle para embaralhá-la.

`Collections.singletonList()`

O método `singletonList()` nos devolve uma lista imutável que contêm um único elemento especificado. Ele é útil quando precisamos passar um único elemento para uma API que só aceita uma Collections daquele elemento.

`Collections.nCopies()`

O método `nCopies()` nos retorna uma lista imutável com a quantidade escolhida de um determinado elemento. Se temos uma lista específica e precisamos obter uma outra lista imutável , contendo diversas cópias de um destes objetos, utilizamos o método nCopies(). O bom deste método é que mesmo que nós solicitemos uma lista com um número grande, como 10000 objetos, ele na verdade se referencia a apenas um, ocupando assim um pequeno espaço.

Este método também é utilizado para inicializar Listas recém criadas com Null, já que ele pode rapidamente criar diversos objetos, deste modo:

`List<Type> list = new ArrayList<Type>(Collections.nCopies(1000, (Type)null));`

Estes são apenas alguns exemplos dos diversos métodos da classe Collections.