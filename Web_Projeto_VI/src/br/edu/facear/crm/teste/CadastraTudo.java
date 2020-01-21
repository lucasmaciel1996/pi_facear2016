package br.edu.facear.crm.teste;

import java.text.DateFormat;
import java.util.Date;

import br.edu.facear.crm.dao.Historico_Ligacao_Dao;
import br.edu.facear.crm.dao.Tipo_ligacao_DAO;
import br.edu.facear.crm.entity.Contato;
import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Historico_ligacao;
import br.edu.facear.crm.entity.Login;
import br.edu.facear.crm.entity.Origem_contato;
import br.edu.facear.crm.entity.Prioridade;
import br.edu.facear.crm.entity.Produto;
import br.edu.facear.crm.entity.Produtos_venda;
import br.edu.facear.crm.entity.Situacao;
import br.edu.facear.crm.entity.Tarefa;
import br.edu.facear.crm.entity.Tipo_comunicador;
import br.edu.facear.crm.entity.Tipo_contato;
import br.edu.facear.crm.entity.Tipo_empresa;
import br.edu.facear.crm.entity.Tipo_ligacao;
import br.edu.facear.crm.entity.Tipo_telefone;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.entity.Venda;
import br.edu.facear.crm.facade.Facade;

public class CadastraTudo {

	public static void main(String[] args) {
		
		CadastrarTipo_telefone();
		CadastrarPrioridade();
		CadastrarTipo_empresa();
		CadastrarTipo_contato();
		CadastrarTipo_comunicador();
		CadastrarSituacao();
		CadastrarEmpresa();
		CadastrarContato();
		CadastrarUsuario();
		CadastrarOrigem_contato();
		CadastrarProduto();
		CadastrarVenda();
		CadastrarTarefa();
	
		Cadastra_Tipo_Ligacao();
		Cadastra_historico_ligacao();
		Cadastrar_Login();
	
	//	CadastrarProdutos_venda();

	}




	

	private static void CadastrarPrioridade() {

		Prioridade prioridade = new Prioridade();

		prioridade.setDescricao("Alta - 1 dia");

		Facade facade = new Facade();
		facade.salvarPrioridade(prioridade);

		prioridade = new Prioridade();

		prioridade.setDescricao("Média - 3 dias");

		facade = new Facade();
		facade.salvarPrioridade(prioridade);

		prioridade = new Prioridade();

		prioridade.setDescricao("Baixa - 5 dias");

		facade = new Facade();
		facade.salvarPrioridade(prioridade);

	}

	
	// CADASTRAR TIPO TELEFONE  *************************************************************************************************

	private static void CadastrarTipo_telefone() {

		Tipo_telefone tipo_telefone = new Tipo_telefone();
		tipo_telefone.setDescricao("Comercial");
		Facade facade = new Facade();
		facade.salvarTipo_telefone(tipo_telefone);

		tipo_telefone = new Tipo_telefone();
		tipo_telefone.setDescricao("Residencial");
		facade = new Facade();
		facade.salvarTipo_telefone(tipo_telefone);

	}
	
	// CADASTRAR USUARIO  *************************************************************************************************

	private static void CadastrarUsuario() {
		
		Usuario usuario = new Usuario();

		usuario.setUsuario_nome("Cesar");
		usuario.setUsuario_senha("123");
		
		Facade facade = new Facade();
		facade.salvarUsuario(usuario);
		
		usuario = new Usuario();
		usuario.setUsuario_nome("Mari");
		usuario.setUsuario_senha("321");

		facade = new Facade();
		facade.salvarUsuario(usuario);

	}
	
	// CADASTRAR TIPO EMPRESA  *************************************************************************************************

	private static void CadastrarTipo_empresa() {

		Tipo_empresa tipo_empresa = new Tipo_empresa();

		tipo_empresa.setDescricao("Privada");
		Facade facade = new Facade();
		facade.salvarTipo_empresa(tipo_empresa);

		tipo_empresa = new Tipo_empresa();
		tipo_empresa.setDescricao("Estatal");
		facade = new Facade();
		facade.salvarTipo_empresa(tipo_empresa);
	}
	
