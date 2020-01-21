package br.edu.facear.crm.facade;


import java.util.List;

import br.edu.facear.crm.bo.ContatoBO;
import br.edu.facear.crm.bo.EmpresaBO;
import br.edu.facear.crm.bo.FuncionarioBO;
import br.edu.facear.crm.bo.Historico_ligacao_BO;
import br.edu.facear.crm.bo.LoginBO;
import br.edu.facear.crm.bo.Origem_contatoBO;
import br.edu.facear.crm.bo.PrioridadeBO;
import br.edu.facear.crm.bo.ProdutoBO;
import br.edu.facear.crm.bo.Produtos_vendaBO;
import br.edu.facear.crm.bo.SituacaoBO;
import br.edu.facear.crm.bo.TarefaBO;
import br.edu.facear.crm.bo.Tipo_Ligacao_BO;
import br.edu.facear.crm.bo.Tipo_comunicadorBO;
import br.edu.facear.crm.bo.Tipo_contatoBO;
import br.edu.facear.crm.bo.Tipo_empresaBO;
import br.edu.facear.crm.bo.Tipo_telefoneBO;
import br.edu.facear.crm.bo.UsuarioBO;
import br.edu.facear.crm.bo.VendaBO;
import br.edu.facear.crm.dao.Tipo_telefoneDao;
import br.edu.facear.crm.entity.Contato;
import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Funcionario;
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


public class Facade {
		
		
		public void salvarTipo_telefone(Tipo_telefone tipo_telefone){
			Tipo_telefoneBO tipo_telefoneBO = new Tipo_telefoneBO();
			tipo_telefoneBO.salvar(tipo_telefone);
		}
		
		public List<Tipo_telefone> listarTipo_telefone() {
			Tipo_telefoneBO tipo_telefoneBO = new Tipo_telefoneBO();
			return tipo_telefoneBO.listar();
		}
		
		public void editarTipo_telefone(Tipo_telefone tipo_telefone) {
			Tipo_telefoneBO tipo_telefoneBO = new Tipo_telefoneBO();
			tipo_telefoneBO.editar(tipo_telefone);
		}

		public Tipo_telefone getObjectByIdtipo_telefone(Long id) {		
			Tipo_telefoneBO tipo_telefoneBO = new Tipo_telefoneBO();
			return tipo_telefoneBO.getObjectById(id);
		}
		
		public void excluirTipo_telefone(Long id) {		
			Tipo_telefoneBO tipo_telefoneBO = new Tipo_telefoneBO();
			tipo_telefoneBO.excluir(id);
		}
		
		public void novo(Tipo_telefone tipo_telefone) {
			Tipo_telefoneDao tipo_telefoneDAO = new Tipo_telefoneDao();
			tipo_telefoneDAO.novo(tipo_telefone);
		}
		
		public void voltar(Tipo_telefone tipo_telefone) {
			Tipo_telefoneDao tipo_telefoneDAO = new Tipo_telefoneDao();
			tipo_telefoneDAO.voltar(tipo_telefone);
		}
		
		
		
// METODOS TIPO_COMUNICADOR ****************************************************************************************
		
		public void salvarTipo_comunicador(Tipo_comunicador tipo_comunicador){
			Tipo_comunicadorBO tipo_comunicadorBO = new Tipo_comunicadorBO();
			tipo_comunicadorBO.salvar(tipo_comunicador);
		}
		
		public List<Tipo_comunicador> listarTipo_comunicador() {
			Tipo_comunicadorBO tipo_comunicadorBO = new Tipo_comunicadorBO();
			return tipo_comunicadorBO.listar();
		}
		
		public void editarTipo_comunicador(Tipo_comunicador tipo_comunicador) {
			Tipo_comunicadorBO tipo_comunicadorBO = new Tipo_comunicadorBO();
			tipo_comunicadorBO.editar(tipo_comunicador);
		}

		public Tipo_comunicador getObjectByIdtipo_comunicador(Long id) {		
			Tipo_comunicadorBO tipo_comunicadorBO = new Tipo_comunicadorBO();
			return tipo_comunicadorBO.getObjectById(id);
		}
		
