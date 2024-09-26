package listaLigada;

public class ListaLigada<T> {
	private No<T> primeiro;
	private No<T> ultimo;
	private int tamanho;

	public ListaLigada() {
		this.tamanho = 0;
	}

	public void adicionar(T novovalor) {
		No<T> novoNo = new No<T>(novovalor);
		if (this.primeiro == null) {
			this.primeiro = novoNo;
			this.ultimo = novoNo;
		} else {
			this.ultimo.setProximo(novoNo);
			this.ultimo = novoNo;

		}
		tamanho++;
	}

	public void remover(String valorProcurado) {
		No<T> anterior = null;
		No<T> atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getValor().equals(valorProcurado)) {
				if (this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
				} else if (atual == this.primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
				} else if (atual == ultimo) {
					anterior.setProximo(null);
				} else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}

	public No<T> getNo(int posicao) {
		No<T> atual = this.primeiro;
		for (int i = 0; i <= posicao - 1; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}

	public No<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No<T> primeiro) {
		this.primeiro = primeiro;
	}

	public No<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(No<T> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		if(this.tamanho == 0) {
			return "[]";
		}
		
		
		StringBuilder builder = new StringBuilder();
		No<T> atual = this.primeiro;
		for(int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getValor()).append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getValor());
		return builder.toString();
	}

	
	
}
