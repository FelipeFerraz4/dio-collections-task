# dio-collections-task
## Collection Framework API
  - Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes elementos precisão ser Objetos.
  - Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo especifico.
  - O núcleo principal das coleções é formado pelas interfaces da figura a abaixo, essas interfaces permitem manipular a coleção independente do nível de detalhe que elas representam.
  - Temos quatro grandes tipos de coleções: `List` (lista), `Set` (conjunto), `Queue` (fila) e `Map` (mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

![image](https://github.com/FelipeFerraz4/dio-collections-task/assets/115377471/e800a458-d807-45b0-a6cf-0017ddc0b396)
[Collection Framework in Java – Hierarchy, Need & Advantages](https://data-flair.training/blogs/collection-framework-in-java/)

## Comparable X Comparator
### Comparable
  - Comparable fornece uma única sequência de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
  - Comparable afeta a classe original, ou seja, a classe atual é modificada.
  - Comparable fornece o método `compareTo()` para ordenar elementos.
  - Comparable está presente no `pacote java.lang`.
  - Podemos ordenar os elementos da lista do tipo Comparable usando o método `Collections.sort(List)`.
### Comparator
  - O Comparator fornece o método `compare()` para ordenar elementos.
  - O Comparator fornece múltiplas sequências de ordenação. Em outras palavras, podemos ordenar a coleção com base em múltiplos elementos, como id, nome, preço, etc.
  - O Comparator não afeta a classe original, ou seja, a classe atual não é modificada.
  - Um Comparator está presente no pacote `java.util`.
  - Podemos ordenar os elementos da lista do tipo Comparator usando o método `Collections.sort(List, Comparator)`.

## Collections
  - A classe `Collections` é uma classe utilitária do Java para operações comuns em coleções.
  - Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções.
  - O método `sort()` é usado para ordenar uma lista em ordem ascendente.
  - O método `sort()` em conjunto com `Collections.reverseOrder()` permite ordenar em ordem descendente.

## Generics Type
  - Um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
  - O símbolo <> é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
  - Para atualizar uma classe Box para usar generics, você cria uma declaração de tipo genérico alterando o código public class Box para public class Box<T>.
  - Isso introduz a variável de tipo, T, que pode ser usada em qualquer lugar dentro da classe.
  - Uma variável de tipo pode ser qualquer tipo não primitivo que você especificar: qualquer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou até mesmo outra variável de tipo.
  - Os nomes de parâmetros de tipo mais comumente usados são:
    - E - Elemento (usado extensivamente pelo Java Collections Framework)
    - K - Chave
    - N - Número
    - T - Tipo
    - V - Valor
    - S, U, V, etc. - 2º, 3º, 4º tipos
  - Vantagens simples de usar generics nas interfaces Collection em Java:
    - Segurança do tipo de dados: O uso de generics garante que apenas objetos de um tipo específico possam ser adicionados à coleção, evitando erros de tipo e garantindo que você esteja lidando com os dados corretos.
    - Código mais legível: Ao usar generics, você pode especificar o tipo de dados esperado ou retornado pela coleção, o que torna o código mais fácil de entender e ler.
    - Detecta erros mais cedo: O compilador verifica se você está usando os tipos corretos durante a compilação, ajudando a identificar erros de tipo antes mesmo de executar o programa.
    - Reutilização de código: Com generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de coleções, evitando a necessidade de duplicar código para cada tipo específico.
    - Melhor desempenho: O uso de generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias e permite que o compilador otimize o código com base no tipo especificado.
