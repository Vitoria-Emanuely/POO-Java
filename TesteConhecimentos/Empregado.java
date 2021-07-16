package TesteConhecimentos;

public class Empregado {
	private int codigo;
	private String nome;
	private String email;
	private float salario;
	
	public Empregado(int cod, String nom, String mail, float sal) {
		this.codigo = cod;
		this.nome = nom;
		this.email = mail;
		this.salario = sal;
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public void setSalario(float sal) {
		this.salario = sal;
	}
	
	public void aumentoSalarial(int percentual) {
		float percentualFloat = percentual;
		this.salario = this.salario * (percentualFloat / 100) + this.salario;
	}
}