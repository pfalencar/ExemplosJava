package alunonotas;

import java.util.Scanner;

public class AppMediaAluno {	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		MediaAluno aluno = new MediaAluno();		
		aluno.notas = new float[3];//instância do vetor notas
		
		System.out.println("Digite o seu nome: ");		
		aluno.nome = entrada.nextLine();
		
		System.out.println("Digite as 3 notas do aluno: ");	
		for (int i = 0; i < 3; i++) {
			aluno.notas[i] = entrada.nextFloat();
		}
		
		System.out.println("==========================");	
		System.out.println("Média do aluno: " + aluno.calcularMedia());	
		System.out.println("==========================");
		System.out.println("Situação do aluno: " + aluno.verificarSituacao());
		System.out.println("Dados do aluno: " + aluno.imprimir());
		
		entrada.close();
	}

}
