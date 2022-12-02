package Metodos;

public class MetodoRecebeRegraTres {

	public static void main(String[] args) {
		// 50 --- 100%
		// x --- 20%
		//
		//50 * 20 = x * 100 
		
		// x = (50 * 20) / 100

		Double[] premissaInicial = new Double[] { 8025.0, 100.0} ;
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDetres(premissaInicial, proporcao);
		
		System.out.println("Resultado : " + resultadoFinal);
		
	}
	static Double regraDetres(Double[] premissa, Double proporcao ) {
		Double resultado = (premissa [0] * proporcao / premissa[1]);
		return resultado;
	}

}
