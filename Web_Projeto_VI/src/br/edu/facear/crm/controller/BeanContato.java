package br.edu.facear.crm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Contato;
import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Tipo_contato;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanContato")
@RequestScoped

public class BeanContato {

	private Contato contato;
	private Empresa empresa;
	
	private List<Contato> contatos;
	private List<Empresa> empresas;

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public void setContatos(Contato contatos) {
		this.contato = contatos;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public BeanContato() {
		contato = new Contato();
		this.empresas = new ArrayList<Empresa>();
	}

	public String salvar() {

		if (contato.getId_contato() == null || contato.getId_contato() == 0) {
			Facade facade = new Facade();
			facade.salvarContato(contato);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, contato.toString(), "SALVO COM SUCESSO"));
		} else {
			Facade facade = new Facade();
			facade.editarContato(contato);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Contato alterado com sucesso: " + contato, ""));
		}
		return "CONSULTAR_CONTATOS.xhtml";
	}

	public String editar(Contato contato) {
		this.contato = contato;

		return "CADASTRAR_CONTATO.xhtmll";
	}

	public void excluir(Contato contato) {
		Facade facade = new Facade();
		facade.excluirContato(contato.getId_contato());

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, contato.toString(), "EXCLUIDO COM SUCESSO"));

	}

	public List<Contato> getContatos() {
		this.contatos = new ArrayList<Contato>();
		Facade facade = new Facade();
		this.contatos = facade.listarContato();
		return contatos;
	}

	public List<Empresa> getEmpresas() {
		this.empresas = new ArrayList<Empresa>();
		Facade facade = new Facade();
		this.empresas = facade.listarEmpresa();
		return empresas;
	}

	public String novo(Contato contato) {

		return "CADASTRAR_CONTATO.xhtml";
	}

	public String voltar(Contato contato) {

		return "PAGINA_PRINCIPAL.xhtml";
	}
	
	

}