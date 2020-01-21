package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Produto;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.entity.Venda;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanVenda")
@RequestScoped

public class BeanVenda {

	private Venda venda;
	private Empresa empresa;
	private Usuario usuario;
	private Produto produto;
	
	private List<Usuario> usuarios;
	private List<Empresa> empresas;
	private List<Venda> vendas;
	private List<Produto> produtos;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Empresa getEmpresa() {
		return empresa;

	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;

	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;

	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;

	}

	public BeanVenda() {
		venda = new Venda();
		empresa = new Empresa();
		usuario = new Usuario();
		produto = new Produto();
		
		this.empresas = new ArrayList<Empresa>();
		this.vendas = new ArrayList<Venda>();
		this.usuarios = new ArrayList<Usuario>();
		this.produtos = new ArrayList<Produto>();
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String salvar() {

		if (venda.getVenda_id() == null || venda.getVenda_id() == 0) {
			Facade facade = new Facade();
			facade.salvarVenda(venda);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "SALVO ", "SALVO COM SUCESSO"));
		} else {
			Facade facade = new Facade();
			facade.editarVenda(venda);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Situacao alterado com sucesso: " + venda, ""));
		}
		return "CONSULTAR_VENDAS.xhtml";
	}

	public String Editar(Venda venda) {
		this.venda = venda;

		return "CADASTRAR_VENDAS.xhtml";
	}

	public void Excluir(Venda venda) {
		Facade facade = new Facade();
		facade.excluirVenda(venda.getVenda_id());

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, venda.toString(), "EXCLUIDA COM SUCESSO"));

	}

	public List<Usuario> getUsuarios() {
		this.usuarios = new ArrayList<Usuario>();
		Facade facade = new Facade();
		this.usuarios = facade.listarUsuario();
		return usuarios;
	}

	public List<Empresa> getEmpresas() {
		this.empresas = new ArrayList<Empresa>();
		Facade facade = new Facade();
		this.empresas = facade.listarEmpresa();
		return empresas;
	}

	public List<Venda> getVendas() {
		this.vendas = new ArrayList<Venda>();
		Facade facade = new Facade();
		this.vendas = facade.listarVenda();
		return vendas;
	}
	
	public List<Produto> getProdutos() {
		this.produtos = new ArrayList<Produto>();
		Facade facade = new Facade();
		this.produtos = facade.listarProduto();
		return produtos;
	}

	public String Novo() {

		return "CADASTRAR_VENDAS.xhtml";
	}

	public String Voltar() {

		return "PAGINA_PRINCIPAL.xhtml";
	}

}
