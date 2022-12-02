package Vetor;

import java.util.Scanner;

public class Simples {

	public static void main(String[] args) {

		Integer [] numero = new Integer [] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < numero.length; i ++) {
		System.out.println("Imprime [" + i + "]" + numero[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		Integer numeroEscolhido = scanner.nextInt();
		
		System.out.println("o numero escolhido é : " + numero[numeroEscolhido]);
	}

}
