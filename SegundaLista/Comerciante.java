package SegundaLista;

/**
 * Classe que lê um valor e determina o lucro em cima do mesmo
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * método que lê o numero.
		 */
		int num;
		Double result;
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o valor do produto comprado: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num = Integer.parseInt(teclado.nextLine());
		/**
		 * método que fará a verificação e retornará a resposta.
		 */
		if (num <= 20){
			
			result = (num * 1.45);
			
			System.out.println("O valor aconselhado e de: R$ "+result+ " com uma margem de lucro de 45%");
		}else {
			
			result = (num * 1.30);
			
			System.out.println("O valor aconselhado e de: R$ "+result+ " com uma margem de lucro de 30%");
		}

	}

}
