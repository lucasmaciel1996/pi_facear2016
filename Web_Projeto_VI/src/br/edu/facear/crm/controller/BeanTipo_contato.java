package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Tipo_contato;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name="beanTipo_contato")
@RequestScoped

public class BeanTipo_contato{
	
		private Tipo_contato tipo_contato;
		private List<Tipo_contato> tipo_contatos;

		public Tipo_contato getTipo_contato() {
			return tipo_contato;
		}
		public void setTipo_contato(Tipo_contato tipo_contato) {
			this.tipo_contato = tipo_contato;
		}
		public BeanTipo_contato() {
			tipo_contato = new Tipo_contato();
		}
		
		public String salvar(){
			
			if (tipo_contato.getTipo_contato_id() == null || tipo_contato.getTipo_contato_id() == 0){		
				Facade facade = new Facade();
				facade.salvarTipo_contato(tipo_contato);
				
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								tipo_contato.toString(), "SALVO COM SUCESSO"));
			}
			else{
				Facade facade = new Facade();
				facade.editarTipo_contato(tipo_contato);
				
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage("Tipo de telefone alterado com sucesso: " + tipo_contato,"" ) );
			}
			return "CONSULTAR_TIPO_CONTATO.xhtml";
		}
		
		public String editar(Tipo_contato tipo_contato){
			this.tipo_contato = tipo_contato;
			
			return "CADASTRAR_TIPO_CONTATO.xhtmll";
		}	
		
		public void excluir(Tipo_contato tipo_contato){
			Facade facade = new Facade();
			facade.excluirTipo_contato(tipo_contato.getTipo_contato_id());

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							tipo_contato.toString(), "EXCLUIDA COM SUCESSO"));

		}
		
		
		
		public List<Tipo_contato> getTipo_contatos() {
			this.tipo_contatos = new ArrayList<Tipo_contato>();
			Facade facade = new Facade();
			this.tipo_contatos = facade.listarTipo_contato();
			return tipo_contatos;
		}
		
		public void setTipo_contatos(Tipo_contato tipo_contatos) {
			this.tipo_contato = tipo_contatos;
		}
		
        public String novo(Tipo_contato tipo_contato){
			
			return "CADASTRAR_TIPO_CONTATO.xhtml";		
		}
		
		public String voltar(Tipo_contato tipo_contato){
			
			return "PAGINA_PRINCIPAL.xhtml";
		}

	}

