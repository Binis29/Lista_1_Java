/*
 * 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
, onde  D=(R+S)/2, R=(A+B)^2, S=(B+C)^2.
 */

package application;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int a,b,c, d, r, s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor A: ");
		a = sc.nextInt();
		
		System.out.println("Entre com o valor B: ");
		b = sc.nextInt();
		
		System.out.println("Entre com o valor C: ");
		c = sc.nextInt();
		
		r = (int) Math.pow(a+b, 2);
		s = (int) Math.pow(b+c, 2);
		d = (r+s)/2;
		
		System.out.printf("R: %d", r);
		System.out.println();
		
		System.out.printf("S: %d", s);
		System.out.println();
		
		System.out.printf("D: %d", d);
		System.out.println();
		sc.close();

	}

}
