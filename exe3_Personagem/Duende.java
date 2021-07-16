package exe3_Personagem;

public class Duende extends Personagem {
	public Duende() {
		arma = new Machado();
	}
	
	@Override
	public void lutar() {
		System.out.println("Eu luto, se valer a pena!");
	}
	
}
