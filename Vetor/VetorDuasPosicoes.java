package Vetor;

public class VetorDuasPosicoes {

	public static void main(String[] args) {

		Double [] faturamentoJaneiro = new Double [] {1800.0, 2500.0, 2800.0};
		Double [] faturamentoFevereiro = new Double [] {1600.0, 2400.0, 2700.0};
		Double [] faturamentoMarco = new Double [] {1700.0, 2300.0, 2600.0};
		Double [] faturamentoAbril = new Double [] {1900.0, 2500.0, 2900.0};
		
		Double [][] faturamentoAnual = new Double [][] { faturamentoJaneiro, faturamentoFevereiro, faturamentoMarco, faturamentoAbril }; 
	 
		for(int i = 0; i < faturamentoAnual.length; i++ ) {
			System.out.println(" Fatumento do Mês " + (i + 1));
		
			Double [] mes = faturamentoAnual[i];
		 
			for(int y = 0; y < faturamentoAnual.length; y++) {
				Double dia = mes [y];
				System.out.println(" Faturamento dia " + (y + 1) + " " + dia);
			}
			
	
		}
			
		}
	
	}


