package PrimeiraLista;

/**
 * Classe que loca filmes
 * 
 * @author Anna Farias
 */

public class LocaFilmes {
	
	/**
	 * atributos da classe LocaFilmes
	 */

	int Codigo;
	int Duracao;
	int CodigoBarras;
	int Classificacao;
	String Atores;
	String Genero;
	String Sinopse;
	String Nome;
	String Distribuidora;
	String Lancamento;
	
	/**
	 * aqui é uma função que atribui algo para e os mostra.
	 */
	void Registro(){
		
		Codigo = 01;
	
		Nome = "Eragon";
		
		Classificacao = 14;
		
		Atores = "...";
		
		Genero = "medieval";
		
		Sinopse = "...";
		
		Duracao = 122;
		
		Distribuidora = "...";
		
		Lancamento = "2010";
		
		CodigoBarras = 123456;
		
		System.out.println(Codigo);
		System.out.println(Nome);
		System.out.println(Classificacao);
		System.out.println(Atores);
		System.out.println(Genero);
		System.out.println(Sinopse);
		System.out.println(Duracao);
		System.out.println(Distribuidora);
		System.out.println(Lancamento);
		System.out.println(CodigoBarras);
		
		}
	
	
	/**
	 * aqui imprimi a ação no console
	 */

	public static void main(String[] args) {
		
		LocaFilmes Filmes = new LocaFilmes();
		
		Filmes.Registro();

	}

}
