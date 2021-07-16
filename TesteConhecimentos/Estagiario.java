package TesteConhecimentos;

public class Estagiario extends Empregado {
	private int descontos;
	
	public Estagiario(int cod, String nom, String mail, float sal, int qtd) {
		super(cod, nom, mail, sal);
		this.descontos = qtd;
	}
	
	@Override
	public void aumentoSalarial(int percentual) {
		float percentualFloat = percentual;
		super.setSalario((float)(super.getSalario() * (percentualFloat / 100)) + super.getSalario() - this.descontos);
	}
}