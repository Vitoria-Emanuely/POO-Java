package Funcionario;

public class Gerente extends Funcionario {
	
	public Gerente(String nom, double sal) {
		super(nom, sal);
	}
	
	public void aumentaSalario() {
		this.salario = this.salario + (this.salario * 0.2);
	}

}
