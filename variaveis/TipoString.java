package variaveis;

import java.util.Scanner;

public class TipoString {
	
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Insira seu primeiro nome :");
	String nome = scanner.nextLine();
	System.out.println("Insira seu sobrenome :");
	String sobreNome = scanner.nextLine();
	
	
	
	System.out.println("Olá nome completo é:  " + nome + " " + sobreNome);
	scanner.close();
	}
}
