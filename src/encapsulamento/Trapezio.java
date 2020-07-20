package encapsulamento;

public class Trapezio {
	//atributos = variáveis de instância
	private float baseMaior;
	private float baseMenor;
	private float altura;	
	
	//construtores
	public Trapezio() {} //default
	//sobrecarga do construtor
	public Trapezio (float baseMaior, float baseMenor, float altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	
	//métodos de acesso
	public float getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(float baseMaior) {
		this.baseMaior = baseMaior;
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	//metodos da classe
	public float calcularArea () {
		return ( (baseMaior + baseMenor) * altura ) / 2;
	}
	
	public String imprimir () {
		return "Base Maior: " + baseMaior + "\nBaseMenor: " + baseMenor + "\nAltura: " + altura;
	}

}
