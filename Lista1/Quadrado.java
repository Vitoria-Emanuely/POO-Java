package Lista1;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lad) {
		this.lado = lad;
	}
	
	public double mudaLado(double novo_lado) {
		return this.lado = novo_lado;
	}
	
	public double mostraLado() {
		return this.lado;
	}
	
	public double calcularArea() {
		return this.lado * this.lado;
	}
}