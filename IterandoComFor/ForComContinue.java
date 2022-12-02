package IterandoComFor;

public class ForComContinue {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("Vai continuar!");
				continue;
			}
			
			System.out.println("Iteração: " + i);
		}
	}

}
