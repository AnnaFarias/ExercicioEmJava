package SegundaLista;

/**
 * Classe que lê dois valores e o ordena
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class EmOrdem {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * método que le o numero.
		 */
		int num;
		int num2;
		int aux;
		
		boolean running = true;
		
		while(running){
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o numero desejado: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o segundo numero desejado: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num2 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que fara a verificacao e retornara a resposta.
		 */
		
		if (num > num2){
			/**
			 * método que informa que o primeiro numero e maior entao e mantida a ordem
			 */
			System.out.println("O numero " + num + " e maior que o numero " + num2 + " ent?o a ordem e mantida.");
			
		}else if (num < num2){
			/**
			 * método que informa que o segundo numero e menor entao e alterada a ordem.
			 */
			aux = num;
			num = num2;
			
			System.out.println("O numero " + aux + " e menor que o numero " + num2 + " entao a ordem e alterada para: " + num + " , " + aux + ".");
		}
		/**
		 * método onde o usuário dis se deseja continuar ou nao
		 */
		System.out.println("\n Deseja continuar:(digite 1 para sim, ou 2 para nao continuar) ");
		/**
		 * método que recebe a informação digitada do usuário.
		 */
		int num1 = Integer.parseInt(teclado.nextLine());
		/**
		 * método onde faz a verificação da resposta do usuário.
		 */
		if (num1 == 2){
			
			running = false;
				}
		}

	}

}
