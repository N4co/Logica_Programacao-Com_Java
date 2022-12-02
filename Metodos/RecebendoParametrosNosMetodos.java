package Metodos;

import java.util.Scanner;

public class RecebendoParametrosNosMetodos {

	public static void main(String[] args) {
		// esse programa vai receber par�metros no m�todos 
        // ficando melhor a necessidade de uma altera��o em partes do c�digo que reutilizem esse m�todo.
		// o m�todo que vai ser reutilizado � o m�todo que faz a itera��o no operador FOR e vai receber uma (String [] vetor) como par�metro 
		// 
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
	   iteracaoPorParametros(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que voc� deseja � o: ", scanner);
		
		Boolean posicaoValida = verificaPosicaoEscolhidaPorUsuario(posicaoCursoEscolhido, cursos);//posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		if (!posicaoValida) {
			encerraProgramaPorcausaDePosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto", "Dinheiro"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
	
		iteracaoPorParametros(formasPagamento);
	
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida �: ", scanner);
		
	    posicaoValida = verificaPosicaoEscolhidaPorUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if (!posicaoValida) {
			encerraProgramaPorcausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer posicaoNumeroDoUsuario = scanner.nextInt();
		return posicaoNumeroDoUsuario;
	
	}
	
	static Boolean verificaPosicaoEscolhidaPorUsuario(Integer posicao, String[] vetor) {
		Boolean numero = posicao >= 0 && posicao < vetor.length; 
		return numero;
	}
	
	static void iteracaoPorParametros(String [] vetor ) {
	for(int i = 0; i < vetor.length; i++) {
		imprimir("" + i + ". " + vetor[i]);
	}
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	
	static void encerraProgramaPorcausaDePosicaoInvalida() {
		System.err.println("Posi��o inv�lida!");
		System.exit(1);
	}

		
	}


