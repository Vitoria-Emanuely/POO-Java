package Funcionario;

public class main {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Rodolfo", 1000);
		Programador p1 = new Programador("Chuuya", 1000);
		g1.aumentaSalario();
		p1.aumentaSalario();
		System.out.println(g1.getSalario());
		System.out.println(p1.getSalario());

	}

}
