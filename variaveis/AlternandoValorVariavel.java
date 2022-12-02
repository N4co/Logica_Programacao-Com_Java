package variaveis;

import java.util.Scanner;

public class AlternandoValorVariavel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	System.out.println("Informe o valor do Produto");
	Double valorProduto = scanner.nextDouble();
	
	System.out.println("Informe a condição de Pagamento [ [1] = á vista / [2] = a prazo]");
	Integer formaPagamento = scanner.nextInt();
	
	Boolean pagamentoVista = formaPagamento.equals(1);
	
	Double juros = 0.0;
	
	if(!pagamentoVista) {
		juros = 10.0;
	}
	
	Double acrescimo = valorProduto * juros / 100;
	
	Double valorTotal = valorProduto + acrescimo;
	
	System.out.println("O valor total é : " + valorTotal);
		
		scanner.close();
}
}
