package metodosJava;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		System.out.println(isPar(num));		
		entrada.close();	
	}
	
	public static boolean isPar(int num) {
		if ((num % 2) == 0) {
			return true;
		}
		return false;
	}

}
