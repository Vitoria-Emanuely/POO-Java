package LojaCarrosFactory;

public class ComprarCarro {

	public static void main(String[] args) {
		SimpleCarroFactory scf = new SimpleCarroFactory();
		LojaCarros loja = new LojaCarros(scf);
		
		loja.pedirCarro("onix");
		loja.pedirCarro("cruze");
	}

}
