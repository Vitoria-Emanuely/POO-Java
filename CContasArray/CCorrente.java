package CContasArray;

public class CCorrente {
	private int numero;
	private float saldo;
	
	public CCorrente(int num, float sal) {
		this.numero = num;
		this.saldo = sal;

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

	
	@Override
	public String toString() {
		return ("Conta: " + this.numero + " Saldo: " + this.saldo);
	}
	
}