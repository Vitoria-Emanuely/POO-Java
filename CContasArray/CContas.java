package CContasArray;

public class CContas {

	public static void main(String[] args) {	
		ListaClientes listacli = new ListaClientes();
		Clientes cli1 = new Clientes("Dazai", "10759580910");
		Clientes cli2 = new Clientes("Chuuya", "13516603062");
		Clientes cli3 = new Clientes("Sebastian", "57595945089");
		Clientes cli4 = new Clientes("Mary", "85221272040");
		Clientes cli5 = new Clientes("Akutagawa", "13601037084");
		listacli.addClientes(cli1);
		listacli.addClientes(cli2);
		listacli.addClientes(cli3);
		listacli.addClientes(cli4);
		listacli.addClientes(cli5);
		
		CCorrente cc1 = new CCorrente(1, 1000);
		cli1.addContas(cc1);
		CCorrente cc2 = new CCorrente(2, 2500);
		cli2.addContas(cc2);
		CPoupanca cp1 = new CPoupanca(3, 1000, 1000);
		cli2.addContas(cp1);
		CEspecial ce1 = new CEspecial(4, 1500, 3000);
		cli3.addContas(ce1);
		CInvestimento ci1 = new CInvestimento(5, 2000, 20, 10);
		cli3.addContas(ci1);
		CInvestimento ci2 = new CInvestimento(6, 5000, 20, 5);
		cli4.addContas(ci2);
		listacli.imprimeClientes();
	}

}
