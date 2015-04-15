package SegundaLista;

/**
 * Classe que lê informações sobre o aluno e diz se ele é aprovado ou reprovado e as quantidades de faltas
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * método que lê os numero e o nome.
		 */
		String nome;
		int nota, nota1, nota2;
		int falta;
		Double result, result1;
		
		/**
		 * método que solicita ao usuário que ele informe o nome do aluno.
		 */
		System.out.println("Informe o nome do aluno: ");
		/**
		 * método que armazena o nome informado pelo usuário.
		 */
		nome = teclado.nextLine();
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe a primeira nota do aluno: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		nota = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe a segunda nota do aluno: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		nota1 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que solicita ao usuário que ele informe o valor.
		 */
		System.out.println("Informe a terceira nota do aluno: ");
		/**
		 * método que armazena o valor informado pelo usuário.
		 */
		nota2 = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que solicita ao usuário que ele informe a quantidade de falta.
		 */
		System.out.println("Informe a quantidade de falta do aluno: ");
		/**
		 * método que armazena a quantidade de falta informado pelo usuário.
		 */
		falta = Integer.parseInt(teclado.nextLine());
		
		/**
		 * método que fara a verificacao e retornara a resposta.
		 */
		result = (falta * 1.25);
		result1 = (double) ((nota + nota1 + nota2) /3);
		
		if (result <= 25.0 && result1 >= 7.0){
			/**
			 * metodo que informa a resposta ao usuario.
			 */
			System.out.println(
					"O aluno "+nome+" esta aprovado com uma media de "+result1+" e uma porcentagem de falta de "+result+" %");
		}else {
			System.out.println("O aluno esta REPROVADO");
		}
	}

}
