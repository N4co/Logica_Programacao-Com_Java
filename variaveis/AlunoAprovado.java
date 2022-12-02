package variaveis;

import java.util.Scanner;

public class AlunoAprovado {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);	
		
	boolean alunoAprovado = true;	
	boolean alunoReprovado = false;
	
	System.out.println("informe a nota do aluno ");
		Integer notaAluno = scanner.nextInt(); 
		
		
		Integer media = 70;
		
		if(notaAluno >= media ) {
			System.out.println("AlunoAprovado : " + alunoAprovado);
		}else {
			System.out.println("Aluno Reprovado nota ficou abaixo da média : " + alunoReprovado);
		}
	}

}
