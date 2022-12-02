package variaveis;

import java.util.Scanner;

public class ExercicioConstantes2 {

	static final Integer ASSENTO_PERMITIDO_PARA_PESSOAS = 70;
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idade ");
		Integer idade = scanner.nextInt();
		
		
		Boolean podeSentar = idade >= ASSENTO_PERMITIDO_PARA_PESSOAS;
		
		if(podeSentar) {
			System.out.println("Permitido sentar");
		}else {
			System.out.println("Não é permitido");
			scanner.close();
		}
	}

}
