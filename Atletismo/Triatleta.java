package Atletismo;

public class Triatleta extends Pessoa implements Ciclista, Nadador, Corredor {
	
	public Triatleta(String nom, String end) {
		super(nom, end);
	}
	
	public void imprimirDados() {
		System.out.println(super.getNome());
		System.out.println(super.getEndereco());
	}
	
	public void aquecer() {
		System.out.println("Estou aquecendo");
	}
	
	public void correr() {
		System.out.println("Iniciando a corrida");
	}
	
	public void nadar() {
		System.out.println("Iniciando a natação");
	}
	
	public void pedalar() {
		System.out.println("Iniciando a pedalada");
	}

}
