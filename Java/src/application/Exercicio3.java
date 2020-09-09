/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

package application;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int duracao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a duração do evento em segundos: ");
		duracao = sc.nextInt();
		System.out.println();
		System.out.printf("Duração do evento: %d hora(s) %d minuto(s) e %d segundo(s).", duracao/3600, (duracao%3600)/60, (duracao%360)%60);
		duracao = sc.nextInt();
		
		sc.close();

	}

}
