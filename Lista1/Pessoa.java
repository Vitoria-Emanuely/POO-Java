package Lista1;

public class Pessoa {
	private
		String nome;
		int idade;
		double peso;
		double altura;
		
	public Pessoa(String nom, int idad, double pes, int alt) {
		this.nome = nom;
		this.idade = idad;
		this.peso = pes;
		this.altura = alt;
	}
	
	public int envelhecer(int anos) {
		for (int i = 0; i < anos; i++) {
			this.idade += 1;
			if (this.idade < 21){
				this.altura += 0.5;
			}
		}
		return this.idade;
	}
	
	public double engordar(double kg) {
		return this.peso += kg;
	}
	
	public double emagrecer(double kg) {
		return this.peso -= kg;
	}
	
	public double crescer(double cm) {
		return this.altura += cm;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getPeso() {
		return this.peso;
	}
}