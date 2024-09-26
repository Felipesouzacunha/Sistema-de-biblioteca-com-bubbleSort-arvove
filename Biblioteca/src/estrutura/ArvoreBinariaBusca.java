package estrutura;

import sistema.Livro;

public class ArvoreBinariaBusca {
    private Nodo raiz;

    private class Nodo {
        Livro livro;
        Nodo esquerda, direita;

        public Nodo(Livro livro) {
            this.livro = livro;
        }
    }

    public void adicionar(Livro livro) {
        raiz = adicionarRecursivamente(raiz, livro);
    }

    private Nodo adicionarRecursivamente(Nodo atual, Livro livro) {
        if (atual == null) {
            return new Nodo(livro);
        }

        if (livro.getAutor().compareToIgnoreCase(atual.livro.getAutor()) < 0) {
            atual.esquerda = adicionarRecursivamente(atual.esquerda, livro);
        } else if (livro.getAutor().compareToIgnoreCase(atual.livro.getAutor()) > 0) {
            atual.direita = adicionarRecursivamente(atual.direita, livro);
        }

        return atual;
    }

    public Livro buscarPorAutor(String autor) {
        return buscarPorAutorRecursivamente(raiz, autor);
    }

    private Livro buscarPorAutorRecursivamente(Nodo atual, String autor) {
        if (atual == null) {
            return null;
        }

        if (autor.equalsIgnoreCase(atual.livro.getAutor())) {
            return atual.livro;
        }

        return autor.compareToIgnoreCase(atual.livro.getAutor()) < 0
                ? buscarPorAutorRecursivamente(atual.esquerda, autor)
                : buscarPorAutorRecursivamente(atual.direita, autor);
    }

    public void listarLivrosPorAutor() {
        listarLivrosEmOrdem(raiz);
    }

    private void listarLivrosEmOrdem(Nodo nodo) {
        if (nodo != null) {
            listarLivrosEmOrdem(nodo.esquerda);
            System.out.println(nodo.livro);
            listarLivrosEmOrdem(nodo.direita);
        }
    }
}
