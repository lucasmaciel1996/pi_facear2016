package br.edu.facear.crm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Situacao;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanSituacao")
@RequestScoped
public class BeanSituacao {

	private Situacao situacao;
	private List<Situacao> situacoes;
	private String tela;

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public BeanSituacao() {
		situacao = new Situacao();
	}

	public String salvar() {

		FacesContext facesContext = FacesContext.getCurrentInstance();

		if (situacao.getSituacao_id() == null || situacao.getSituacao_id() == 0) {
			Facade facade = new Facade();
			facade.salvarSituacao(situacao);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, situacao.toString(), "SALVO COM SUCESSO"));
			
			if (tela == null || tela.equals("")) {
				
				tela = "CONSULTAR_SITUACAO.xhtml";
			}
			
			return tela;

		} else {
			
			Facade facade = new Facade();
			facade.editarSituacao(situacao);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Situacao alterado com sucesso: " + situacao, ""));

		}
		return "sucesso";

	}

	public String editar(Situacao situacao) {
		this.situacao = situacao;

		return "CADASTRAR_SITUACAO.xhtml";
	}

	public void excluir(Situacao situacao) {
		Facade facade = new Facade();
		facade.excluirSituacao(situacao.getSituacao_id());

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, situacao.toString(), "EXCLUIDA COM SUCESSO"));

	}

	public List<Situacao> getSituacoes() {
		this.situacoes = new ArrayList<Situacao>();
		Facade facade = new Facade();
		this.situacoes = facade.listarSituacao();
		return situacoes;
	}

	public void setSituacoes(Situacao situacoes) {
		this.situacao = situacoes;
	}

	public String novo(Situacao situacao) {

		return "CADASTRAR_SITUACAO.xhtml";
	}

	public String voltar(Situacao situacao) {

		return "PAGINA_PRINCIPAL.xhtml";
	}

	/*public String GravarSessaoSituacao() throws IOException {

		FacesContext.getCurrentInstance().getExternalContext().redirect("CADASTRAR_SITUACAO.xhtml");

		return "chamar";
	}
	*/
	public String GravarSessaoSituacaoRedirecionar() throws IOException {

		tela = "CADASTRAR_ATIVIDADES.xhtml";

		return "CADASTRAR_SITUACAO.xhtml";
	}


	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public void setSituacoes(List<Situacao> situacoes) {
		this.situacoes = situacoes;
	}

	
	
	
}
