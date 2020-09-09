/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
 */
package application;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Entre com a sua idade em anos: ");
		anos = sc.nextInt();
		
		System.out.println("Entre com a sua idade em meses: ");
		meses = sc.nextInt();
		
		System.out.println("Entre com a sua idade em dias: ");
		dias = sc.nextInt();
		
		System.out.println();
		System.out.printf("Idade em dias: %d dias", (anos*365 + meses*30 + dias ) );
		
		
		

	}

}
