package exe3_Personagem;

public class Rei extends Personagem {
	public Rei() {
		arma = new ArcoeFlecha();
	}
	
	@Override
	public void lutar() {
		System.out.println("Eu luto quando meus homens morrem!");
	}
}
