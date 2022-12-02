package variaveis;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		
		Integer numero = scanner.nextInt();
		
		Integer quadrado = numero * numero;
		
		System.out.println("o quadrado de " + numero + " é " + quadrado + " resultado ");
		
		scanner.close();
		
		
		
	}

}
