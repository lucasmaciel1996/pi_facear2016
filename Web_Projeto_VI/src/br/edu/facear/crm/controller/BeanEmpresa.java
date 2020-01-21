package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Funcionario;
import br.edu.facear.crm.entity.Origem_contato;
import br.edu.facear.crm.entity.Tarefa;
import br.edu.facear.crm.entity.Tipo_comunicador;
import br.edu.facear.crm.entity.Tipo_contato;
import br.edu.facear.crm.entity.Tipo_empresa;
import br.edu.facear.crm.entity.Tipo_telefone;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanEmpresa")
@RequestScoped
public class BeanEmpresa {

	private Empresa empresa;
	private Tarefa tarefa;
	private Tipo_telefone tipo_telefone;
	private Tipo_comunicador tipo_comunicador;
	private Tipo_empresa tipo_empresa;
	private Tipo_contato tipo_contato;
	private Usuario usuario;
	private Funcionario funcionario;
	private Origem_contato origem_contato;
	private List<Empresa> empresas;
	private List<Tarefa> tarefas;
	private List<Tipo_telefone> tipo_telefones;
	private List<Tipo_comunicador> tipo_comunicadores;
	private List<Tipo_empresa> tipo_empresas;
	private List<Tipo_contato> tipo_contatos;
	private List<Usuario> usuarios;
	private List<Funcionario> funcionarios;
	private List<Origem_contato> origem_contatos;

	public void setTipo_empresas(List<Tipo_empresa> tipo_empresas) {
		this.tipo_empresas = tipo_empresas;
	}

	public void setTipo_contatos(List<Tipo_contato> tipo_contatos) {
		this.tipo_contatos = tipo_contatos;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public Tipo_empresa getTipo_empresa() {
		return tipo_empresa;
	}

	public void setTipo_empresa(Tipo_empresa tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}

	public Tipo_contato getTipo_contato() {
		return tipo_contato;
	}

	public void setTipo_contato(Tipo_contato tipo_contato) {
		this.tipo_contato = tipo_contato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setTipo_telefones(List<Tipo_telefone> tipo_telefones) {
		this.tipo_telefones = tipo_telefones;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public BeanEmpresa() {
		empresa = new Empresa();
		this.tipo_telefones = new ArrayList<Tipo_telefone>();
		this.tipo_comunicadores = new ArrayList<Tipo_comunicador>();
		this.tipo_empresas = new ArrayList<Tipo_empresa>();
		this.tipo_contatos = new ArrayList<Tipo_contato>();
		this.usuarios = new ArrayList<Usuario>();
		this.funcionarios = new ArrayList<Funcionario>();
		this.origem_contatos = new ArrayList<Origem_contato>();
		this.tarefas = new ArrayList<Tarefa>();

	}

	public String Salvar() {
		System.out.println("SALVAR"+ empresa.getEmpresa_id());

		//FacesContext facesContext = FacesContext.getCurrentInstance();

		if (empresa.getEmpresa_id() == null || empresa.getEmpresa_id() == 0) {
			Facade facade = new Facade();
			facade.salvarEmpresa(empresa);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, empresa.toString(), "SALVO COM SUCESSO"));

		} else {
			Facade facade = new Facade();
			facade.editarEmpresa(empresa);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Situacao alterado com sucesso: " + empresa, ""));
		}
		return "sucesso";
		// return "CONSULTAR_EMPRESA.xhtml";
	}

	public String Editar(Empresa empresa) {
		this.empresa = empresa;

		return "CADASTRAR_EMPRESA.xhtmll";
	}

	public void Excluir(Empresa empresa) {
		Facade facade = new Facade();
		facade.excluirEmpresa(empresa.getEmpresa_id());

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, empresa.toString(), "EXCLUIDA COM SUCESSO"));
	}

	public List<Empresa> getEmpresas() {
		this.empresas = new ArrayList<Empresa>();
		Facade facade = new Facade();
		this.empresas = facade.listarEmpresa();
		return empresas;
	}

	public List<Tipo_telefone> getTipo_telefones() {
		this.tipo_telefones = new ArrayList<Tipo_telefone>();
		Facade facade = new Facade();
		this.tipo_telefones = facade.listarTipo_telefone();
		return tipo_telefones;
	}

	public List<Tipo_comunicador> getTipo_comunicadores() {
		this.tipo_comunicadores = new ArrayList<Tipo_comunicador>();
		Facade facade = new Facade();
		this.tipo_comunicadores = facade.listarTipo_comunicador();
		return tipo_comunicadores;
	}

	public List<Tipo_empresa> getTipo_empresas() {
		this.tipo_empresas = new ArrayList<Tipo_empresa>();
		Facade facade = new Facade();
		this.tipo_empresas = facade.listarTipo_empresa();
		return tipo_empresas;
	}

	public List<Tipo_contato> getTipo_contatos() {
		this.tipo_contatos = new ArrayList<Tipo_contato>();
		Facade facade = new Facade();
		this.tipo_contatos = facade.listarTipo_contato();
		return tipo_contatos;
	}

	public List<Usuario> getUsuarios() {
		this.usuarios = new ArrayList<Usuario>();
		Facade facade = new Facade();
		this.usuarios = facade.listarUsuario();
		return usuarios;
	}

	public List<Funcionario> getFuncionarios() {
		this.funcionarios = new ArrayList<Funcionario>();
		Facade facade = new Facade();
		this.funcionarios = facade.listarFuncionario();
		return funcionarios;
	}

	public List<Origem_contato> getOrigem_contatos() {
		this.origem_contatos = new ArrayList<Origem_contato>();
		Facade facade = new Facade();
		this.origem_contatos = facade.listarOrigem_contato();
		return origem_contatos;
	}

	public List<Tarefa> getTarefas() {
		this.tarefas = new ArrayList<Tarefa>();
		Facade facade = new Facade();
		this.tarefas = facade.listarTarefa();
		return tarefas;
	}

	public void setEmpresas(Empresa empresas) {
		this.empresa = empresas;
	}

	public String Novo() {

		return "CADASTRAR_EMPRESA.xhtml";
	}

	public String Voltar() {

		return "PAGINA_PRINCIPAL.xhtml";
	}

	public Tipo_telefone getTipo_telefone() {
		return tipo_telefone;
	}

	public void setTipo_telefone(Tipo_telefone tipo_telefone) {
		this.tipo_telefone = tipo_telefone;
	}

	public void setTelefones(List<Tipo_telefone> tipo_telefones) {
		this.tipo_telefones = tipo_telefones;
	}

	public void setTipo_comunicadores(List<Tipo_comunicador> tipo_comunicadores) {
		this.tipo_comunicadores = tipo_comunicadores;
	}

	public Tipo_comunicador getTipo_comunicador() {
		return tipo_comunicador;
	}

	public void setTipo_comunicador(Tipo_comunicador tipo_comunicador) {
		this.tipo_comunicador = tipo_comunicador;
	}

	public void setOrigem_contatos(List<Origem_contato> origem_contatos) {
		this.origem_contatos = origem_contatos;
	}

	public Origem_contato getOrigem_contato() {
		return origem_contato;
	}

	public void setOrigem_contato(Origem_contato origem_contato) {
		this.origem_contato = origem_contato;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

}
