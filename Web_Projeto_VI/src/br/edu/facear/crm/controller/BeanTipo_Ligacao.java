package br.edu.facear.crm.controller;

import java.util.ArrayList;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Tipo_ligacao;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanTipo_ligacao")
@RequestScoped
public class BeanTipo_Ligacao {

	private Tipo_ligacao tipo_ligacao;
	private List<Tipo_ligacao> tipo_ligacoes;

	public Tipo_ligacao getTipo_ligacao() {
		return tipo_ligacao;
	}

	public void setTipo_ligacao(Tipo_ligacao tipo_ligacao) {
		this.tipo_ligacao = tipo_ligacao;
	}

	public List<Tipo_ligacao> getTipo_ligacoes() {
		this.tipo_ligacoes = new ArrayList<Tipo_ligacao>();
		Facade facade = new Facade();
		tipo_ligacoes = facade.listarTipo_Ligacao();

		return tipo_ligacoes;
	}

	public void setTipo_ligacoes(List<Tipo_ligacao> tipo_ligacoes) {
		this.tipo_ligacoes = tipo_ligacoes;
	}

	public BeanTipo_Ligacao() {
		tipo_ligacao = new Tipo_ligacao();
		tipo_ligacoes = new ArrayList<Tipo_ligacao>();
	}

	public String salvar() {
		Facade facade = new Facade();
		System.out.println("Salvar Metodo :" + tipo_ligacao.getTipo_ligacao_id());
		if ((this.tipo_ligacao.getTipo_ligacao_id() == null) || (this.tipo_ligacao.getTipo_ligacao_id() == 0)) {
			System.out.println("Salvar :" + tipo_ligacao.getTipo_ligacao_id());
			facade.salvarTipo_Ligacao(tipo_ligacao);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "SALVO COM SUCESSO", "SALVO COM SUCESSO"));

			return "CONSULTAR_TIPO_LIGACAO.xhtml";
		} else {
			System.out.println("Editar :" + tipo_ligacao.getTipo_ligacao_id());
			facade.editarTipo_Ligacao(tipo_ligacao);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "ALTERADO COM SUCESSO", "ALTERADO COM SUCESSO"));

			return "CONSULTAR_TIPO_LIGACAO.xhtml";
		}

		// return "CONSULTAR_HISTORICO_LIGACAO.xhtml";
	}

	public void Excluir(Tipo_ligacao tipo_ligacao) {
		Facade facade = new Facade();
		facade.excluirTipo_Ligacao(tipo_ligacao.getTipo_ligacao_id());
	}

	public String novo() {
		return "CADASTRAR_TIPO_LIGACAO.xhtml";
	}

	public String Editar(Tipo_ligacao tipo_ligacao) {
		this.tipo_ligacao = tipo_ligacao;
		return "CADASTRAR_TIPO_LIGACAO.xhtml";
	}
	
	public String voltar() {
		return "PAGINA_PRINCIPAL.xhtml";
	}


}