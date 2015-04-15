package PrimeiraLista;

/**
 * Classe que cadastra professores 
 * 
 * @author Anna Farias
 */

public class CadastroProfessores {
	
	/**
	 * atributos da classe CadastroProfessores
	 */

	int NumMatricula;
	int Conta;
	int CargaHoraria;
	String Nome;
	String Salario;
	
	/**
	 * aqui é uma função que atribui algo para e os mostra.
	 */
	void Registro(){
		
		NumMatricula = 1;
		System.out.println(NumMatricula);
		
		Nome = "Anna Farias";
		System.out.println(Nome);
		
		Salario = "1100.000";
		System.out.println(Salario);
		
		CargaHoraria = 260;
		System.out.println(CargaHoraria);
		
		Conta = 123456;
		System.out.println(Conta);
		
	}
	
	/**
	 * aqui imprimi a ação no console
	 */
	
	public static void main(String[] args) {
		
		CadastroProfessores ProffFacul = new CadastroProfessores();

		ProffFacul.Registro();

	}

}