		public void excluirTipo_comunicador(Long id) {		
			Tipo_comunicadorBO tipo_comunicadorBO = new Tipo_comunicadorBO();
			tipo_comunicadorBO.excluir(id);
		}
		
		public void novo(Tipo_comunicador tipo_comunicador) {
			Tipo_comunicadorBO tipo_comunicadorBO= new Tipo_comunicadorBO();
			tipo_comunicadorBO.novo(tipo_comunicador);
		}
		
		public void voltar(Tipo_comunicador tipo_comunicador) {
			Tipo_comunicadorBO tipo_comunicadorBO = new Tipo_comunicadorBO();
			tipo_comunicadorBO.voltar(tipo_comunicador);
		}
		
	
		
// METODOS TIPO_EMPRESA ****************************************************************************************************
		
		public void salvarTipo_empresa(Tipo_empresa tipo_empresa){
			Tipo_empresaBO tipo_empresaBO = new Tipo_empresaBO();
			tipo_empresaBO.salvar(tipo_empresa);
		}
		
		public List<Tipo_empresa> listarTipo_empresa() {
			Tipo_empresaBO tipo_empresaBO = new Tipo_empresaBO();
			return tipo_empresaBO.listar();
		}
		
		public void editarTipo_empresa(Tipo_empresa tipo_empresa) {
			Tipo_empresaBO tipo_empresaBO = new Tipo_empresaBO();
			tipo_empresaBO.editar(tipo_empresa);
		}

		public Tipo_empresa getObjectByIdtipo_empresa(Long id) {		
			Tipo_empresaBO tipo_empresaBO = new Tipo_empresaBO();
			return tipo_empresaBO.getObjectById(id);
		}
		
		public void excluirTipo_empresa(Long id) {		
			Tipo_empresaBO tipo_empresaBO = new Tipo_empresaBO();
			tipo_empresaBO.excluir(id);
		}
		
		public void novo(Tipo_empresa tipo_empresa) {
			Tipo_empresaBO tipo_empresaBO= new Tipo_empresaBO();
			tipo_empresaBO.novo(tipo_empresa);
		}
		
		public void voltar(Tipo_empresa tipo_empresa) {
			Tipo_empresaBO tipo_empresaBO = new Tipo_empresaBO();
			tipo_empresaBO.voltar(tipo_empresa);
		}
		
// METODOS TIPO_CONTATO **************************************************************************************************
		
		public void salvarTipo_contato(Tipo_contato tipo_contato){
			Tipo_contatoBO tipo_contatoBO = new Tipo_contatoBO();
			tipo_contatoBO.salvar(tipo_contato);
		}
		
		public List<Tipo_contato> listarTipo_contato() {
			Tipo_contatoBO tipo_contatoBO = new Tipo_contatoBO();
			return tipo_contatoBO.listar();
		}
		
		public void editarTipo_contato(Tipo_contato tipo_contato) {
			Tipo_contatoBO tipo_contatoBO = new Tipo_contatoBO();
			tipo_contatoBO.editar(tipo_contato);
		}

		public Tipo_contato getObjectByIdtipo_contato(Long id) {		
			Tipo_contatoBO tipo_contatoBO = new Tipo_contatoBO();
			return tipo_contatoBO.getObjectById(id);
		}
		
		public void excluirTipo_contato(Long id) {		
			Tipo_contatoBO tipo_contatoBO = new Tipo_contatoBO();
			tipo_contatoBO.excluir(id);
		}
		
		public void novo(Tipo_contato tipo_contato) {
			Tipo_contatoBO tipo_contatoBO= new Tipo_contatoBO();
			tipo_contatoBO.novo(tipo_contato);
		}
		
		public void voltar(Tipo_contato tipo_contato) {
			Tipo_contatoBO tipo_contatoBO = new Tipo_contatoBO();
			tipo_contatoBO.voltar(tipo_contato);
		}
		
// METODOS ORIGEM_CONTATO **************************************************************************************************
		
