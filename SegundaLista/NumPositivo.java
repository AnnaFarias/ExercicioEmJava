package SegundaLista;

/**
 * Classe que lê três valores e informa se são iguais ou negativos
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class NumPositivo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * metodo que le o numero.
		 * 
		 * @param num - l챗 o primeiro numero
		 * @param num1 - l챗 o segundo numero
		 * @param num2  - l챗 o terceiro numero
		 * @param result  - armazena o maaior numero
		 * @param result1  - armazena o numero do meio 
		 * @param result2   - armazena o menor numero
		 */
		int num;
		int num1;
		int num2;
		int result = 0, result1 = 0, result2 = 0;
		
		boolean running = true;
		
		while(running){
		
		/**
		 * metodo que solicita ao usuario que ele informe o valor.
		 */
		System.out.println("Informe o numero desejado: ");
		/**
		 * metodo que armazena o valor informado pelo usuario.
		 */
		num = Integer.parseInt(teclado.nextLine());
		
		/**
		 * metodo que solicita ao usuario que ele informe o valor.
		 */
		System.out.println("Informe o segundo numero desejado: ");
		/**
		 * metodo que armazena o valor informado pelo usuario.
		 */
		num1 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * metodo que solicita ao usuario que ele informe o valor.
		 */
		System.out.println("Informe o terceiro numero desejado: ");
		/**
		 * metodo que armazena o valor informado pelo usuario.
		 */
		num2 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * metodo que fara a verificacao e retornara a resposta.
		 */
		if (num >= 0 && num1 >= 0 && num2 >= 0){
			if (num > num1 && num > num2 && num1 > num2){
				/**
				 * metodo que armazena o resultado.
				 */
				result = num;
				result1 = num1;
				result2 = num2;
			}else if (num > num1 && num > num2 && num2 > num1){
				/**
				 * metodo que armazena o resultado.
				 */
				result = num;
				result1 = num2;
				result2 = num1;
			}else if (num1 > num && num1 > num2 && num > num2){
				/**
				 * metodo que armazena o resultado.
				 */
				result = num1;
				result1 = num;
				result2 = num2;
			}else if (num1 > num && num1 > num2 && num2 > num){
				/**
				 * metodo que armazena o resultado.
				 */
				result = num1;
				result1 = num2;
				result2 = num;
			}else if (num2 > num && num2 > num1 && num > num1){
				/**
				 * metodo que armazena o resultado.
				 */
				result = num2;
				result1 = num;
				result2 = num1;
			}else if (num2 > num && num2 > num1 && num1 > num){
				/**
				 * metodo que armazena o resultado.
				 */
				result = num2;
				result1 = num1;
				result2 = num;
			}else if (num == num1 && num == num2){
				/**
				 * metodo que informa ao usuario que todos os numeros sao iguais.
				 */
				System.out.println("Todos os numeros sao iguais " + num + " " + num1 + " " + num2);
			}
		}else {
			/**
			 * metodo que informa ao usuario que os numeros sao negativos.
			 */
			System.out.println("Os numeros informados sao negativos "+ num + " " + num1 + " " + num2);
		}
		/**
		 * metodo que informa ao usuario os resultados.
		 */
		System.out.println(
				"O numero "+result + " e o maior numero e o "
						+result1 +" e o numero do meio e o numero "
							+result2 +" e o menor numero");
		
		/**
		 * Metodo onde o usuario dis se deseja continuar ou n?o
		 */
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nao continuar) ");
		/**
		 * metodo que recebe a informa챌찾o digitada do usuario.
		 */
		int num4 = Integer.parseInt(teclado.nextLine());
		/**
		 * metodo onde faz a verifica챌찾o da resposta do usuario.
		 */
		if (num4 == 2){
			
			running = false;
			}
		}

	}
}
