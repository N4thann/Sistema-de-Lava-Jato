package programa;

import java.util.ArrayList;
import java.util.List;

public class Atendimento {
	
	private boolean status = false;
	double soma;
	private String ini;
	private String fim;
	static List<Servico> servicosAtendimento = new ArrayList<Servico>();
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
	
	public void adicionarServico(Servico servico) {
		servicosAtendimento.add(servico);
	}
	
	public void listarServicos() {
		for(Servico servico: servicosAtendimento) {
			System.out.println("Definição do serviço: " + servico.getNome());
			System.out.println("Valor: " + servico.getValor());
		}
	}
	
	public double obterValorTotal() {
		soma = 0;
		for(Servico servico: servicosAtendimento) {
			soma += servico.getValor();
		}
		return soma;
	}

	public String toString() {
		if(status) {
			return	"\nCliente: " + cliente.getNome() +
					"\nModelo: " + modelo.getNome() +
					"\nData de abertura do atendimento: " + ini +
					"\nStatus do Atendimento: Aberto";
		}else {
			return "\nCliente: " + cliente.getNome() +
				"\nModelo: " + modelo.getNome() +
				"\nData de abertura do atendimento: " + ini +
				"\nData de fechamento do atendimento: " + fim +
				"\nStatus do Atendimento: Fechado"; 
		}
	}
	
}
