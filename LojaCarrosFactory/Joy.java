package LojaCarrosFactory;

public class Joy extends Carro {
	//Fiz esse override s? pra printar o modelo do carro mesmo
	@Override
	public void adicionaAcessorio() {
		super.adicionaAcessorio();
		System.out.println("Adicionando chaveiro brinde no Joy");
	}
}