		public void salvarOrigem_contato(Origem_contato origem_contato){
			Origem_contatoBO origem_contatoBO = new Origem_contatoBO();
			origem_contatoBO.salvar(origem_contato);
		}
		
		public List<Origem_contato> listarOrigem_contato() {
			Origem_contatoBO origem_contatoBO = new Origem_contatoBO();
			return origem_contatoBO.listar();
		}
		
		public void editarOrigem_contato(Origem_contato origem_contato) {
			Origem_contatoBO origem_contatoBO = new Origem_contatoBO();
			origem_contatoBO.editar(origem_contato);
		}

		public Origem_contato getObjectByIdorigem_contato(Long id) {		
			Origem_contatoBO origem_contatoBO = new Origem_contatoBO();
			return origem_contatoBO.getObjectById(id);
		}
		
		public void excluirOrigem_contato(Long id) {		
			Origem_contatoBO origem_contatoBO = new Origem_contatoBO();
			origem_contatoBO.excluir(id);
		}
		
		public void novo(Origem_contato origem_contato) {
			Origem_contatoBO origem_contatoBO= new Origem_contatoBO();
			origem_contatoBO.novo(origem_contato);
		}
		
		public void voltar(Origem_contato origem_contato) {
			Origem_contatoBO origem_contatoBO = new Origem_contatoBO();
			origem_contatoBO.voltar(origem_contato);
		}
		
// METODOS SITUACAO **************************************************************************************************
		
		public void salvarSituacao(Situacao situacao){	
			SituacaoBO situacaoBO = new SituacaoBO();
			situacaoBO.salvar(situacao);		
		}
		
		public List<Situacao> listarSituacao() {
			SituacaoBO situacaoBO = new SituacaoBO();
			return situacaoBO.listar();
		}
		
		public void editarSituacao(Situacao situacao) {
			SituacaoBO situacaoBO = new SituacaoBO();
			situacaoBO.editar(situacao);
		}

		public Situacao getObjectByIdsituacao(Long id) {		
			SituacaoBO situacaoBO = new SituacaoBO();
			return situacaoBO.getObjectById(id);
		}
		
		public void excluirSituacao(Long id) {		
			SituacaoBO situacaoBO = new SituacaoBO();
			situacaoBO.excluir(id);
		}
		
		public void novoSituacao(Situacao situacao) {
			SituacaoBO situacaoBO = new SituacaoBO();
			situacaoBO.novo(situacao);
		}
		
		public void voltarSituacao(Situacao situacao) {
			SituacaoBO situacaoBO = new SituacaoBO();
			situacaoBO.voltar(situacao);
		}
		
// METODOS PRODUTO **************************************************************************************************
		
		public void salvarProduto(Produto produto){	
			ProdutoBO produtoBO = new ProdutoBO();
			produtoBO.salvar(produto);		
		}
		
		public List<Produto> listarProduto() {
			ProdutoBO produtoBO = new ProdutoBO();
			return produtoBO.listar();
		}
		
		public void editarProduto(Produto produto) {
			ProdutoBO produtoBO = new ProdutoBO();
			produtoBO.editar(produto);
		}

		public Produto getObjectByIdProduto(Long id) {		
			ProdutoBO produtoBO = new ProdutoBO();
			return produtoBO.getObjectById(id);
		}
		
		public void excluirProduto(Long id) {		
			ProdutoBO produtoBO = new ProdutoBO();
			produtoBO.excluir(id);
		}
		
		public void novoProduto(Produto produto) {
			ProdutoBO produtoBO = new ProdutoBO();
			produtoBO.novo(produto);
		}
		
		public void voltarProduto(Produto produto) {
			ProdutoBO produtoBO = new ProdutoBO();
			produtoBO.voltar(produto);
		}
		
		
// METODOS VENDAS **************************************************************************************************
		
		
		public void salvarVenda(Venda venda){	
			VendaBO vendaBO = new VendaBO();
			vendaBO.salvar(venda);		
		}
		
		public List<Venda> listarVenda() {
			VendaBO vendaBO = new VendaBO();
			return vendaBO.listar();
		}
		
