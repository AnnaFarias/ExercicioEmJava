package PrimeiraLista;

/**
 * Classe que cria passagem aerea
 * 
 * @author Anna Farias
 */

public class PassagemAerea {
	
	/**
	 * atributos da classe PassagemAerea
	 */

	int codigo;
	int Acento;
	int RG;
	int CPF;
	int Telefone;
	String DataNascimento;
	String Nome;
	String PaisOrigem;
	String EstadoOrigem;
	String CidadeOrigem;
	String PaisDestino;
	String EstadoDestino;
	String CidadeDestino;
	String NovoVoo;
	String NecessidadesEspeciais;
	
	/**
	 * aqui é uma função que atribui algo para e os mostra.
	 */
	
	void Registro(){
		
		codigo = 1;
		
		Nome = "Anna";
		
		RG = 123456;
		
		CPF = 12345678;
		
		Telefone = 12345678;
		
		DataNascimento = "27/08/1996";
		
		PaisOrigem = "Brasil";
		
		EstadoOrigem = "São Paulo";
		
		CidadeOrigem = "Ribeirão Preto";
		
		PaisDestino = "USA";
		
		EstadoDestino = "California";
		
		CidadeDestino = "sei la";
		
		NovoVoo = "Sim";
		
		Acento = 05;
		
		NecessidadesEspeciais = "Não";
		
		System.out.println(codigo);
		System.out.println(Nome);
		System.out.println(RG);
		System.out.println(CPF);
		System.out.println(Telefone);
		System.out.println(DataNascimento);
		System.out.println(PaisOrigem);
		System.out.println(EstadoOrigem);
		System.out.println(CidadeOrigem);
		System.out.println(PaisDestino);
		System.out.println(EstadoDestino);
		System.out.println(CidadeDestino);
		System.out.println(NovoVoo);
		System.out.println(Acento);
		System.out.println(NecessidadesEspeciais);
		
		
	}

	/**
	 * aqui imprimi a ação no console
	 */

	public static void main(String[] args) {
		
		PassagemAerea Passagem = new PassagemAerea();
		
		Passagem.Registro();
	
	}

}
