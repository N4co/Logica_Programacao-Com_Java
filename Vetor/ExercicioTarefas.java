package Vetor;

import java.util.Scanner;

public class ExercicioTarefas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String [] tarefas = new String [5];
		
		for(int i = 0; i < tarefas.length; i ++) {
			System.out.println("Tarefa do dia � : ");
			tarefas[i] = scanner.nextLine();
		}
		
		System.out.println("suas tarefas s�o : " );
		for(int i = 0; i < tarefas.length; i ++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		scanner.close();
	}

}
