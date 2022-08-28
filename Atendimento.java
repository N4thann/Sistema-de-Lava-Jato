package programa;

public class Atendimento {
	
	private boolean status = false;
	private String ini;
	private String fim;
	private double valorTotal = 0;
	Cliente cliente;
	Modelo modelo;
	
	Atendimento(){
		
	}
	
	public Atendimento(boolean status, String ini, Cliente cliente) {
		this.status = status;
		this.ini = ini;
		this.cliente = cliente;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getIni() {
		return ini;
	}

	public void setIni(String ini) {
		this.ini = ini;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal += valorTotal;
	}

	public String toString() {
		if(status) {
			return	"\nCliente: " + cliente.getNome() +
					"\nModelo: " + modelo.getNome() +
					"\nData de abertura do atendimento: " + ini +
					"\nStatus do Atendimento: Aberto" + 
					"\nValor Total do Atendimento: " + valorTotal;
		}else {
			return "\nCliente: " + cliente.getNome() +
				"\nModelo: " + modelo.getNome() +
				"\nData de abertura do atendimento: " + ini +
				"\nData de fechamento do atendimento: " + fim +
				"\nStatus do Atendimento: Fechado" +
				"\nValor Total do Atendimento: " + valorTotal; 
		}
	}
	
}
