import java.util.ArrayList;

public class Vendedor {

	private String nome;
	private String idade;
	private ArrayList<Venda> vendas;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public ArrayList getvendas() {
		return vendas;

	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