	// CADASTRAR TIPO CONTATO  *************************************************************************************************

	private static void CadastrarTipo_contato() {

		Tipo_contato tipo_contato = new Tipo_contato();

		tipo_contato.setDescricao("Cliente");
		Facade facade = new Facade();
		facade.salvarTipo_contato(tipo_contato);

		tipo_contato = new Tipo_contato();
		tipo_contato.setDescricao("Fornecedor");
		facade = new Facade();
		facade.salvarTipo_contato(tipo_contato);
	}
	
	// CADASTRAR TIPO COMUNICADOR  *************************************************************************************************

	private static void CadastrarTipo_comunicador() {

		Tipo_comunicador tipo_comunicador = new Tipo_comunicador();

		tipo_comunicador.setTipo_comunicador_descricao("Facebook");
		Facade facade = new Facade();
		facade.salvarTipo_comunicador(tipo_comunicador);

		tipo_comunicador = new Tipo_comunicador();
		tipo_comunicador.setTipo_comunicador_descricao("Skype");
		facade = new Facade();
		facade.salvarTipo_comunicador(tipo_comunicador);

	}
	
	// CADASTRAR ORIGEMDE CONTATO  *************************************************************************************************

	private static void CadastrarOrigem_contato() {

		Origem_contato origem_contato = new Origem_contato();

		origem_contato.setDescricao("Ligação");
		Facade facade = new Facade();
		facade.salvarOrigem_contato(origem_contato);

		origem_contato = new Origem_contato();

		origem_contato.setDescricao("Website");
		facade = new Facade();
		facade.salvarOrigem_contato(origem_contato);

	}
	
	// CADASTRAR SITUAÇÃO  *************************************************************************************************

	private static void CadastrarSituacao() {

		Situacao situacao = new Situacao();

		situacao.setDescricao("Aguardando Análise");
		Facade facade = new Facade();
		facade.salvarSituacao(situacao);

		situacao = new Situacao();
		situacao.setDescricao("Finalizada");
		facade = new Facade();
		facade.salvarSituacao(situacao);
	}
	
	// CADASTRAR EMPRESA   *************************************************************************************************

	private static void CadastrarEmpresa() {

		Empresa empresa = new Empresa();

		empresa.setCnpj("655.350.0001/59");
		empresa.setEmpresa_nome("Facear");
		empresa.setEndereco("Av das Araucarias");
		empresa.setFax("3642-2020");
		empresa.setInscricao_estadual("345912054");
		empresa.setNome_contato("Cesar");
		empresa.setSite("www.facear.com.br");
		empresa.setTelefone("3642-1515");

		Tipo_comunicador tipo_comunicador = new Tipo_comunicador();
		tipo_comunicador.setTipo_comunicador_id(1L);
		empresa.setTipo_comunicador(tipo_comunicador);

		Tipo_contato tipo_contato = new Tipo_contato();
		tipo_contato.setTipo_contato_id(1L);
		empresa.setTipo_contato(tipo_contato);

		Tipo_empresa tipo_empresa = new Tipo_empresa();
		tipo_empresa.setTipo_empresa_id(1L);
		empresa.setTipo_empresa(tipo_empresa);

		Facade facade = new Facade();
		facade.salvarEmpresa(empresa);

		empresa = new Empresa();

		empresa.setCnpj("111.111.0001/20");
		empresa.setEmpresa_nome("Risotolândia");
		empresa.setEndereco("Av das Araucarias");
		empresa.setFax("3642-1020");
		empresa.setInscricao_estadual("031740379");
		empresa.setNome_contato("Mariane");
		empresa.setSite("www.risotolandia.com.br");
		empresa.setTelefone("3642-3086");
		empresa.setTipo_comunicador(tipo_comunicador);
		empresa.setTipo_contato(tipo_contato);
		empresa.setTipo_empresa(tipo_empresa);

		facade = new Facade();
		facade.salvarEmpresa(empresa);

	}
	
