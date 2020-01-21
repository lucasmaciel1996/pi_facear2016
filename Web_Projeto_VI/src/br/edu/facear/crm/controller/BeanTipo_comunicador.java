package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.edu.facear.crm.entity.Tipo_comunicador;
import br.edu.facear.crm.facade.Facade;

	@ManagedBean(name="beanTipo_comunicador")
	@RequestScoped
	
	public class BeanTipo_comunicador {
		

		private Tipo_comunicador tipo_comunicador;
		private List<Tipo_comunicador>tipo_comunicadores;

		public Tipo_comunicador getTipo_comunicador() {
			return tipo_comunicador;
		}
		public void setTipo_comunicador(Tipo_comunicador tipo_comunicador) {
			this.tipo_comunicador = tipo_comunicador;
		}
		public BeanTipo_comunicador() {
			tipo_comunicador = new Tipo_comunicador();
		}
		
		public String salvar(){
			
			if (tipo_comunicador.getTipo_comunicador_id() == null || tipo_comunicador.getTipo_comunicador_id() == 0){		
				Facade facade = new Facade();
				facade.salvarTipo_comunicador(tipo_comunicador);
				
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								tipo_comunicador.toString(), "SALVO COM SUCESSO"));
			}
			else{
				Facade facade = new Facade();
				facade.editarTipo_comunicador(tipo_comunicador);
				
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage("Tipo de comunicador alterado com sucesso: " + tipo_comunicador,"" ) );
			}
			return "CONSULTAR_TIPO_COMUNICADOR.xhtml";
		}
		
		public String editar(Tipo_comunicador tipo_comunicador){
			this.tipo_comunicador = tipo_comunicador;
			
			return "CADASTRAR_TIPO_COMUNICADOR.xhtmll";
		}	
		
		public void excluir(Tipo_comunicador tipo_comunicador){
			Facade facade = new Facade();
			facade.excluirTipo_comunicador(tipo_comunicador.getTipo_comunicador_id());

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							tipo_comunicador.toString(), "EXCLUIDA COM SUCESSO"));

		}
		
		
		
		public List<Tipo_comunicador> getTipo_comunicadores() {
			this.tipo_comunicadores = new ArrayList<Tipo_comunicador>();
			Facade facade = new Facade();
			this.tipo_comunicadores = facade.listarTipo_comunicador();
			return tipo_comunicadores;
		}
		
		public void setTipo_comunicadores(Tipo_comunicador tipo_comunicadores) {
			this.tipo_comunicador = tipo_comunicadores;
		}
		
        public String novo(Tipo_comunicador tipo_comunicador){
			
			return "CADASTRAR_TIPO_COMUNICADOR.xhtml";		
		}
		
		public String voltar(Tipo_comunicador tipo_comunicador){
			
			return "PAGINA_PRINCIPAL.xhtml";
		}

       
	}

