package PrimeiraLista;

/**
 * Classe que cadastra livros
 * 
 * @author Anna Farias
 */

public class CadastroLivro {
	
	/**
	 * atributos da classe LocaFilmes
	 */
	
	int Codigo;
	String Nome;
	String Autores;
	String Editora;
	String AnoPublicacao;
	int CodigoBarras;
	String Secao;
	String Prateleira;
	int Quantidade;
	
	/**
	 * aqui é uma função que atribui algo para e os mostra.
	 */
	void Cadastro(){
		
		Codigo = 01;
		
		Nome = "Harry Potter";

		Autores = "J.K. Rowling";

		Editora = "...";

		AnoPublicacao = "...";

		CodigoBarras = 01;
	
		Secao = "Bruxo";
		
		Prateleira = "C";
		
		Quantidade = 120;
		
		System.out.println(Codigo);
		System.out.println(Nome);
		System.out.println(Autores);
		System.out.println(Editora);
		System.out.println(AnoPublicacao);
		System.out.println(CodigoBarras);
		System.out.println(Secao);
		System.out.println(Prateleira);
		System.out.println(Quantidade);
		
	}
		
	/**
	 * aqui imprimi a ação no console
	 */

	public static void main(String[] args) {
		
		CadastroLivro Livro = new CadastroLivro();
		
		Livro.Cadastro();

	}

}
