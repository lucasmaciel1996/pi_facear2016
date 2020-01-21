package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Produtos_venda;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.entity.Venda;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name="beanProdutos_venda")
@RequestScoped

public class BeanProdutos_venda{
	
		private Produtos_venda produtos_venda;
	
		private Venda venda;
		private Empresa empresa;
		private Usuario usuario;
		
		private List<Produtos_venda> produtos_vendas;
		private List<Usuario> usuarios;
		private List<Empresa> empresas;
		private List<Venda> vendas;
		
		
		
		public Produtos_venda getProdutos_venda() {
			return produtos_venda;
		}

		public void setProdutos_venda(Produtos_venda produtos_venda) {
			this.produtos_venda = produtos_venda;
		}

		public Venda getVenda() {
			return venda;
		}

		public void setVenda(Venda venda) {
			this.venda = venda;
		}

		public Empresa getEmpresa() {
			return empresa;
		}

		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public void setProdutos_vendas(List<Produtos_venda> produtos_vendas) {
			this.produtos_vendas = produtos_vendas;
		}

		public void setUsuarios(List<Usuario> usuarios) {
			this.usuarios = usuarios;
		}

		public void setEmpresas(List<Empresa> empresas) {
			this.empresas = empresas;
		}

		public void setVendas(List<Venda> vendas) {
			this.vendas = vendas;
		}

		public BeanProdutos_venda() {
			produtos_venda = new Produtos_venda();
			venda = new Venda();
			empresa = new Empresa();
			usuario = new Usuario();
			this.empresas = new ArrayList<Empresa>();
			this.vendas = new ArrayList<Venda>();
			this.usuarios = new ArrayList<Usuario>();
		}
		
		
		
		
        public String salvar(){
			
			if (produtos_venda.getProdutos_venda_id() == null || produtos_venda.getProdutos_venda_id() == 0){		
				Facade facade = new Facade();
				facade.salvarProdutos_venda(produtos_venda);
				
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								"SALVO ", "SALVO COM SUCESSO"));
			}
			else{
				Facade facade = new Facade();
				facade.editarProdutos_venda(produtos_venda);
				
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage("Produtos_venda alterado com sucesso: " + produtos_venda,"" ) );
			}
			return "CONSULTAR_VENDA.xhtml";
		}
		
		
		public String editar(Produtos_venda produtos_venda){
			this.produtos_venda =produtos_venda;
			
			return "EDITAR_ATIVIDADES.xhtmll";
		}	
		
		public void excluir(Produtos_venda produtos_venda){
			Facade facade = new Facade();
			facade.excluirProdutos_venda(produtos_venda.getProdutos_venda_id());

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							produtos_venda.toString(), "EXCLUIDA COM SUCESSO"));

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
		
		public List<Produtos_venda> getProdutos_vendas() {
			this.produtos_vendas = new ArrayList<Produtos_venda>();
			Facade facade = new Facade();
			this.produtos_vendas = facade.listarProdutos_venda();
			return produtos_vendas;
		}
			
		public String novo(Venda venda){
			
			return "CADASTRAR_VENDAS.xhtml";		
		}
		
		public String voltar(Venda venda){
			
			return "PAGINA_PRINCIPAL.xhtml";
		}
		

      
	}

