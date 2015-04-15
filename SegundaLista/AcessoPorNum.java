package SegundaLista;

/**
 * Classe que identifica senha
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class AcessoPorNum {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * metodo que lê o numero.
		 */
		String senha;
		
		boolean running = true;
		
		while(running){
		
		/**
		 * metodo que solicita ao usuario a senha.
		 */
		System.out.println("Informe a senha: ");
		/**
		 * metodo que armazena o valor informado pelo usuario.
		 */
		senha = teclado.nextLine();
		
		/**
		 * metodo onde faz a verificacao da resposta do usuario.
		 */
		if (senha.equals("1234")){
			/**
			 * método onde faz a verificacaoo da senha que o usuario digitou.
			 */
			System.out.println("Acesso permitido!");
		}else{
			/**
			 * metodo que informa ao usuario que ele nao tem acesso ao sistema por ter digitado a senha errada.
			 */
			System.out.println("Voce nao tem acesso ao sistema!");
		}
		/**
		 * metodo onde o usuario dis se deseja continuar ou não
		 */
		System.out.println("\nDeseja continuar:(digite 1 para sim, ou 2 para nao continuar) ");
		/**
		 * metodo que recebe a informacao digitada do usuario.
		 */
		int num1 = Integer.parseInt(teclado.nextLine());
		/**
		 * metodo onde faz a verificaca da resposta do usuario.
		 */
		if (num1 == 2){
			
			running = false;
				}
			
		}

	}

}