		public void editarVenda(Venda venda) {
			VendaBO vendaBO = new VendaBO();
			vendaBO.editar(venda);
		}

		public Venda getObjectByIdVenda(Long id) {		
			VendaBO vendaBO = new VendaBO();
			return vendaBO.getObjectById(id);
		}
		
		public void excluirVenda(Long id) {		
			VendaBO vendaBO = new VendaBO();
			vendaBO.excluir(id);
		}
		
		public void novoVenda(Venda venda) {
			VendaBO vendaBO = new VendaBO();
			vendaBO.novo(venda);
		}
		
		public void voltarVenda(Venda venda) {
			VendaBO vendaBO = new VendaBO();
			vendaBO.voltar(venda);
		}
		
// METODOS EMPRESA **************************************************************************************************
		
		public void salvarEmpresa(Empresa empresa){	
			EmpresaBO empresaBO = new EmpresaBO();
			empresaBO.salvar(empresa);		
		}
		
		public List<Empresa> listarEmpresa() {
			EmpresaBO empresaBO = new EmpresaBO();
			return empresaBO.listar();
		}
		
		public void editarEmpresa(Empresa empresa) {
			EmpresaBO empresaBO = new EmpresaBO();
			empresaBO.editar(empresa);
		}

		public Empresa getObjectByIdEmpresa(Long id) {		
			EmpresaBO empresaBO = new EmpresaBO();
			return empresaBO.getObjectById(id);
		}
		
		public void excluirEmpresa(Long id) {		
			EmpresaBO empresaBO = new EmpresaBO();
			empresaBO.excluir(id);
		}
		
		public void novoEmpresa(Empresa empresa) {
			EmpresaBO empresaBO = new EmpresaBO();
			empresaBO.novo(empresa);
		}
		
		public void voltarEmpresa(Empresa empresa) {
			EmpresaBO empresaBO = new EmpresaBO();
			empresaBO.voltar(empresa);
		}
		
// METODOS USUARIO **************************************************************************************************
		
		public void salvarUsuario(Usuario usuario){	
			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.salvar(usuario);		
		}
		
		public List<Usuario> listarUsuario() {
			UsuarioBO usuarioBO = new UsuarioBO();
			return usuarioBO.listar();
		}
		
		public void editarUsuario(Usuario usuario) {
			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.editar(usuario);
		}

		public Usuario getObjectByIdUsuario(Long id) {		
			UsuarioBO usuarioBO = new UsuarioBO();
			return usuarioBO.getObjectById(id);
		}
		
		public void excluirUsuario(Long id) {		
			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.excluir(id);
		}
		
		public void novoUsuario(Usuario usuario) {
			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.novo(usuario);
		}
		
		public void voltarUsuario(Usuario usuario) {
			UsuarioBO usuarioBO = new UsuarioBO();
			usuarioBO.voltar(usuario);
		}
		
// METODOS FUNCIONARIO **************************************************************************************************
		
		public void salvarFuncionario(Funcionario funcionario){	
			FuncionarioBO funcionarioBO = new FuncionarioBO();
			funcionarioBO.salvar(funcionario);		
		}
		
		public List<Funcionario> listarFuncionario() {
			FuncionarioBO funcionarioBO = new FuncionarioBO();
			return funcionarioBO.listar();
		}
		
		public void editarFuncionario(Funcionario funcionario) {
			FuncionarioBO funcionarioBO = new FuncionarioBO();
			funcionarioBO.editar(funcionario);
		}

		public Funcionario getObjectByIdFuncionario(Long id) {		
			FuncionarioBO funcionarioBO = new FuncionarioBO();
			return funcionarioBO.getObjectById(id);
		}
		
		public void excluirFuncionario(Long id) {		
			FuncionarioBO funcionarioBO = new FuncionarioBO();
			funcionarioBO.excluir(id);
		}
		
		public void novoFuncionario(Funcionario funcionario) {
			FuncionarioBO funcionarioBO = new FuncionarioBO();
			funcionarioBO.novo(funcionario);
		}
		
