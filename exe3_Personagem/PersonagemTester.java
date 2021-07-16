package exe3_Personagem;

public class PersonagemTester {

	public static void main(String[] args) {
		Personagem duende = new Duende();
		duende.lutar();
		duende.atribuirArma();
		duende.setArma(new ArcoeFlecha());
		duende.atribuirArma();
		System.out.println("-------------------------------------------------");
		
		Personagem guerreiro = new Guerreiro();
		guerreiro.lutar();
		guerreiro.atribuirArma();
		guerreiro.setArma(new Machado());
		duende.atribuirArma();
		System.out.println("-------------------------------------------------");
		
		Personagem rainha = new Rainha();
		rainha.lutar();	
		rainha.atribuirArma();
		rainha.setArma(new Espada());
		rainha.atribuirArma();
		System.out.println("-------------------------------------------------");
		
		Personagem rei = new Rei();
		rei.lutar();
		rei.atribuirArma();
		rei.setArma(new Faca());
		rei.atribuirArma();

	}

}
