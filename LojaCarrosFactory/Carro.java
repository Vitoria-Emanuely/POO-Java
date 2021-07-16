package LojaCarrosFactory;

public abstract class Carro {
	public void adicionaAcessorio() {
		System.out.println("Adicionando acessório no carro");
	}
	
	public void escolheCombustivel() {
		System.out.println("Escolhendo combustível do carro");
	}
	
	public void escolheCor() {
		System.out.println("Escolhendo cor do carro");
	}
	
	public void enviaMontagem() {
		System.out.println("Finalizando o carro");
	}
}
