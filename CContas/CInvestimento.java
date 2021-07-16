package CContas;
import java.util.*;

public class CInvestimento extends CCorrente {
	private int diaInvestimento;
	private int periodo;
	
	public CInvestimento(int num, float sal, String cli, int dinv, int per) {
		super(num, sal, cli);
		this.diaInvestimento = dinv;
		this.periodo = per;
	}
	
	public void atualizarSaldo() {
		Calendar dataAtual = Calendar.getInstance();
		int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
		if (dia == this.diaInvestimento + this.periodo)
			super.setSaldo((float)(super.getSaldo() * 1.20));
		else
			System.out.println("Ainda não é dia de atualizar o saldo!");
	}
}