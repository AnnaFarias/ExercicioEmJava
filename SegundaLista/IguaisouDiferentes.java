package SegundaLista;

import java.util.Scanner;

/**
 * Classe que lê dois valores e retorna ao usuario se sao iguais ou diferentes.
 * 
 * @author Anna Farias
 *
 */

public class IguaisouDiferentes {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		/**
		 * metodo que lê o primeiro numero
		 */
		int num1 = 0;
		/**
		 * metodo que lê o segundo numero.
		 */
		int num2 = 0;
				
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o primeiro numero: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num1 = Integer.parseInt(teclado.nextLine());
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o segundo numero: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num2 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que faz a comparação se os numeros sao iguais ou diferentes.
		 */
		if (num1 == num2){
			/**
			 * método que informa ao usuário o resultado
			 */
			System.out.println("Os numeros "+num1 + " e " + num2 +" sao iguais ");
		}else{
			/**
			 * método que informa ao usuário o resultado
			 */
			System.out.println("Os numeros "+num1 + " e " + num2 +" sao diferentes ");
			
		}
	}

}
