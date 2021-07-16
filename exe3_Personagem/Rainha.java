package exe3_Personagem;

public class Rainha extends Personagem {
	public Rainha() {
		arma = new Faca();
	}
	
	@Override
	public void lutar() {
		System.out.println("Não me deixam lutar, mas sou boa com facas!");
	}
}
