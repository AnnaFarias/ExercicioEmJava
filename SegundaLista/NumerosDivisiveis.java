package SegundaLista;


/**
 * Classe que faz a divisão de numeros  
 * 
 * @author Anna Farias
 */

import java.util.Scanner;

public class NumerosDivisiveis {
	
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		/**
		 * metodo que lê o numero.
		 */
		int num;
		int num2;
		int rusult;
		
		boolean running = true;
		
		while(running){
		
		/**
		 * metodo que solicita ao usuario que ele informe o valor.
		 */
		System.out.println("Informe um numero: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe um segundo numero: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		num2 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que fara a verificacao e retornara a resposta.
		 */
		if (num % num2 == 0) {
			
			rusult = (num / num2);
			
		/**
		 * método que imforma ao usuário que os numeros sao divisíveis.
		 */
		System.out.println("Os sao divididos sao: "+ num+ " / " +num2+ " = " + rusult); 
	}else {
		rusult = (num / num2);
		/**
		 * método que imforma ao usuário que os numeros nao sao divisíveis.
		 */
		System.out.println("Os sao divididos sao: "+ num+ " / " +num2+ " = " + rusult);
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
