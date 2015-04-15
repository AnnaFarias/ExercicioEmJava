package SegundaLista;

import java.util.Scanner;

/**
 * Classe que le um numero e retorna ao usuario se ele e par ou impar.  
 * 
 * @author Anna Farias
 */

public class NumeroParOuImpar {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		/**
		 * metodo que lê o numero.
		 */
		int num;
		
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
		 * método que fara a verificacao e retornara a resposta.
		 */
		if (num % 2 == 0) {
			/**
			 * método que imforma ao usuário que o numero e Par
			 */
			System.out.println("Numero par: "); 
		}else {
			/**
			 * método que informa ao usuário que o numero e Impar.
			 */
			System.out.println("Numero impar: "+ num);
			}
		/**
		 * método onde o usuário dis se deseja continuar ou não
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
