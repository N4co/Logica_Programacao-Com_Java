package variaveis;

import java.util.Scanner;

public class SwitchDiasSemana {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Informe um dia na Semana");
		Integer dia = scanner.nextInt();
		
		String diaSemana = "";
		
		switch(dia) {
		case 2: diaSemana = "Segunda-Feira";
	    	break;
    	case 3: diaSemana = "Terça-Feira";
	        break;
    	case 4: diaSemana = "Quarta-Feira";
    	    break;
    	case 5: diaSemana = "Quinta-Feira";
      	    break;
    	case 6: diaSemana = "Sexta-Feira";
	        break;
    	case 7: diaSemana = "Sábado";
	       break;
    	  case 1: diaSemana = "Domingo";
     	    break;
     	    default:
     	    	System.out.println("O número informado não corresponde a nenhum dia da semana! ");
               System.exit(1);     	    

		}
		
	System.out.println("Hoje é " + diaSemana);
	scanner.close();
	}

}
