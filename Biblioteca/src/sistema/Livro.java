package sistema;

public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	private String tema;
	
	
	public Livro(String titulo, String autor, int anoDePublicacao, String tema) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.tema = tema;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String toString() {
		return "Titulo: " + this.titulo + " Autor: " + this.autor + " Ano de publicação: " + anoDePublicacao + " Tema: " + tema;
	}
	
}
