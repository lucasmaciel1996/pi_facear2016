package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.edu.facear.crm.entity.Origem_contato;
import br.edu.facear.crm.facade.Facade;

	
@ManagedBean(name="beanOrigem_contato")
@RequestScoped

public class BeanOrigem_contato{
	
		private Origem_contato origem_contato;
		private List<Origem_contato> origem_contatos;

		public Origem_contato getOrigem_contato() {
			return origem_contato;
		}
		public void setOrigem_contato(Origem_contato origem_contato) {
			this.origem_contato = origem_contato;
		}
		public BeanOrigem_contato() {
			origem_contato = new Origem_contato();
		}
		
		public String salvar(){
			
			FacesContext facesContext = FacesContext.getCurrentInstance();
			
			if (origem_contato.getOrigem_contato_id() == null ||origem_contato.getOrigem_contato_id() == 0){		
				Facade facade = new Facade();
				facade.salvarOrigem_contato(origem_contato);
				
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								origem_contato.toString(), "SALVO COM SUCESSO"));
				
				return "origem_contato";
			}
			else{
				Facade facade = new Facade();
				facade.editarOrigem_contato(origem_contato);
				
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage("Origem de contato alterado com sucesso: " + origem_contato,"" ) );
			}
			return "CONSULTAR_ORIGEM_CONTATOS.xhtml";
		}
		
		public String editar(Origem_contato origem_contato){
			this.origem_contato = origem_contato;
			
			return "CONSULTAR_ORIGEM_CONTATOS.xhtmll";
		}	
		
		public void excluir(Origem_contato origem_contato){
			Facade facade = new Facade();
			facade.excluirOrigem_contato(origem_contato.getOrigem_contato_id());

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							origem_contato.toString(), "EXCLUIDA COM SUCESSO"));

		}
		
		public List<Origem_contato> getOrigem_contatos() {
			this.origem_contatos = new ArrayList<Origem_contato>();
			Facade facade = new Facade();
			this.origem_contatos = facade.listarOrigem_contato();
			return origem_contatos;
		}
		
		public void setOrigem_contatos(Origem_contato origem_contatos) {
			this.origem_contato = origem_contatos;
		}
		
        public String novo(Origem_contato origem_contato){
			
			return "CADASTRAR_ORIGEM_CONTATOS.xhtml";		
		}
		
		public String voltar(Origem_contato origem_contato){
			
			return "PAGINA_PRINCIPAL.xhtml";
		}

	}

