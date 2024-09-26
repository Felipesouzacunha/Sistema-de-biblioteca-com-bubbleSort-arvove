Documentação do Código

1.Introdução Este projeto foi desenvolvido para gerenciar uma lista de objetos de maneira dinâmica, utilizando uma Lista Ligada
e implementando um algoritmo de ordenação, onde cada elemento da lista contém uma referência para o próximo. Além disso, 
foi implementado o Bubble Sort, um algoritmo de ordenação simples, para ordenar a lista de objetos do tipo Livro por títuloe autor.

2.Estrutura de Dados: A Lista Ligada (ou Linked List) foi escolhida como
estrutura de dados porque ela oferece grande flexibilidade ao lidar com 
inserções e remoções de elementos.

3.Vantagens da Lista Ligada: Inserções e remoções eficientes: Ao contrário de 
arrays, a lista ligada não exige realocações de memória ao inserir ou remover elementos. 
Flexibilidade: O tamanho da lista pode crescer e diminuir dinamicamente conforme a necessidade.

4.Classe AlgoritiroOrdenacao: A classe AlgoritiroOrdenacao implementa o algoritmo Bubble Sort para ordenar a lista ligada
de livros. O método bubbleSortPorTitulo(ListaLigada lista) percorre a lista repetidamente, comparando elementos adjacente
e trocando-os se estiverem na ordem incorreta. O Bubble Sort foi escolhido pela sua simplicidade de implementação e
facilidade de entendimento.
