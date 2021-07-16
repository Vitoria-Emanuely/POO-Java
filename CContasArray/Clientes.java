package CContasArray;
import java.util.List;
import java.util.ArrayList;

public class Clientes {
	private String nome;
	private String cpf;
	private List<CCorrente> contas;
	
	public Clientes(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.contas= new ArrayList<CCorrente>();
	}
	
	public void addContas(CCorrente conta) {
		contas.add(conta);
	}
	
	public List<CCorrente> getContas() {
		return this.contas;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	@Override
	public String toString() {
		return (" Cliente:" + this.nome + this.contas);
	}

}
