package Metodos;

import java.util.Scanner;

public class RecebendoParametrosNosMetodos {

	public static void main(String[] args) {
		// esse programa vai receber parâmetros no métodos 
        // ficando melhor a necessidade de uma alteração em partes do código que reutilizem esse método.
		// o método que vai ser reutilizado é o método que faz a iteração no operador FOR e vai receber uma (String [] vetor) como parâmetro 
		// 
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
	   iteracaoPorParametros(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);
		
		Boolean posicaoValida = verificaPosicaoEscolhidaPorUsuario(posicaoCursoEscolhido, cursos);//posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		if (!posicaoValida) {
			encerraProgramaPorcausaDePosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto", "Dinheiro"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
	
		iteracaoPorParametros(formasPagamento);
	
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);
		
	    posicaoValida = verificaPosicaoEscolhidaPorUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if (!posicaoValida) {
			encerraProgramaPorcausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
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
		System.err.println("Posição inválida!");
		System.exit(1);
	}

		
	}


