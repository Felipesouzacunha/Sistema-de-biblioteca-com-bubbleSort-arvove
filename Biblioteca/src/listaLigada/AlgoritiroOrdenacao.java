package listaLigada;

import sistema.*;

public class AlgoritiroOrdenacao {
	public void bubbleSortPorTitulo(ListaLigada<Livro> lista) {
		int tamanho = lista.getTamanho();
		if (tamanho <= 1)
			return;

		boolean houveTroca;
		for (int i = 0; i < tamanho - 1; i++) {
			houveTroca = false;
			No<Livro> atual = lista.getNo(0);

			for (int j = 0; j < tamanho - i - 1; j++) {
				No<Livro> proximo = atual.getProximo();
				if (atual.getValor().getTitulo().compareTo(proximo.getValor().getTitulo()) > 0) {
					trocarValores(atual, proximo);
					houveTroca = true;
				}
				atual = proximo;
			}
			if (!houveTroca)
				break;
		}

	}
	
	public void bubbleSortPorAutor(ListaLigada<Livro> lista) {
        int tamanho = lista.getTamanho();
        if (tamanho <= 1) return;

        boolean houveTroca;
        for (int i = 0; i < tamanho - 1; i++) {
            houveTroca = false;
            No<Livro> atual = lista.getNo(0);
            for (int j = 0; j < tamanho - i - 1; j++) {
                No<Livro> proximo = atual.getProximo();
                if (atual.getValor().getAutor().compareTo(proximo.getValor().getAutor()) > 0) {
                    trocarValores(atual, proximo);
                    houveTroca = true;
                }
                atual = proximo;
            }
            if (!houveTroca) break;
        }
    }

	private void trocarValores(No<Livro> a, No<Livro> b) {
		Livro temp = a.getValor();
		a.setValor(b.getValor());
		b.setValor(temp);
	}
}
