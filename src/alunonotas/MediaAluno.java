package alunonotas;

public class MediaAluno {

	String nome;
	float[] notas;
	
	public float calcularMedia() {
		float media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media / notas.length;
		return media;
	}
	
	public String verificarSituacao() {
		String saida = "";
		float media = calcularMedia();
		if (media >= 5) {
			saida = "==> Aluno APROVADO. Média: " + media;
		} else {
			saida = "==> Aluno REPROVADO. Média: " + media;
		}
		return saida;
	}
	
	public String mostrarNotas() {
		String saida = "";
		for (int i = 0; i < notas.length; i++) {
			saida += "Nota " + (i+1) + ": " + notas[i] + "\n";
		}
		return saida;
	}
	
	public String imprimir () {
		return "\nNome: " + nome + "\nNotas\n" + mostrarNotas();
	}

	
	
	

	
	
	
	
}
