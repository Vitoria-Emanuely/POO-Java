package Lista1;

public class Bola {
	private
		String cor;
		double circunferencia;
		String material;
		
	public Bola(String c, double circ, String mat) {
		this.cor = c;
		this.circunferencia = circ;
		this.material = mat;
	}
	
	public String trocaCor(String novo_c) {
		return this.cor = novo_c;
	}
	
	public String mostraCor() {
		return this.cor;
	}
	
	public double getCirc() {
		return this.circunferencia;
	}
	
	public String getMaterial() {
		return this.material;
	}
}