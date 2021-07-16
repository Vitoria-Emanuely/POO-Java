package Atletismo;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	
	public Pessoa(String nom, String end) {
		this.nome = nom;
		this.endereco = end;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public abstract void imprimirDados();

}
