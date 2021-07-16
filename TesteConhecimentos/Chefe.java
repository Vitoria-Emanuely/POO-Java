package TesteConhecimentos;

public class Chefe extends Empregado {
	private float beneficio;
	
	public Chefe(int cod, String nom, String mail, float sal, float ben) {
		super(cod, nom, mail, sal);
		this.beneficio = ben;
	}
	
	@Override
	public void aumentoSalarial(int percentual) {
		float percentualFloat = percentual;
		super.setSalario((float)(super.getSalario() * (percentualFloat / 100)) + super.getSalario() + this.beneficio);
	}
}