package LojaCarrosFactory;

public class Tracker extends Carro {
	//Fiz esse override só pra printar o modelo do carro mesmo
	@Override
	public void adicionaAcessorio() {
		super.adicionaAcessorio();
		System.out.println("Adicionando chaveiro brinde no Tracker");
	}
}
