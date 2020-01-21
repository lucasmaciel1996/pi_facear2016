package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Prioridade;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name="beanPrioridade")
@RequestScoped

public class BeanPrioridade{
	
		private Prioridade prioridade;
		private List<Prioridade> prioridades;

		
		public Prioridade getPrioridade() {
			return prioridade;
		}

		public void setPrioridade(Prioridade prioridade) {
			this.prioridade = prioridade;
		}

		public List<Prioridade> getPrioridades() {
			return prioridades;
		}

		public void setPrioridades(List<Prioridade> prioridades) {
			this.prioridades = prioridades;
		}

		public BeanPrioridade() {
			prioridade = new Prioridade();
			
		}
		
		public String salvar(){
			
			FacesContext facesContext = FacesContext.getCurrentInstance();
			
			if (prioridade.getPrioridade_id() == null || prioridade.getPrioridade_id() == 0){		
				Facade facade = new Facade();
				facade.salvarPrioridade(prioridade);
				
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								prioridade.toString(), "SALVO COM SUCESSO"));
				
				
			}
			else{
				Facade facade = new Facade();
				facade.editarPrioridade(prioridade);
				
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage("Prioridade alterada com sucesso: " + prioridade,"" ) );
			}
			return "prioridade";
			//return "CONSULTAR_PRIORIDADE.xhtml";
		}
		
		public String editar(Prioridade prioridade){
			this.prioridade = prioridade;
			
			return "CADASTRAR_Prioridade.xhtmll";
		}	
		
		public void excluir(Prioridade prioridade){
			Facade facade = new Facade();
			facade.excluirSituacao(prioridade.getPrioridade_id());

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							prioridade.toString(), "EXCLUIDA COM SUCESSO"));

		}
		
		
		
		public List<Prioridade> Prioridades() {
			this.prioridades = new ArrayList<Prioridade>();
			Facade facade = new Facade();
			this.prioridades= facade.listarPrioridade();
			return prioridades;
		}
		
		public void setSituacoes(Prioridade prioridades) {
			this.	prioridade = prioridades;
		}
		
        public String novo(Prioridade prioridade){
			
			return "CADASTRAR_PRIORIDADE.xhtml";		
		}
		
		public String voltar(Prioridade prioridade){
			
			return "PAGINA_PRINCIPAL.xhtml";
		}

      
	}





