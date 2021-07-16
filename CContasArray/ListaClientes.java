package CContasArray;
import java.util.List;
import java.util.ArrayList;

public class ListaClientes {
	private List<Clientes> clientes;
	
	public ListaClientes() {
		clientes = new ArrayList<Clientes>();
	}
	
	public void addClientes(Clientes cli) {
		clientes.add(cli);
	}
	
	public void imprimeClientes() {
		for(Clientes cli: clientes) {
			System.out.println(cli);
		}
	}

}
