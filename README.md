Documentação do código.

1. Apresentação

Este projeto foi elaborado para controlar uma coleção de itens de forma flexível, empregando uma estrutura de Listas Encadeadas e integrando um método de classificação, com cada item da lista contém um link para o próximo. Além disso, o algoritmo Bubble Sort foi adotado para ordenar a lista de livros por título e autor. Foi incluído um novo algoritmo de recomendação que emprega árvores binárias para recomendar livros relacionados a autores e assuntos.

2. Organização de informações em um formato particular.

A escolha da Lista Ligada (ou Linked List) como estrutura de dados se deu pela sua capacidade de lidar com inserções e remoções de elementos de forma flexível. Foram elaboradas árvores binárias para controlar as recomendações, facilitando a busca por autor e assunto de forma eficiente.

 3. Benefícios da Lista Encadeada

*Eficiência em inserções e remoções*: Diferentemente dos arrays, a lista encadeada não requer mudanças na alocação de memória ao adicionar ou remover elementos.

- A lista pode aumentar e diminuir a forma dinâmica de acordo com a necessidade, graças à liberdade.

4. Classe AlgoritmoOrdenacao
A classe AlgoritmoOrdenacao utiliza o Bubble Sort para ordenar a lista encadeada de livros. A função bubbleSortPorTitulo(ListaLigada lista) itera sobre a lista várias vezes, comparando elementos executados e realizando trocas caso estejam fora de ordem. O motivo da escolha do Bubble Sort foi sua facilidade de implementação e entendimento.

5. Recomendação de Algoritmo
O algoritmo de recomendação utiliza árvores binárias para sugerir livros com base em dois critérios: autor e tema. Cada livro é representado por um nó na árvore, tornando a busca e a filtragem de recomendações ágeis e eficazes. Este framework permite que o sistema forneça sugestões personalizadas, melhorando a experiência do usuário.
