package br.edu.facear.crm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Origem_contato;
import br.edu.facear.crm.entity.Prioridade;
import br.edu.facear.crm.entity.Situacao;
import br.edu.facear.crm.entity.Tarefa;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanTarefa")
@RequestScoped

public class BeanTarefa {
	private Tarefa tarefa;

	private List<Tarefa> tarefas;
	private List<Origem_contato> origem_contatos;
	private List<Empresa> empresas;
	private List<Usuario> usuarios;
	private List<Prioridade> prioridades;
	private List<Situacao> situacoes;

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public List<Tarefa> getTarefas() {

		Facade facade = new Facade();
		tarefas=facade.listarTarefa();
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public List<Origem_contato> getOrigem_contatos() {
		Facade facade = new Facade();
		origem_contatos = facade.listarOrigem_contato();
		return origem_contatos;
	}

	public void setOrigem_contatos(List<Origem_contato> origem_contatos) {
		this.origem_contatos = origem_contatos;
	}

	public List<Empresa> getEmpresas() {
		Facade facade = new Facade();
		empresas = facade.listarEmpresa();
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Usuario> getUsuarios() {
		Facade facade = new Facade();
		usuarios = facade.listarUsuario();
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {

		this.usuarios = usuarios;
	}

	public List<Prioridade> getPrioridades() {

		Facade facade = new Facade();
		prioridades = facade.listarPrioridade();
		return prioridades;
	}

	public void setPrioridades(List<Prioridade> prioridades) {
		this.prioridades = prioridades;
	}

	public List<Situacao> getSituacoes() {

		Facade facade = new Facade();
		situacoes=facade.listarSituacao();
		return situacoes;
	}

	public void setSituacoes(List<Situacao> situacoes) {
		this.situacoes = situacoes;
	}

	public String Novo() {

		return "CADASTRAR_ATIVIDADES.xhtml";
	}

	public String Voltar() {

		return "PAGINA_PRINCIPAL.xhtml";
	}

	public String Salvar() {
		
		System.out.println("BEAN  salvar:" + tarefa.getTarefa_id());

		if ((tarefa.getTarefa_id() == null )||( tarefa.getTarefa_id() == 0)) {
			Facade facade = new Facade();

			facade.salvarTarefa(tarefa);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "SALVO COM SUCESSO", ""));
		} else {
			System.out.println("BEAN  Edita:" + tarefa.getTarefa_id());

			Facade facade = new Facade();
			facade.editarTarefa(tarefa);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Tarefa alterada com sucesso: " + tarefa, ""));
		}
		return "CONSULTAR_ATIVIDADES.xhtml";
	}

	public String Editar(Tarefa tarefa) {
		this.tarefa = tarefa;

		return "EDITAR_ATIVIDADES.xhtml";
	}

	public void Excluir(Tarefa tarefa) {
		Facade facade = new Facade();
		facade.excluirTarefa(tarefa.getTarefa_id());

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, tarefa.toString(), "EXCLUIDA COM SUCESSO"));

	}
	

	public String GravarSessaoSituacao() throws IOException {

		FacesContext.getCurrentInstance().getExternalContext().redirect("CADASTRAR_USUARIO.xhtml");

		return "recuperar";
	}

	public String GravarSessaoUsuario() throws IOException {

		FacesContext.getCurrentInstance().getExternalContext().redirect("CADASTRAR_USUARIO.xhtml");

		return "recuperar";
	}

	public String GravarSessaoPrioridade() throws IOException {

		FacesContext.getCurrentInstance().getExternalContext().redirect("CADASTRAR_PRIORIDADE.xhtml");

		return "recuperar";
	}

	public String GravarSessaoOrigem_contato() throws IOException {

		FacesContext.getCurrentInstance().getExternalContext().redirect("CADASTRAR_ORIGEM_CONTATOS.xhtml");

		return "recuperar";
	}

	public String GravarSessaoEmpresa() throws IOException {

		FacesContext.getCurrentInstance().getExternalContext().redirect("CADASTRAR_EMPRESA.xhtml");

		return "recuperar";
	}

	public BeanTarefa() {
		tarefa = new Tarefa();
	}

}
