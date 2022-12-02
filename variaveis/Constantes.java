package variaveis;

import java.util.Scanner;

public class Constantes {

	static final Integer IDADE_MINIMA_PARA_TIRAR_HABILITACAO = 18; // aplicando o conceito de constantes.
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idade atual: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_HABILITACAO;
	
	if(podeTirarCarteira) {
		System.out.println("Pode tirar carteira");
	}else {
		System.out.println("nao pode tirar carteira");
	    scanner.close();
	}
}
}
