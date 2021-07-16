package Lista1;

public class TV {
	private
		int canal;
		int volume;
		String situacao;
		
	public TV(int can, int vol, String sit) {
		this.canal = can;
		this.volume = vol;
		this.situacao = sit;
	}
	
	public String ligarTV() {
		return this.situacao = "Ligada";
	}
	
	public String desligarTV() {
		return this.situacao = "Desligada";
	}
	
	public void infoCanal(int i_canal) {
		if (i_canal > 100) {
			System.out.println("Canal inválido");
		}else {
			System.out.println("Seu novo canal é " + i_canal);
		}
	}
	
	public void aumentarVol(int clique_vol) {
		for (int i = 0; i < clique_vol; i++) {
			this.volume += 1;
		}
		
		if (this.volume >= 100) {
			System.out.println("Volume inválido");
		}else {
			System.out.println("Aumentando o volume ficará " + this.volume);
		}
	}
	
	public void diminuirVol(int clique_vol) {
		for (int i = 0; i < clique_vol; i++) {
			this.volume -= 1;
		}
		
		if (this.volume < 0) {
			System.out.println("Volume inválido");
		}else {
			System.out.println("Diminuindo o volume ficará " + this.volume);
		}
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public String getSituacao() {
		return this.situacao;
	}
	
}