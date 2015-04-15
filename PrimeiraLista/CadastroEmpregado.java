package PrimeiraLista;

/**
 * Classe que resgistra empregados
 * 
 * @author Anna Farias
 */

public class CadastroEmpregado {
	
	/**
	 * atributos da classe CadastroEmpregado
	 */
	
	String Nome;
	String Funcao;
	int Salario;
	String DataAdmissao;
	int NumMatricula;

	/**
	 * aqui é uma função que atribui algo para e os mostra.
	 */
	void Registro(){
		
		Nome = "Anna";
		
		Funcao = "Administrativo";
		
		Salario = 1300;
		
		DataAdmissao = "10/10/2014";
		
		NumMatricula = 10;
		
		System.out.println(Nome);
		System.out.println(Funcao);
		System.out.println(Salario);
		System.out.println(DataAdmissao);
		System.out.println(NumMatricula);
	}
	
	/**
	 * aqui imprimi a ação no console
	 */
	
	public static void main(String[] args) {
		
		CadastroEmpregado Empregado = new CadastroEmpregado();
		
		Empregado.Registro();
		
	}

}