	// CADASTRAR CONTATOS   *************************************************************************************************

	private static void CadastrarContato() {
		
		Contato contato = new Contato();
		
		contato.setNome_contato("João");
		
		Empresa empresa = new Empresa();
		empresa.setEmpresa_id(1L);
		contato.setEmpresa(empresa);
		
		Facade facade = new Facade();
		facade.salvarContato(contato);
		
		contato = new Contato();
		
		contato.setNome_contato("Cesar");
		contato.setEmpresa(empresa);
		
		facade = new Facade();
		facade.salvarContato(contato);
		
	}
	
	
	
	// CADASTRAR PRODUTOS   *************************************************************************************************

	private static void CadastrarProduto() {

		Produto produto = new Produto();
		produto.setDescricao("Impressora");
		produto.setValor(380.0);
		
		Facade facade = new Facade();
		facade.salvarProduto(produto);

		produto = new Produto();

		produto.setDescricao("Teclado");
		produto.setValor(50.0);
		
		facade = new Facade();
		facade.salvarProduto(produto);

	}
    // CADASTRAR PRODUTOS DA VENDA   *************************************************************************************************
	
	private static void CadastrarProdutos_venda() {

		Produtos_venda produtos_venda = new Produtos_venda();
		produtos_venda.setProdutos_venda_id(1L);
		produtos_venda.setDescricao_produto("Impressora");
		produtos_venda.setQuantidade(5);
		produtos_venda.setValor_produto(0.0);
		

		Venda venda = new Venda();
		venda.setVenda_id(1L);
		produtos_venda.setVenda(venda);

		Usuario usuario = new Usuario();
		usuario.setUsuario_id(1L);
		produtos_venda.setUsuario(usuario);

		Empresa empresa = new Empresa();
		empresa.setEmpresa_id(1L);
		produtos_venda.setEmpresa(empresa);
		
		Produto produto = new Produto();
		produto.setProduto_id(1L);
		produtos_venda.setProduto(produto);

		Facade facade = new Facade();
		facade.salvarProdutos_venda(produtos_venda);
		
		produtos_venda.setDescricao_produto("Teclado");
		produtos_venda.setQuantidade(3);
		
		produtos_venda.setUsuario(usuario);
		produtos_venda.setEmpresa(empresa);
		produtos_venda.setVenda(venda);
		produtos_venda.setProduto(produto);
		produtos_venda.setValor_produto(0.0);
		
		facade.salvarProdutos_venda(produtos_venda);
		
	}
	
	// CADASTRAR VENDA  *************************************************************************************************

	private static void CadastrarVenda() {

		Venda venda = new Venda();

		@SuppressWarnings("unused")
		DateFormat data_venda = DateFormat.getDateInstance();
		Date data = new Date();
		
		Produto produto = new Produto();
		produto.setProduto_id(1L);
		venda.setProduto(produto);
		
		Empresa empresa = new Empresa();
		empresa.setEmpresa_id(1L);
		venda.setEmpresa(empresa);
		
		Usuario usuario = new Usuario();
		usuario.setUsuario_id(1L);
		venda.setUsuario(usuario);
		
		venda.setData_venda(data);
		venda.setQuantidade(1);
		
		Facade facade = new Facade();
		facade.salvarVenda(venda);

		/*venda = new Venda();

		venda.setData_venda(data);
		venda.setQuantidade(1);
		venda.setDescricao_prod("Teclado");
		venda.setValor_produto(0.0);
		venda.setEmpresa(empresa);
		venda.setUsuario(usuario);
		venda.setProduto(produto);
		
		facade = new Facade();
		facade.salvarVenda(venda);*/

	}
	
