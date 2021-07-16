package CContas;

public class CContas {

	public static void main(String[] args) {
		CCorrente conta1 = new CCorrente(1, 1000, "Dazai");
		conta1.creditar(500);
		System.out.println("Seu saldo �: " + conta1.getSaldo());
		conta1.debitar(800);
		System.out.println("Seu saldo �: " + conta1.getSaldo());
		System.out.println("-------------------------------------------");
		
		
		CEspecial conta2 = new CEspecial(2, 1000, "Chuuya", 2000);
		conta2.creditar(500);
		System.out.println("Seu saldo �: " + conta2.getSaldo());
		conta2.debitar(2000);
		System.out.println("Seu saldo �: " + conta2.getSaldo());
		System.out.println("-------------------------------------------");
		
		
		CPoupanca conta3 = new CPoupanca(3, 1000, "Sebastian", 1000);
		conta3.debitar(500);
		System.out.println("Seu saldo �: " + conta3.getSaldo());
		conta3.creditar(1500);
		System.out.println("Seu saldo �: " + conta3.getSaldo());
		System.out.println("Seu saldo m�nimo �: " + conta3.getSaldominimo());
		conta3.atualizarSaldo();
		System.out.println("Seu saldo �: " + conta3.getSaldo());
		System.out.println("Seu saldo m�nimo �: " + conta3.getSaldominimo());
		System.out.println("-------------------------------------------");
		
		
		CInvestimento conta4 = new CInvestimento(4, 1000, "Mary", 9, 10);
		CInvestimento conta5 = new CInvestimento(5, 2000, "Jhonny", 1, 20);
		conta4.atualizarSaldo();
		System.out.println("Seu saldo �: " + conta4.getSaldo());
		conta5.atualizarSaldo();
		System.out.println("Seu saldo �: " + conta5.getSaldo());
		System.out.println("-------------------------------------------");
	}

}
