package Funcionario;

public class Programador extends Funcionario {

	public Programador(String nom, double sal) {
		super(nom, sal);
	}
	
	public void aumentaSalario() {
		this.salario = this.salario + (this.salario * 0.3);
	}
}
