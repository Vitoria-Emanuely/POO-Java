package Lista1;

public class main {

	public static void main(String[] args) {
		System.out.println("Exercício 1: Bola");
		Bola Rodolfo = new Bola("verde", 3.2, "seda");
		System.out.println("A circunferência da sua bola é " + Rodolfo.getCirc() + " cm");
		System.out.println("O material da sua bola é " + Rodolfo.getMaterial());
		System.out.println("A cor da sua bola é " + Rodolfo.mostraCor());
		System.out.println("A nova cor da sua bola é " + Rodolfo.trocaCor("rosa"));
		System.out.println("-----------------------------------------------");

		System.out.println("Exercício 2: Quadrado");
		Quadrado Paulinho = new Quadrado(3.5);
		System.out.println("O valor do lado é " + Paulinho.mostraLado() + " cm");
		System.out.println("O novo valor do lado é " + Paulinho.mudaLado(5.0) + " cm");
		System.out.println("A área do seu quadrado é " + Paulinho.calcularArea() + " cm");
		System.out.println("-----------------------------------------------");

		System.out.println("Exercício 3: Pessoa");
		Pessoa Florence = new Pessoa("Florence", 19, 47.5, 162);
		System.out.println("O nome é " + Florence.getNome());
		System.out.println("Possui " + Florence.getIdade() + " anos");
		System.out.println("Possui " + Florence.getPeso() + " quilos");
		System.out.println("Ao envelhecer, terá " + Florence.envelhecer(3) + " anos");
		System.out.println("Ao engordar, terá " + Florence.engordar(2.0) + " quilos");
		System.out.println("Ao emagrecer, terá " + Florence.emagrecer(5.0) + " quilos");
		System.out.println("Ao crescer, terá " + Florence.crescer(0.5) + " cm");
		System.out.println("-----------------------------------------------");

		System.out.println("Exercício 4: TV");
		TV querida = new TV(5, 10, "Desligada");
		System.out.println("A tv está " + querida.getSituacao());
		System.out.println("Agora a tv está " + querida.ligarTV());
		System.out.println("Está no canal " + querida.getCanal());
		System.out.println("Está no volume " + querida.getVolume());
		querida.infoCanal(22);
		querida.aumentarVol(10);
		querida.diminuirVol(5);
		System.out.println("A tv está " + querida.desligarTV());
		System.out.println("-----------------------------------------------");
		
		System.out.println("Exercício 5: Bichinho Virtual (Tamagushi)");
		Bichinho_Virtual Banny = new Bichinho_Virtual("Banny", 100, 100, 17);
		System.out.println("O nome do Tamagushi é " + Banny.getNome());
		System.out.println("A fome do Tamagushi está em " + Banny.getFome());
		System.out.println("A saude do Tamagushi está em " + Banny.getSaude());
		System.out.println("A idade do Tamagushi é " + Banny.getIdade() + " anos");
		System.out.println("O novo nome do Tamagushi é " + Banny.mudarNome("Martin"));
		System.out.println("A nova fome do Tamagushi é " + Banny.mudarFome(50));
		System.out.println("A nova saude do Tamagushi é " + Banny.mudarSaude(50));
		System.out.println("A nova idade do Tamagushi é " + Banny.mudarIdade(15));
		Banny.humor(78, 80);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Exercício 6: Bomba de Combustível");
		Bomba_de_Combustivel posto = new Bomba_de_Combustivel("Gasolina", 3.0, 50);
		System.out.println("O tipo de combustível é " + posto.getTipoCom());
		System.out.println("O valor do litro é " + posto.getValorL() + " reais");
		System.out.println("A quantidade de combustível que a bomba possui é " + posto.getQtdCom() + " litros");
		System.out.println("Foi colocado no veículo " + posto.abastecerPorValor(6.0) + " litros");
		System.out.println("A quantidade de combustível que a bomba possui é " + posto.getQtdCom() + " litros");
		System.out.println("O cliente deve pagar " + posto.abastecerPorLitro(5.0) + " reais");
		System.out.println("A quantidade de combustível que a bomba possui é " + posto.getQtdCom() + " litros");
		System.out.println("O novo valor do litro de combustível é " + posto.alterarValor(2.53) + " reais");
		System.out.println("O novo tipo de combustível é " + posto.alterarCombustivel("Álcool"));
		System.out.println("A nova quantidade de combustível na bomba é " + posto.alterarQtdCombustivel(120.0) + " litros");
		System.out.println("-----------------------------------------------");
	}

}