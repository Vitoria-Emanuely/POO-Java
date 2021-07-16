package Lista1;

public class main {

	public static void main(String[] args) {
		System.out.println("Exerc�cio 1: Bola");
		Bola Rodolfo = new Bola("verde", 3.2, "seda");
		System.out.println("A circunfer�ncia da sua bola � " + Rodolfo.getCirc() + " cm");
		System.out.println("O material da sua bola � " + Rodolfo.getMaterial());
		System.out.println("A cor da sua bola � " + Rodolfo.mostraCor());
		System.out.println("A nova cor da sua bola � " + Rodolfo.trocaCor("rosa"));
		System.out.println("-----------------------------------------------");

		System.out.println("Exerc�cio 2: Quadrado");
		Quadrado Paulinho = new Quadrado(3.5);
		System.out.println("O valor do lado � " + Paulinho.mostraLado() + " cm");
		System.out.println("O novo valor do lado � " + Paulinho.mudaLado(5.0) + " cm");
		System.out.println("A �rea do seu quadrado � " + Paulinho.calcularArea() + " cm");
		System.out.println("-----------------------------------------------");

		System.out.println("Exerc�cio 3: Pessoa");
		Pessoa Florence = new Pessoa("Florence", 19, 47.5, 162);
		System.out.println("O nome � " + Florence.getNome());
		System.out.println("Possui " + Florence.getIdade() + " anos");
		System.out.println("Possui " + Florence.getPeso() + " quilos");
		System.out.println("Ao envelhecer, ter� " + Florence.envelhecer(3) + " anos");
		System.out.println("Ao engordar, ter� " + Florence.engordar(2.0) + " quilos");
		System.out.println("Ao emagrecer, ter� " + Florence.emagrecer(5.0) + " quilos");
		System.out.println("Ao crescer, ter� " + Florence.crescer(0.5) + " cm");
		System.out.println("-----------------------------------------------");

		System.out.println("Exerc�cio 4: TV");
		TV querida = new TV(5, 10, "Desligada");
		System.out.println("A tv est� " + querida.getSituacao());
		System.out.println("Agora a tv est� " + querida.ligarTV());
		System.out.println("Est� no canal " + querida.getCanal());
		System.out.println("Est� no volume " + querida.getVolume());
		querida.infoCanal(22);
		querida.aumentarVol(10);
		querida.diminuirVol(5);
		System.out.println("A tv est� " + querida.desligarTV());
		System.out.println("-----------------------------------------------");
		
		System.out.println("Exerc�cio 5: Bichinho Virtual (Tamagushi)");
		Bichinho_Virtual Banny = new Bichinho_Virtual("Banny", 100, 100, 17);
		System.out.println("O nome do Tamagushi � " + Banny.getNome());
		System.out.println("A fome do Tamagushi est� em " + Banny.getFome());
		System.out.println("A saude do Tamagushi est� em " + Banny.getSaude());
		System.out.println("A idade do Tamagushi � " + Banny.getIdade() + " anos");
		System.out.println("O novo nome do Tamagushi � " + Banny.mudarNome("Martin"));
		System.out.println("A nova fome do Tamagushi � " + Banny.mudarFome(50));
		System.out.println("A nova saude do Tamagushi � " + Banny.mudarSaude(50));
		System.out.println("A nova idade do Tamagushi � " + Banny.mudarIdade(15));
		Banny.humor(78, 80);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Exerc�cio 6: Bomba de Combust�vel");
		Bomba_de_Combustivel posto = new Bomba_de_Combustivel("Gasolina", 3.0, 50);
		System.out.println("O tipo de combust�vel � " + posto.getTipoCom());
		System.out.println("O valor do litro � " + posto.getValorL() + " reais");
		System.out.println("A quantidade de combust�vel que a bomba possui � " + posto.getQtdCom() + " litros");
		System.out.println("Foi colocado no ve�culo " + posto.abastecerPorValor(6.0) + " litros");
		System.out.println("A quantidade de combust�vel que a bomba possui � " + posto.getQtdCom() + " litros");
		System.out.println("O cliente deve pagar " + posto.abastecerPorLitro(5.0) + " reais");
		System.out.println("A quantidade de combust�vel que a bomba possui � " + posto.getQtdCom() + " litros");
		System.out.println("O novo valor do litro de combust�vel � " + posto.alterarValor(2.53) + " reais");
		System.out.println("O novo tipo de combust�vel � " + posto.alterarCombustivel("�lcool"));
		System.out.println("A nova quantidade de combust�vel na bomba � " + posto.alterarQtdCombustivel(120.0) + " litros");
		System.out.println("-----------------------------------------------");
	}

}