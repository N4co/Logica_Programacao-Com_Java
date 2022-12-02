package Vetor;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {

		String [] cardapio = new String [] {" Queijo ", " Muçarela ", " Bacon ", " Brócolis "};
		System.out.println("Informe o sabor : ");
		
		for(int i = 0; i < cardapio.length; i ++ ) {
			System.out.println("o item [" + i + "]" + cardapio[i]);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o sabor escolhido :");
		
		Integer saborEscolhido = scanner.nextInt();
		
          System.out.println("O sabor escolhido" + cardapio[saborEscolhido]);
		scanner.close();
	}

}
