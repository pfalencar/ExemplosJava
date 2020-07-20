package metodosJava;

import java.util.Scanner;

public class Vetor {
	
	public static void main (String[] args) {
		int[] vetorInteiros = new int[10];		
		lerVetor(vetorInteiros);
		imprimirVetor(vetorInteiros);
		System.out.println("Somar números: " + somarNumeros(vetorInteiros));
		System.out.println("Calcular Média: " + calcularMedia(vetorInteiros));
	}

	public static void lerVetor(int[] vetorInteiros ) {		
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 10; i ++) {	
			System.out.println("Digite um inteiro para o " + (i+1) + "º vetor: ");
			vetorInteiros[i] = entrada.nextInt();			
		}	
		imprimirVetor(vetorInteiros);
	}
	
	public static void imprimirVetor(int[] vetorInteiros ) {
		System.out.println("Vetor de inteiros: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(vetorInteiros[i] + " ");
		}
	}
	
	public static int somarNumeros(int[] vetorInteiros) {
		int soma = 0;
		for (int i = 0; i < vetorInteiros.length; i++) {
			soma = soma + vetorInteiros[i];
		}
		return soma;
	}
	
	public static double calcularMedia(int[] vetorInteiros) {
		double soma = somarNumeros(vetorInteiros);
		//System.out.println("soma: " + soma);
		
		int tamanhoVetor = vetorInteiros.length;
		//System.out.println("tamanhoVetor: " + tamanhoVetor);
		
		double media = soma / tamanhoVetor;
		//System.out.println("media: " + media);
		
		return media;
	}
	
	
}
