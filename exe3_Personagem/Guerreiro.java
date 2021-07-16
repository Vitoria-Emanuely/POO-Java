package exe3_Personagem;

public class Guerreiro extends Personagem {
	public Guerreiro() {
		arma = new Espada();
	}
	
	@Override
	public void lutar() {
		System.out.println("Eu luto até a morte, tsc!");
	}
}