	// CADASTRAR TAREFA  *************************************************************************************************

	private static void CadastrarTarefa() {

		Tarefa tarefa = new Tarefa();

		@SuppressWarnings("unused")
		DateFormat data = DateFormat.getDateInstance();
		Date data_inicio = new Date();

		Empresa empresa = new Empresa();
		empresa.setEmpresa_id(1L);
		tarefa.setEmpresa(empresa);

		Origem_contato origem_contato = new Origem_contato();
		origem_contato.setOrigem_contato_id(2L);
		tarefa.setOrigem_contato(origem_contato);

		tarefa.setDescricao("Instalar o word");

		tarefa.setData_inicio(data_inicio);

		Prioridade prioridade = new Prioridade();
		prioridade.setPrioridade_id(3L);
		tarefa.setPrioridade(prioridade);

		Usuario usuario = new Usuario();
		usuario.setUsuario_id(2L);
		tarefa.setUsuario(usuario);

		Situacao situacao = new Situacao();
		situacao.setSituacao_id(1L);
		tarefa.setSituacao(situacao);

		tarefa.setSolucao("Aguardando solução");

		tarefa = new Tarefa();

		tarefa.setEmpresa(empresa);
		tarefa.setOrigem_contato(origem_contato);
		tarefa.setDescricao("Trocar cabos de rede");
		tarefa.setData_inicio(data_inicio);
		tarefa.setPrioridade(prioridade);
		tarefa.setUsuario(usuario);
		tarefa.setSituacao(situacao);
		tarefa.setSolucao("Aguardando solução");

		Facade facade = new Facade();
		facade.salvarTarefa(tarefa);

		System.out.println(" " + tarefa);

	}
	

			private static void Cadastra_Tipo_Ligacao() {
				// TODO Auto-generated method stub
				Tipo_ligacao tp_ligacao = new Tipo_ligacao();
				Tipo_ligacao tp_ligacao1 = new Tipo_ligacao();
				Tipo_ligacao_DAO tp_dao = new Tipo_ligacao_DAO();
				tp_ligacao.setDescricao("RECEBIDAS");
				tp_dao.Salvar(tp_ligacao);
				tp_ligacao1.setDescricao("EFETUADAS");
				tp_dao.Salvar(tp_ligacao1);
			}

			private static void Cadastra_historico_ligacao() {
				
				Historico_ligacao histo = new Historico_ligacao();
				Historico_ligacao histo1 = new Historico_ligacao();
				Historico_Ligacao_Dao histo_dao = new Historico_Ligacao_Dao();
				Tipo_ligacao tp_ligacao = new Tipo_ligacao();
				Empresa empresa = new Empresa();
				Empresa empresa1 = new Empresa();
				empresa.setEmpresa_id(1L);
				empresa1.setEmpresa_id(2L);
		   /// LIGACAO 1
				tp_ligacao.setTipo_ligacao_id(1L);
				histo.setTipo_ligacao(tp_ligacao);
				histo.setData(null);
				histo.setEmpresa(empresa);
				histo.setDescricao("aruama impressora");
				histo_dao.Salvar(histo);
				
				//LIGACAO 2
				histo1.setData(null);
				histo1.setEmpresa(empresa1);
				histo1.setTipo_ligacao(tp_ligacao);
				histo1.setDescricao("trocar teclado");
				histo_dao.Salvar(histo1);

			}

			private static void Cadastrar_Login() {
				
				Login login = new Login();
				
				login.setLogin("Cesar");
				login.setSenha("1234");
				
				Facade facade = new Facade();
				facade.salvarLogin(login);
				
			    login = new Login();
				
				login.setLogin("Lucas");
				login.setSenha("abcd");
				
				facade = new Facade();
				facade.salvarLogin(login);
				
				login = new Login();
				
				login.setLogin("Mariane");
				login.setSenha("1357");
				
				facade = new Facade();
				facade.salvarLogin(login);
				
				
			}
			

		}


