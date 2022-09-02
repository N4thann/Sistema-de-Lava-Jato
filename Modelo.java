package programa;

public class Modelo {
	private String nome;
	Marca marca;
	
	public Modelo(String nome, Marca marca) {
		this.nome = nome;
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
