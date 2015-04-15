package PrimeiraLista;

/**
 * Classe que resgistra empregado
 * 
 * @author Anna Farias
 */

public class RegistroAgencia {
	
	/**
	 * atributos da classe RegistroAgencia
	 */
	
	int Telefone;
	String Nome;
	String Endereco;
	String email;
	
	/**
	 * aqui é uma função que atribui algo para e os mostra.
	 */
	void Registro(){
		
		Nome = "Coca-Cola LTDA";
		
		Endereco = "Dom pedro , 000";
		
		Telefone = 70707070;
		
		email = "cocacola@hotmail.com";
		
		System.out.println(Nome);
		System.out.println(Endereco);
		System.out.println(Telefone);
		System.out.println(email);
		
	}
	
	/**
	 * aqui imprimi a ação no console
	 */
	
	public static void main(String[] args) {
		
		RegistroAgencia conta = new RegistroAgencia();
		
		conta.Registro();
		
	}

}
