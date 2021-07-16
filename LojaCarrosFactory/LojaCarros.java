package LojaCarrosFactory;

public class LojaCarros {
	SimpleCarroFactory factory;
	
	public LojaCarros(SimpleCarroFactory factory) {
		this.factory = factory;
	}
	
	public void pedirCarro(String model) {
		Carro carro;
		carro = factory.createCarro(model);
		carro.adicionaAcessorio();
		carro.escolheCombustivel();
		carro.escolheCor();
		carro.enviaMontagem();
	}
}
