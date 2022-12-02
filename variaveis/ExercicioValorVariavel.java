package variaveis;

import java.util.Scanner;

public class ExercicioValorVariavel {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("Digite o valor do produto");
		Double valorProduto = scanner.nextDouble();
	
		System.out.println("Informe a quantidade de Produtos");
		Integer quantidade = scanner.nextInt();
			
		Double subtotal = valorProduto * quantidade; //subtotal de valor produto * quantidade = resultado 
		
		Boolean maiorquedez = quantidade >= 10;
			
		Double percentualDesconto = 0.0;
		
		if(maiorquedez) {
			percentualDesconto = 10.0; 
		}
		
		Double desconto = subtotal * percentualDesconto /100;
		Double valorTotalComDesconto = subtotal - desconto;
		Double diferenca = subtotal - valorTotalComDesconto;
		
		System.out.println("Valor total = " + subtotal);
		System.out.println("O total com desconto é " + valorTotalComDesconto);
		System.out.println("A diferença é : " + diferenca);
		
	}
	

}
