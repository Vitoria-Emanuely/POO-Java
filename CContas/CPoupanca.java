package CContas;

public class CPoupanca extends CCorrente {
	private float saldominimo;
	
	public CPoupanca(int num, float sal, String cli, float salmin) {
		super(num, sal, cli);
		this.saldominimo = salmin; 
	}
	
	@Override
	public void debitar(float valor) {
		if (valor <= super.getSaldo()) {
			super.setSaldo(super.getSaldo() - valor);
			if (super.getSaldo() < this.saldominimo)
				this.saldominimo = super.getSaldo();
		}
		else
			System.out.println("Saldo Insuficiente!");
	}
	
	public void atualizarSaldo() {
		super.setSaldo((float)(super.getSaldo() + (this.saldominimo * 0.05)));
		this.saldominimo = super.getSaldo();
	}
	
	public float getSaldominimo() {
		return this.saldominimo;
	}
}