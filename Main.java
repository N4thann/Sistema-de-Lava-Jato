package programa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);
	static List<Atendimento> atendimentos = new ArrayList<Atendimento>();
	static List<Cliente> clientes = new ArrayList<Cliente>();
	static List<Marca> marcas = new ArrayList<Marca>();
	static List<Modelo> modelos = new ArrayList<Modelo>();
	static List<Servico> servicos = new ArrayList<Servico>();
	
	static int b1;//controle de laço dentro dos métodos
	static int b2;//controle de laço dentro dos métodos
	static int b3;//controle de laço no switch do main
	static int cont;//contador para listar
	static int valorInt;//receber respostas do tipo int
	static String valorString;//receber resposta do tipo String
	static double valorDouble;
	
	static boolean achou;
	
	public static void main(String[] args) {	
		do {
			b3 = 0;
			System.out.println("--------------------");
			System.out.println("-----Lava Jato Sr. José----");
			System.out.println("Selecione a opção que deseja:");
			System.out.println("--------------------");
			System.out.println("--     Opção 1 - Cadastrar Marcas de carros    --");
			System.out.println("--     Opção 2 - Cadastrar Modelos de carros    --");
			System.out.println("--     Opção 3 - Cadastrar um serviço    --");
			System.out.println("--     Opção 4 - Cadastrar um cliente    --");
			System.out.println("--     Opção 5 - Abrir um novo atendimento   --");
			System.out.println("--     Opção 6 - Encerrar ou editar um atendimento   --");
			System.out.println("--     Opção 7 - Visualizar os atendimentos   --");
			System.out.println("--     Opção 8 - Gerar cadastros para teste   --");
			System.out.println("--     Opção 0 - Encerrar sistema   --");
			System.out.println("--------------------");
			b3 = teclado.nextInt();
			if(b3 != 0) {
				switch(b3) {
				case 1:
					cadastrarMarcas();
					break;
				case 2:
					cadastrarModelo();
					
					break;
				case 3:
					cadastrarServico();
					
					break;
				case 4:
					cadastrarCliente();
					
					break;
				case 5:
					abrirNovoAtendimento();		
					break;
				case 6:
					editarOuEncerrarAtendimento();
					break;
				case 7:
					visualizarAtendimento();
					break;
				case 8:
					cadastrosTestes();
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida");
					break;		
			  }
			}			
		}while(b3 != 0);
		teclado.close();
	}
	public static void cadastrarMarcas() {
		do{
			b1 = 0;
			teclado.nextLine();
			System.out.println("-------Cadastro de Marca-------");
			System.out.println("Digite o nome da Marca: ");	
			valorString = teclado.nextLine();
			
			Marca m = new Marca(valorString);
			marcas.add(m);
			System.out.println("Digite (0) para sair: ");
			System.out.println("Digite (1) para cadastrar uma nova marca: ");
			b1 = teclado.nextInt();
		}while(b1 != 0);
	}
	
	public static void cadastrarModelo() {
		System.out.println("-------Cadastro de modelo-------");
		do{
			b1 = 0;
			teclado.nextLine();
			System.out.println("Digite o modelo: ");
			valorString = teclado.nextLine();
			
			
			System.out.println("-------Associar Marca-------");
			
			cont = 1;
			for(Marca marca: marcas) {
				System.out.println("Marca" + "(" + cont + ")" + ": " + marca.getNome());
				cont += 1;
			}
			
			System.out.println("Digite o código correspondente a marca do veículo: ");
			valorInt = teclado.nextInt();
			
			cont = 1;
			for(Marca marca: marcas) {
				if(cont == valorInt){
					Modelo m = new Modelo(valorString, marca);
					modelos.add(m);
				}
				cont += 1;
			}
	
			System.out.println("Digite (0) para sair: ");
			System.out.println("Digite (1) para cadastrar um novo modelo: ");
			b1 = teclado.nextInt();
		}while(b1 != 0);
	}
	
	public static void cadastrarServico() {
		do{
			b1 = 0;
			teclado.nextLine();
			System.out.println("------- Digite o nome do servico -------");
			System.out.println("Digite o nome do servico: ");		
			Servico s = new Servico();
			valorString = teclado.nextLine();
			s.setNome(valorString);
						
			System.out.println("Digite a descrição do servico: ");
			valorString = teclado.nextLine();
			s.setDescricao(valorString);
			
			System.out.println("Digite o valor o serviço: ");
			valorDouble = teclado.nextDouble();
			s.setValor(valorDouble);

			servicos.add(s);
			
			System.out.println("Digite (0) para sair: ");
			System.out.println("Digite (1) para cadastrar um novo servico: ");
			b1 = teclado.nextInt();
			
		}while(b1 != 0);
	}
	public static void cadastrarCliente() {
		do{
			b1 = 0;//controlar laço
			System.out.println("------- Cadastro de Cliente -------");
			teclado.nextLine();
			Cliente c = new Cliente();
			
			System.out.println("\nDigite o nome do cliente: ");
			valorString = teclado.nextLine();
			c.setNome(valorString);
			
			System.out.println("Digite seu telefone: ");
			valorString = teclado.nextLine();
			c.setTelefone(valorString);
			
			System.out.println("Digite seu cpf: ");
			valorString = teclado.nextLine();
			c.setCpf(valorString);
			
			System.out.println("Digite seu cep: ");
			valorString = teclado.nextLine();
			c.setCep(valorString);
			
			System.out.println("Digite sua cidade: ");
			valorString = teclado.nextLine();
			c.setCidade(valorString);
			
			System.out.println("Digite seu email ");
			valorString = teclado.nextLine();
			c.setEmail(valorString);
	
			clientes.add(c);
			
			System.out.println("Digite (0) para sair: ");
			System.out.println("Digite (1) para cadastrar um novo cliente: ");
			b1 = teclado.nextInt();	
		}while(b1 != 0);	
	}
	
	public static void abrirNovoAtendimento() {				
		System.out.println("------- Abrindo Atendimento -------");
		Atendimento a = new Atendimento();
			
		teclado.nextLine();
		System.out.println("Digite o cpf do cliente:");
		valorString = teclado.nextLine();
		achou = false;
			
		for(Cliente cliente: clientes) {
			if(cliente.getCpf().equalsIgnoreCase(valorString)){
				System.out.println("Cliente: " + cliente.getNome());
				
				
				a.setCliente(cliente);
				a.setIni(buscarData());
				a.setStatus(true);
				achou = true;
			}
		}
		if(achou) {
			System.out.println("------- Adicionar serviço ao atendimento -------");
			do{
				b2 = 0;
					
				listarServicos();
				System.out.println("Digite o código do serviço que deseja adicionar: ");
				valorInt = teclado.nextInt();
					
				cont = 0;
				for(Servico servico: servicos) {
					if(cont == valorInt) {
						a.adicionarServico(servico);
					}
					cont += 1;
				}						
				System.out.println("Digite (0) para sair: ");
				System.out.println("Digite (1) para adicionar um novo serviço ao atendimento: ");
				b2 = teclado.nextInt();
					
			}while(b2 != 0);
				
			System.out.println("------- Adicionar modelo ao atendimento -------");
			cont = 0;
			for(Modelo modelo: modelos) {
				System.out.println("(" + cont + ") " + modelo.getNome() 
				+ "\nMarca: " + modelo.marca.getNome());
				cont += 1;
			}
			
			System.out.println("Digite o código do modelo que deseja adicionar: ");
			valorInt = teclado.nextInt();	
			
			cont = 0;
			for(Modelo modelo: modelos) {
				if(cont == valorInt) {
					a.setModelo(modelo);
				}
				cont += 1;
			}				
			atendimentos.add(a);
		} else {
			System.out.println("Cliente não encontrado");
		}
	}	
	public static void editarOuEncerrarAtendimento() {
		System.out.println("------- Editando ou Encerrando um atendimento -------");
		teclado.nextLine();
		System.out.println("Digite o cpf do cliente:");
		valorString = teclado.nextLine();
		achou = false;
		
		for(Atendimento atendimento: atendimentos) {
			if(atendimento.cliente.getCpf().equalsIgnoreCase(valorString) && 
					atendimento.getStatus()){
				achou = true;
				System.out.println("Cliente: " + atendimento.cliente.getNome());
				System.out.println("--     Opção 1 - Deseja adicionar mais um serviço    --");
				System.out.println("--     Opção 2 - Deseja encerrar o atendimento    --");
				b1 = teclado.nextInt();
				
				if(b1 == 1) {
					do{
						b2 = 0;
						
						listarServicos();
							
						System.out.println("Digite o código do serviço que deseja adicionar: ");
						valorInt = teclado.nextInt();
							
						cont = 0;
						for(Servico servico: servicos) {
							if(cont == valorInt) {
								atendimento.adicionarServico(servico);
								System.out.println("Serviço Adicionado");
							}
							cont += 1;
						}			
									
						System.out.println("Digite (0) para sair: ");
						System.out.println("Digite (1) para adicionar um novo serviço ao atendimento: ");
						b2 = teclado.nextInt();
					}while(b2 != 0);
						
				} else {
					atendimento.setFim(buscarData());
					atendimento.setStatus(false);
					System.out.println("Atendimento encerrado");
				} 			
		   } 
		}
		 if(!achou){
			   System.out.println("(Erro) Possíveis causas do erro:");
			   System.out.println("1 - Atendimento já foi encerrado");
			   System.out.println("2 - Cliente não cadastrado");
			   System.out.println("3 - Cpf do cliente foi digitado errado");
			   System.out.println("4 - Não existe nenhum atendimento aberto para editar");
		   }
	}
	public static void visualizarAtendimento(){
		
		System.out.println("Deseja visualizar o atendimento com status aberto ou encerrado?");
		System.out.println("Digite (1) para aberto e (2) para fechado");
		valorInt = teclado.nextInt();
		for(Atendimento atendimento: atendimentos) {
			if(valorInt == 1) {
				if(atendimento.getStatus() == true) {
					System.out.println(atendimento);
					System.out.println("Lista de Serviços:\n");
					atendimento.listarServicos();
					System.out.println("\nValor total dos serviços: " +
							atendimento.obterValorTotal() + "\n");
				}
			} else {
				if(atendimento.getStatus() == false) {
					System.out.println(atendimento);
					System.out.println("Lista de Serviços:\n");
					atendimento.listarServicos();
					System.out.println("\nValor total dos serviços: " +
					atendimento.obterValorTotal() + "\n");
				}
			}
		}
	}
	public static void cadastrosTestes() {
		Servico s1 = new Servico("lavagem rápida","lavagem apenas parcial", 50);
		Servico s2 = new Servico("lavagem completa","lavagem geral de todos os componentes", 100);
		servicos.add(s1);
		servicos.add(s2);
		
		Marca m1 = new Marca("honda");
		Marca m2 = new Marca("audio");
		marcas.add(m1);
		marcas.add(m2);
		
		Modelo mod1 = new Modelo("palio fire", m1);
		Modelo mod2 = new Modelo("bmw", m2);
		modelos.add(mod1);
		modelos.add(mod2);
		
		Cliente c1 = new Cliente("Francisco Generico","88 94870757","0","062130110","sobral","generico@gmail.com");		
		Cliente c2 = new Cliente("Raimundo Comum","88 948569798","1","062130110","cariri","comum@gmail.com");
		clientes.add(c1);
		clientes.add(c2);
		System.out.println("------- Cadastros Gerados -------");
	}
	public static void listarServicos() {
		cont = 0;
		for(Servico servico: servicos) {
			System.out.println("(" + cont + ") " + servico.getNome() 
			+ " tem o valor: " + servico.getValor());
			cont += 1;
		}
	}
	public static String buscarData() {
		Date data = new Date();
		String d = new SimpleDateFormat("dd/MM/yyyy").format(data);
		String h = new SimpleDateFormat("HH:mm:ss").format(data);
		String resultado = d + " " + h;
		return resultado;
	}
}
