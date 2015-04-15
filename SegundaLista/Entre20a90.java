package SegundaLista;

/**
 * Classe que lê um valor e informa entre quanto ele é
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class Entre20a90 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * metodo que lê o numero.
		 */
		int num;
		
		boolean result = false;
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o numero desejado: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num = Integer.parseInt(teclado.nextLine());
		
		
		for (int i = 20; num >= i && num <= 90;i++){
			/**
			 * método que informa a resposta ao usuário.
			 */
			result  = true;
			
		}
		if (result  == true){
			/**
			 * método que informa a resposta ao usuário.
			 */
			System.out.println("O numero esta compreendido entra 20 e 90 - " + num);
			
		}else {
			System.out.println("O numero e menor que 20 - " +num);
		}
	}

}
