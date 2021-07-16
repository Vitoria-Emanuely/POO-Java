package TesteConhecimentos;

public class TesteConhecimentos {

	public static void main(String[] args) {
		Empregado pessoa1 = new Empregado(1, "Eragon", "eragon@gmail.com", 2000);
		pessoa1.aumentoSalarial(5);
		System.out.println("Seu salário é: " + pessoa1.getSalario());
		System.out.println("-------------------------------------------");
		
	
		Chefe pessoa2 = new Chefe(2, "Rodolfo", "rodo@gmail.com", 3000, 500);
		pessoa2.aumentoSalarial(10);
		System.out.println("Seu salário é: " + pessoa2.getSalario());
		System.out.println("-------------------------------------------");
		
		
		Estagiario pessoa3 = new Estagiario(3, "Violet", "vivi@gmail.com", 800, 100);
		pessoa3.aumentoSalarial(3);
		System.out.println("Seu salário é: " + pessoa3.getSalario());
		System.out.println("-------------------------------------------");
	}
}