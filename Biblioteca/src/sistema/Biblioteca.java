package sistema;

import listaLigada.*;
import estrutura.ArvoreBinariaBusca;

public class Biblioteca {
	private ListaLigada<Livro> estante = new ListaLigada<>();
	AlgoritiroOrdenacao ordenador = new AlgoritiroOrdenacao();
	private ArvoreBinariaBusca arvorePorAutor = new ArvoreBinariaBusca();

	public void adicionarLivro(String titulo, String autor, int anoDePublicacao, String tema) {

		if (titulo != null && autor != null) {
			Livro novoLivro = new Livro(titulo, autor, anoDePublicacao, tema);
			estante.adicionar(novoLivro);
			arvorePorAutor.adicionar(novoLivro);
		} else {
			throw new IllegalArgumentException();
		}

	}

	public void removerLivro(String titulo) {
		No<Livro> atual = estante.getPrimeiro();
		No<Livro> anterior = null;
		while (atual != null) {
			if (atual.getValor().getTitulo().equalsIgnoreCase(titulo)) {
				if (anterior == null) {
					estante.setPrimeiro(atual.getProximo());
				} else {
					anterior.setProximo(atual.getProximo());
				}
				System.out.println("Livro removido: " + titulo);
				return;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
		System.out.println("Livro não encontrado: " + titulo);
	}

	public void listarLivros() {
		for (int i = 0; i < estante.getTamanho(); i++) {
			System.out.println(estante.getNo(i).getValor());
		}
	}

	public void ordenarPorTitulo() {
		ordenador.bubbleSortPorTitulo(estante);
	}

	public void ordenarPorAutor() {
		ordenador.bubbleSortPorAutor(estante);
	}

	public void listarLivrosPorAutor() {
		arvorePorAutor.listarLivrosPorAutor();
	}

	public Livro buscarLivroPorAutor(String autor) {
		return arvorePorAutor.buscarPorAutor(autor);
	}

	public void recomendarPorAutor(String autor) {
		Livro livroEncontrado = arvorePorAutor.buscarPorAutor(autor); // Busca o livro na árvore por autor
		if (livroEncontrado != null) {
			System.out.println("Livro encontrado: " + livroEncontrado);
			System.out.println("Livros do mesmo autor ou de autores semelhantes:");

			for (int i = 0; i < estante.getTamanho(); i++) {
				Livro livroAtual = estante.getNo(i).getValor();
				if (livroAtual.getAutor().equalsIgnoreCase(autor)) {
					System.out.println(livroAtual);
				}
			}
		} else {
			System.out.println("Nenhum livro encontrado para o autor: " + autor);
		}
	}

	public void recomendarPorTema(String tema) {
		System.out.println("Livros relacionados ao tema: " + tema);

		for (int i = 0; i < estante.getTamanho(); i++) {
			Livro livroAtual = estante.getNo(i).getValor();
			if (livroAtual.getTema().equalsIgnoreCase(tema)) {
				System.out.println(livroAtual);
			}
		}
	}
}
