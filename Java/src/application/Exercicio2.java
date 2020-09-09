/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
 */

package application;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int dias;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de dias: ");
		dias = sc.nextInt();
		
		System.out.printf("Idade: %d ano(s) %d mes(es) e %d dia(s)", (dias/365), ((dias%365)/30), (dias%365)%30);
		

	}

}
