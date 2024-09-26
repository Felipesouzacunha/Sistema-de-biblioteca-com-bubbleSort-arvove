package listaLigada;

public class Main {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<>();
		lista.adicionar("aa");
		lista.adicionar("bb");
		lista.adicionar("cc");
		lista.adicionar("dd");
		lista.adicionar("ee");
		System.out.println(lista.getTamanho());
		System.out.println("primeiro " + lista.getPrimeiro().getValor());
		System.out.println("ultimo " + lista.getUltimo().getValor());
		
		System.out.println(lista.getNo(1).getValor());
		System.out.println(lista);
		lista.remover("cc");
		System.out.println(lista);
	}
}
