package PrimeiraLista;

/**
 * Classe que resgistra os dados bancarios do cliente 
 * 
 * @author Anna Farias
 */

public class Contabancaria {
	
	/**
	 * atributos da classe Contabancaria
	 */
	
	int NumConta;
	String Nome;
	String Saldo;
	
	/**
	 * aqui é uma função que atribui algo para e os mostra.
	 */
	void Cosulta(){
		
		Nome = "Anna Farias";
		
		NumConta = 123456;
		
		Saldo = "1.000.000";
		
		System.out.println(Nome);
		System.out.println(NumConta);
		System.out.println(Saldo);
	}
	
	
	/**
	 * aqui imprimi a ação no console
	 */
	
	public static void main(String[] args) {
		
		Contabancaria saldo = new Contabancaria();
		
		saldo.Cosulta();
		
	}

}
