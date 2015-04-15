package SegundaLista;

/**
 * Classe que lê um valor e informa um aumento de salario
 * 
 * @author Anna Farias
 *
 */

import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/**
		 * método que lê o numero.
		 */
		int salario;
		Double result = 0.00;
		
		/**
		 * método que solicita ao usuário que ele informe o salario.
		 */
		System.out.println("Informe o valor do salario: ");
		/**
		 * método que armazena o salario informado pelo usuario.
		 */
		salario = Integer.parseInt(teclado.nextLine());
		/**
		 * método que fará a verificação e retornara a resposta.
		 */
		/*
		 * 600,00 30%
		 * 600,01 a 1.100,00 25%
		 * 1100,01 a 2.400,00 20%
		 * 2400,01 a 3.550,00 15%
		 * Acima de 3.550,00 10%
		 */
		if (salario <= 600){
			result = salario * 1.30;
			
			System.out.println(
					"O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 30%");
		}else if (salario >= 600 && salario <= 1100){
			result = salario * 1.25;
			
			System.out.println(
					"O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 25%");
		}else if (salario >= 1100 && salario <= 2400){
			result = salario * 1.20;
			
			System.out.println(
					"O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 20%");
		}else if (salario >= 2400 && salario <= 3550){
			result = salario * 1.25;
			
			System.out.println(
					"O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 15%");
		}else if (salario >= 3551){
			result = salario * 1.10;
			
			System.out.println(
					"O valor aconselhado do aumento de salario e de: R$ "+result+ " com uma margem de aumento de 10%");
		}else {
			System.out.println("O salario informado n?o tem aumento disponivel no momento.");
		}
		
	}

}
