package Funcionario;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nom, double sal) {
		this.nome = nom;
		this.salario = sal;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nom) {
		this.nome = nom;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double sal) {
		this.salario = sal;
	}
	
	public abstract void aumentaSalario();

}
