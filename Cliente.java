package programa;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String cpf;
	private String cep;
	private String cidade;
	private String email;

	Cliente(){
		
	}
	
	public Cliente(String nome, String telefone, String cpf, String cep, String cidade, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cep = cep;
		this.cidade = cidade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nCep: " + cep +
			"\nTelefone: " + telefone +
			"\nCidade: " + cidade +
			"\nCpf: " + cpf; 
	}
}
