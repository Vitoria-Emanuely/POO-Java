package Lista1;

public class Bichinho_Virtual {
	private
		String nome;
		int fome;
		int saude;
		int idade;
		
	public Bichinho_Virtual(String nom, int fom, int sau, int idad) {
		this.nome = nom;
		this.fome = fom;
		this.saude = sau;
		this.idade = idad;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getFome() {
		return this.fome;
	}
	
	public int getSaude() {
		return this.saude;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String mudarNome(String n_nom) {
		return this.nome = n_nom;
	}
	
	public int mudarFome(int n_fom) {
		return this.fome = n_fom;
	}
	
	public int mudarSaude(int n_sau) {
		return this.saude = n_sau;
	}
	
	public int mudarIdade(int n_idad) {
		return this.idade = n_idad;
	}
	
	public void humor(int fome, int saude) {
		if (fome == 100 && saude == 100) {
			System.out.println("Seu Tamagushi est�: Super feliz :)");
		}else if (fome == 0 && saude != 0) {
			System.out.println("Seu Tamagushi est�: Faminto");
		}else if (saude == 0 && fome != 0) {
			System.out.println("Seu Tamagushi est�: Morrendo");
		}else if (fome == 0 && saude == 0) {
			System.out.println("Seu Tamagushi est�: Morto, voc� � malvadx :c");
		}else if (saude < 50 && saude > 10 && fome > 50) {
			System.out.println("Seu Tamagushi est�: Doente");
		}else if (fome < 50 && fome > 10 && saude > 50) {
			System.out.println("Seu Tamagushi est�: Irritado");
		}else if (fome < 10 && fome > 0 && saude > 30) {
			System.out.println("Seu Tamagushi est�: Irritad�ssimo");
		}else if (saude < 10 && saude > 0 && fome < 10) {
			System.out.println("Seu Tamagushi est�: Desejando a morte");
		}else if (fome < 70 && fome >= 50 && saude >= 50 && saude < 70) {
			System.out.println("Seu Tamagushi est�: Tranquilo");
		}else if (fome > 70 && saude > 70 && saude < 100) {
			System.out.println("Seu Tamagushi est�: Feliz");
		}else if (fome > 70 && fome < 100 && saude < 80) {
			System.out.println("Seu Tamagushi est�: Quase feliz");
		}else if (saude > 70 && saude < 100) {
			System.out.println("Seu Tamagushi est�: Bem");
		}else if (fome > 100 || fome < 0 || saude > 100 || saude < 0) {
			System.out.println("Algo de errado n�o est� certo!");
		}else if (fome < 50 || saude < 50) {
			System.out.println("Seu Tamagushi est�: Infeliz");
		}
	}
}