package metodosJava;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		int mes;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um m�s: ");
		mes = entrada.nextInt();
		exibirMes(mes);
		entrada.close();
	}
	
	public static void exibirMes(int mes) {
		String texto = "";
		switch(mes) {
			case (1) :
				texto = "Janeiro";
				break;
			case (2) :
				texto = "Fevereiro";
			    break;
			case (3) :
				texto = "Mar�o";
				break;
			case (4) :
				texto = "Abril";
				break;
			case (5) :
				texto = "Maio";
			    break;
			case (6) :
				texto = "Junho";
				break;
			case (7) :
				texto = "Julho";
			    break;
			case (8) :
				texto = "Agosto";
				break;
			case (9) :
				texto = "Setembro";
				break;
			case (10) :
				texto = "Outubro";
			    break;
			case (11) :
				texto = "Novembro";
				break;
			case (12) :
				texto = "Dezembro";
				break;
			default:
				texto = "M�s inv�lido.";
				break;
		}
		System.out.println("O m�s correspondente �: " + texto);
	}

}
