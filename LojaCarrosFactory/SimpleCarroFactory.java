package LojaCarrosFactory;

public class SimpleCarroFactory {
	public Carro createCarro(String model) {
		Carro carro = null;
		if (model.equals("cruze")) 
			carro = new Cruze();
		else if (model.equals("joy"))
			carro = new Joy();
		else if (model.equals("onix"))
			carro = new Onix();	
		else if (model.equals("tracker"))
			carro = new Tracker();
		return carro;
	}
}
