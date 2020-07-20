package encapsulamento;

import java.util.Scanner;

public class AppTrapezio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);	
		//objeto da classe Trapezio
		Trapezio trapezio1 = new Trapezio(); 
		
		System.out.println("========== �REA DO TRAP�ZIO =============");
		
		System.out.println("Digite a base maior: ");
		trapezio1.setBaseMaior(entrada.nextFloat());
		
		System.out.println("Digite a base menor: ");
		trapezio1.setBaseMenor(entrada.nextFloat());
		
		System.out.println("Digite a altura: ");
		trapezio1.setAltura(entrada.nextFloat());
		
		System.out.println( "A �rea do trap�zio �: " + trapezio1.calcularArea() );
		
		System.out.println("=================== Dados do Trap�zio ==================");
		System.out.println(trapezio1.imprimir());
		
		entrada.close();
	}

}