		public void voltarFuncionario(Funcionario funcionario) {
			FuncionarioBO funcionarioBO = new FuncionarioBO();
			funcionarioBO.voltar(funcionario);
		}
		
// METODOS TAREFA **************************************************************************************************
		
		public void salvarTarefa(Tarefa tarefa){	
			TarefaBO tarefaBO = new TarefaBO();
			tarefaBO.salvar(tarefa);		
		}
		
		public List<Tarefa> listarTarefa() {
			TarefaBO tarefaBO = new TarefaBO();
			return tarefaBO.listar();
		}
		
		public void editarTarefa(Tarefa tarefa) {
			TarefaBO tarefaBO = new TarefaBO();
			tarefaBO.editar(tarefa);
		}

		public Tarefa getObjectByIdTarefa(Long id) {		
			TarefaBO tarefaBO = new TarefaBO();;
			return tarefaBO.getObjectById(id);
		}
		
		public void excluirTarefa(Long id) {		
			TarefaBO tarefaBO = new TarefaBO();
			tarefaBO.excluir(id);
		}
	
// METODOS TAREFA **************************************************************************************************
		
		public void salvarProdutos_venda(Produtos_venda produtos_venda){	
			Produtos_vendaBO produtos_vendaBO = new Produtos_vendaBO();
			produtos_vendaBO.salvar(produtos_venda);	
		}
		
		public List<Produtos_venda> listarProdutos_venda() {
			Produtos_vendaBO produtos_vendaBO = new Produtos_vendaBO();
			return produtos_vendaBO.listar();
		}
		
		public void editarProdutos_venda(Produtos_venda produtos_venda) {
			Produtos_vendaBO produtos_vendaBO = new Produtos_vendaBO();
			produtos_vendaBO.editar(produtos_venda);
		}

		public Produtos_venda getObjectByIdProdutos_venda(Long id) {		
			Produtos_vendaBO produtos_vendaBO = new Produtos_vendaBO();
			return produtos_vendaBO.getObjectById(id);
		}
		
		public void excluirProdutos_venda(Long id) {		
			Produtos_vendaBO produtos_vendaBO = new Produtos_vendaBO();
			produtos_vendaBO.excluir(id);
		}
		
		public void novoProdutos_venda(Produtos_venda produtos_venda) {
			Produtos_vendaBO produtos_vendaBO = new Produtos_vendaBO();
			produtos_vendaBO.novo(produtos_venda);
		}
		
		public void voltarProdutos_venda(Produtos_venda produtos_venda) {
			Produtos_vendaBO produtos_vendaBO = new Produtos_vendaBO();
			produtos_vendaBO.voltar(produtos_venda);
		}
		
// METODOS PRIORIDADE **************************************************************************************************
		
		public void salvarPrioridade(Prioridade prioridade){	
			PrioridadeBO prioridadeBO = new PrioridadeBO();
			prioridadeBO.salvar(prioridade);		
		}
		
		public List<Prioridade> listarPrioridade() {
			PrioridadeBO prioridadeBO = new PrioridadeBO();
			return prioridadeBO.listar();
		}
		
		public void editarPrioridade(Prioridade prioridade) {
			PrioridadeBO prioridadeBO = new PrioridadeBO();
			prioridadeBO.editar(prioridade);
		}

		public Prioridade getObjectByPrioridade(Long id) {		
			PrioridadeBO prioridadeBO = new PrioridadeBO();
			return prioridadeBO.getObjectById(id);
		}
		
		public void excluirPrioridade(Long id) {		
			PrioridadeBO prioridadeBO = new PrioridadeBO();
			prioridadeBO.excluir(id);
		}
		
		public void novoPrioridade(Prioridade prioridade) {
			PrioridadeBO prioridadeBO = new PrioridadeBO();
			prioridadeBO.novo(prioridade);
		}
		
		public void voltarUsuario(Prioridade prioridade) {
			PrioridadeBO prioridadeBO = new PrioridadeBO();
			prioridadeBO.voltar(prioridade);
		}
		

// METODOS CONTATO **************************************************************************************************
		
				public void salvarContato(Contato contato){
					ContatoBO contatoBO = new ContatoBO();
				    contatoBO.salvar(contato);
				}
				
