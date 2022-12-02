package variaveis;

import java.util.Scanner;

public class IfEncadeado {

	static final Integer SEM_CATEGORIA = 15;
	static final Integer PESO_LEVE = 60;
	static final Integer PESO_MEDIO = 75;
	static final Integer PESO_PESADO = 90;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	 System.out.println("Qual seu peso : ");
	 Integer peso = scanner.nextInt();
	 
	 Boolean semCategoria = (peso >= SEM_CATEGORIA) && (peso < PESO_LEVE); 
	 Boolean pesoLeve = (peso >= PESO_LEVE) && (peso <  PESO_MEDIO); 
	 Boolean pesoMedio = ( peso >= PESO_MEDIO ) && (peso < PESO_PESADO); 
	 Boolean pesoPesado = peso >= PESO_PESADO; 
    if(semCategoria) {
    	System.out.println("O lutador(a) não se encaixa em nenhum dos perfis");
    }else if 
    	(pesoLeve) {
    		System.out.println("O lutador(a) se encaixa no perfil peso leve");
    	}else if
    	(pesoMedio) {
    		System.out.println("O lutador(a) se encaixa no perfil peso médio");
    }else if 
    	(pesoPesado) {
    	System.out.println("O lutador(a) se encaixa no perfil peso pesado");
    }
	 
	}

}
