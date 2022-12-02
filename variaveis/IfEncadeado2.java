package variaveis;

import java.util.Scanner;

public class IfEncadeado2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
				System.out.println("Informe a meta da empresa para esse ano");
				Double meta = scanner.nextDouble();
				
				System.out.println("Informe o rendimento da empresa ");
				Double faturamento = scanner.nextDouble();
				
				System.out.println("Qual valor do salario do funcionario ");
				Double salario = scanner.nextDouble();
				
				Double oitentaPorCento = (meta * 80) / 100;
				
				Boolean bateuMeta = faturamento >= meta;
				
				Boolean naobBateuMeta = faturamento >= oitentaPorCento;
				
				if(bateuMeta) {
					System.out.println("Parabéns ! Funcionarios recebem um bônus esse ano de  : " + salario);
				}else if
				(naobBateuMeta) {
				 Double funcionarioRecebeOitenta = (salario * 80) / 100;
				 System.out.println("Infelizmente não batemos a meta mas funcionario recebe : " + funcionarioRecebeOitenta);
				}else
					System.out.println("Não temos projeção para esse ano");

		scanner.close();	
	}
	

}