				public List<Contato> listarContato() {
					ContatoBO contatoBO = new ContatoBO();
					return contatoBO.listar();
				}
				
				public void editarContato(Contato contato) {
					ContatoBO contatoBO = new ContatoBO();
					contatoBO.editar(contato);
				}

				public Contato getObjectByIdContato(Long id) {		
					ContatoBO contatoBO = new ContatoBO();
					return contatoBO.getObjectById(id);
				}
				
				public void excluirContato(Long id) {		
					ContatoBO contatoBO = new ContatoBO();
					contatoBO.excluir(id);
				}
				
				public void novo(Contato contato) {
					ContatoBO contatoBO = new ContatoBO();
					contatoBO.novo(contato);
				}
				
				public void voltar(Contato contato) {
					ContatoBO contatoBO = new ContatoBO();
					contatoBO.voltar(contato);
				}
				
// METODOS HISTORICO LIGACAO
// ****************************************************************************************
				
				public void salvarHistorico_Ligacao(Historico_ligacao historico) {
					Historico_ligacao_BO historico_BO = new Historico_ligacao_BO();
					historico_BO.salvar(historico);
				}

				public List<Historico_ligacao> listarHistorico_Ligacao() {
					Historico_ligacao_BO historico_BO = new Historico_ligacao_BO();
					return historico_BO.listar();
				}

				public void editarHistorico_Ligacao(Historico_ligacao historico) {
					Historico_ligacao_BO historico_BO = new Historico_ligacao_BO();
					historico_BO.editar(historico);
				}

				public Historico_ligacao getObjectByIdHistorico_Ligacao(Long id) {
					Historico_ligacao_BO historico_BO = new Historico_ligacao_BO();
					return historico_BO.getObjectById(id);
				}

				public void excluirHistorico_Ligacao(Long id) {
					Historico_ligacao_BO historico_BO = new Historico_ligacao_BO();
					historico_BO.excluir(id);
				}

// METODOS TIPO_LIGACAO
// ****************************************************************************************************
				
				public void salvarTipo_Ligacao(Tipo_ligacao tipo_ligacao) {
					Tipo_Ligacao_BO tipo_ligacao_BO = new Tipo_Ligacao_BO();
					tipo_ligacao_BO.salvar(tipo_ligacao);
				}

				public List<Tipo_ligacao> listarTipo_Ligacao() {
					Tipo_Ligacao_BO tipo_ligacao_BO = new Tipo_Ligacao_BO();
					return tipo_ligacao_BO.listar();
				}

				public void editarTipo_Ligacao(Tipo_ligacao tipo_ligacao) {
					Tipo_Ligacao_BO tipo_ligacao_BO = new Tipo_Ligacao_BO();
					tipo_ligacao_BO.editar(tipo_ligacao);
				}

				public Tipo_ligacao getObjectByIdTipo_Ligacao(Long id) {
					Tipo_Ligacao_BO tipo_ligacao_BO = new Tipo_Ligacao_BO();
					return tipo_ligacao_BO.getObjectById(id);
				}

				public void excluirTipo_Ligacao(Long id) {
					Tipo_Ligacao_BO tipo_ligacao_BO = new Tipo_Ligacao_BO();
					tipo_ligacao_BO.excluir(id);
				}
				
// METODOS LOGIN
// ****************************************************************************************************
								
								public void salvarLogin(Login login) {
									LoginBO loginBO = new LoginBO();
									loginBO.salvar(login);
								}

								public List<Login> listarLogin() {
									LoginBO loginBO = new LoginBO();
									return loginBO.listar();
								}

								public void editarLogin(Login login) {
									LoginBO loginBO = new LoginBO();
									loginBO.editar(login);
								}

								public Login getObjectByIdLogin(Long id) {
									LoginBO loginBO = new LoginBO();
									return loginBO.getObjectBySenha(id);
								}
								
								public void excluirLogin(Long id) {
									LoginBO loginBO = new LoginBO();
									loginBO.excluir(id);
								}
								
		
	}

		
	