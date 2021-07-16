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
			System.out.println("Seu Tamagushi está: Super feliz :)");
		}else if (fome == 0 && saude != 0) {
			System.out.println("Seu Tamagushi está: Faminto");
		}else if (saude == 0 && fome != 0) {
			System.out.println("Seu Tamagushi está: Morrendo");
		}else if (fome == 0 && saude == 0) {
			System.out.println("Seu Tamagushi está: Morto, você é malvadx :c");
		}else if (saude < 50 && saude > 10 && fome > 50) {
			System.out.println("Seu Tamagushi está: Doente");
		}else if (fome < 50 && fome > 10 && saude > 50) {
			System.out.println("Seu Tamagushi está: Irritado");
		}else if (fome < 10 && fome > 0 && saude > 30) {
			System.out.println("Seu Tamagushi está: Irritadíssimo");
		}else if (saude < 10 && saude > 0 && fome < 10) {
			System.out.println("Seu Tamagushi está: Desejando a morte");
		}else if (fome < 70 && fome >= 50 && saude >= 50 && saude < 70) {
			System.out.println("Seu Tamagushi está: Tranquilo");
		}else if (fome > 70 && saude > 70 && saude < 100) {
			System.out.println("Seu Tamagushi está: Feliz");
		}else if (fome > 70 && fome < 100 && saude < 80) {
			System.out.println("Seu Tamagushi está: Quase feliz");
		}else if (saude > 70 && saude < 100) {
			System.out.println("Seu Tamagushi está: Bem");
		}else if (fome > 100 || fome < 0 || saude > 100 || saude < 0) {
			System.out.println("Algo de errado não está certo!");
		}else if (fome < 50 || saude < 50) {
			System.out.println("Seu Tamagushi está: Infeliz");
		}
	}
}