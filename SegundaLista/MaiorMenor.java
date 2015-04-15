package SegundaLista;

/**
 * Classe que lê dois valores e fala qual é o menor e qual é o maior
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * método que lê o numero.
		 */
		int num;
		int num2;
		
		boolean running = true;
		
		while(running){
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o numero desejado: ");
		/**
		 * método que armazena o valor informado pelo usuario.
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
		 * método que fara a verificação e retornara a resposta.
		 */
		
		if (num > num2){
			/**
			 * método que informa que o primeiro numero e maior
			 */
			System.out.println("O numero " + num + " e maior que o numero " + num2);
			
		}else if (num2 > num){
			/**
			 * método que informa que o segundo numero e maior
			 */
			System.out.println("O numero " + num2 + " e maior que o numero " + num);
			
		}else if (num == num2){
			/**
			 * método que informa que os numeros sao iguais.
			 */
			System.out.println("O numero " + num + " e o numero " + num2 + " s?o iguais.");
			
		}
		
		/**
		 * método onde o usuário dis se deseja continuar ou nao
		 */
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nao continuar) ");
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
