package PrimeiraLista;

/**
 * Classe que acende lampada
 * 
 * @author Anna Farias
 */

public class Lampada {
	/**
	 * Atributo que liga a lãmpada
	 */
	
	void liga(){
		System.out.println(
				"A lampada ligou");
	}
	
	/**
	 * Atributo que desliga a lãmpada 
	 */
	void desliga(){
		System.out.println(
				"A lampada desligou");
	}

	/**
	 * aqui imprimi a ação no console
	 */
	
	public static void main(String[] args) {
		
		Lampada minhalampada = new Lampada();
		
		minhalampada.liga();
		minhalampada.desliga();
		
	}

}
