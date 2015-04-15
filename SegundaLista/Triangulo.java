package SegundaLista;

/**
 * Classe que lê três valores e informa qual tipo de triangulo ele forma
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

	public class Triangulo {
		
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * metodo que lê o numero.
		 */
		int num;
		int num1;
		int num2;
		
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
		num1 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe o terceiro numero desejado: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num2 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que fara a verificacao e retornara a resposta.
		 */
		
		if (num == num1 && num1 == num2 && num == num2){
			/**
			 * método que informa a resposta ao usuário.
			 */
			System.out.println("O formato do triangulo seria um Equilatero");
			
		}else if (num != num1 && num1 != num2 && num != num2) {
			/**
			 * metodo que informa a resposta ao usuário.
			 */
			System.out.println("O formato do triangulo seria um Escaleno");
			
		}else if ((num1 == num2) && (num != num2) /*|| (num != num1) && (num1 == num2)*/) {
			/**
			 * método que informa a resposta ao usuário.
			 */
			System.out.println("O formato do triangulo seria um Isosceles");
			
		}else if ((num1 != num2) && (num == num2) /*|| (num1 != num) && (num1 == num2)*/){
			/**
			 * método que informa a resposta ao usuário.
			 */
			System.out.println("O formato do triangulo seria um Isosceles");
			
		}else if ((num2 != num1) && (num1 == num) /*|| (num2 != num) && (num1 == num)*/){
			/**
			 * método que informa a resposta ao usuário.
			 */
			System.out.println("O formato do triangulo seria um Isosceles");
			
		}
		/**
		 * método onde o usuario dis se deseja continuar ou não
		 */
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nao continuar) ");
		/**
		 * método que recebe a informação digitada do usuário.
		 */
		int num4 = Integer.parseInt(teclado.nextLine());
		/**
		 * método onde faz a verifica豫o da resposta do usuário.
		 */
		if (num4 == 2){
			
			running = false;
			}
		}
	}
}
