package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Produto;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name="beanProduto")
@RequestScoped

public class BeanProduto{
	
		private Produto produto;
		private List<Produto> produtos;

		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		public BeanProduto() {
			produto = new Produto();
		}
		
		public String salvar(){
			
			if (produto.getProduto_id() == null || produto.getProduto_id() == 0){		
				Facade facade = new Facade();
				facade.salvarProduto(produto);
				
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								produto.toString(), "SALVO COM SUCESSO"));
			}
			else{
				Facade facade = new Facade();
				facade.editarProduto(produto);
				
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage("Situacao alterado com sucesso: " + produto,"" ) );
			}
			return "CONSULTAR_PRODUTO.xhtml";
		}
		
		public String editar(Produto produto){
			this.produto = produto;
			
			return "CADASTRAR_PRODUTO.xhtmll";
		}	
		
		public void excluir(Produto produto){
			Facade facade = new Facade();
			facade.excluirProduto(produto.getProduto_id());

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							produto.toString(), "EXCLUIDA COM SUCESSO"));

		}
		
		
		
		public List<Produto> getProdutos() {
			this.produtos = new ArrayList<Produto>();
			Facade facade = new Facade();
			this.produtos= facade.listarProduto();
			return produtos;
		}
		
		public void setSituacoes(Produto produtos) {
			this.produto = produtos;
		}
		
        public String novo(Produto produto){
			
			return "CADASTRAR_PRODUTO.xhtml";		
		}
		
		public String voltar(Produto produto){
			
			return "PAGINA_PRINCIPAL.xhtml";
		}

      
	}

