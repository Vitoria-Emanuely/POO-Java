package LojaCarrosFactory;

public abstract class Carro {
	public void adicionaAcessorio() {
		System.out.println("Adicionando acess�rio no carro");
	}
	
	public void escolheCombustivel() {
		System.out.println("Escolhendo combust�vel do carro");
	}
	
	public void escolheCor() {
		System.out.println("Escolhendo cor do carro");
	}
	
	public void enviaMontagem() {
		System.out.println("Finalizando o carro");
	}
}
