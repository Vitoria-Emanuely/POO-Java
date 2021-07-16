package CContas;

public class CCorrente {
	private int numero;
	private float saldo;
	private String cliente;
	
	public CCorrente(int num, float sal, String cli) {
		this.numero = num;
		this.saldo = sal;
		this.cliente = cli;
	}
	
	public void creditar(float valor) {
		this.saldo += valor;
	}
	
	public void debitar(float valor) {
		if (valor <= this.saldo) 
			this.saldo -= valor;
		else
			System.out.println("Saldo Insuficiente!");
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float sal) {
		this.saldo = sal;
	}
}