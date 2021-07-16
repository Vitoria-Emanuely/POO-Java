package Lista1;

public class Bomba_de_Combustivel {
	private
		String tipoCombustivel;
		double valorLitro;
		double quantidadeCombustivel;
		
	public Bomba_de_Combustivel(String tipoCom, double valorL, double qtdCom) {
		this.tipoCombustivel = tipoCom;
		this.valorLitro = valorL;
		this.quantidadeCombustivel = qtdCom;
	}
	
	public String getTipoCom() {
		return this.tipoCombustivel;
	}
	
	public double getValorL() {
		return this.valorLitro;
	}
	
	public double getQtdCom() {
		return this.quantidadeCombustivel;
	}
	
	public double abastecerPorValor(double valor) {
		double litros = valor / this.valorLitro;
		this.quantidadeCombustivel -= litros;
		return litros;
	}
	
	public double abastecerPorLitro(double litros) {
		double valor = this.valorLitro * litros;
		this.quantidadeCombustivel -= litros;
		return valor;
	}
	
	public double alterarValor(double valorL) {
		return this.valorLitro = valorL;
	}
	
	public String alterarCombustivel(String n_com) {
		return this.tipoCombustivel = n_com;
	}
	
	public double alterarQtdCombustivel(double n_qtd) {
		return this.quantidadeCombustivel  = n_qtd;
	}
}
