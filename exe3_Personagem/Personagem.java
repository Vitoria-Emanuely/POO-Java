package exe3_Personagem;

public abstract class Personagem {
	protected Arma arma;
	
	public abstract void lutar();
	
	public void atribuirArma() {
		arma.usarArma();
	}
	
	public void setArma(Arma ar) {
		arma = ar;
	}
}