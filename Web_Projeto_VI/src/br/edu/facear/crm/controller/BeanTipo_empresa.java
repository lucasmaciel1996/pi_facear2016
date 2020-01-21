package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.edu.facear.crm.entity.Tipo_empresa;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name="beanTipo_empresa")
@RequestScoped

public class BeanTipo_empresa{
	
		private Tipo_empresa tipo_empresa;
		private List<Tipo_empresa> tipo_empresas;

		public Tipo_empresa getTipo_empresa() {
			return tipo_empresa;
		}
		public void setTipo_empresa(Tipo_empresa tipo_empresa) {
			this.tipo_empresa = tipo_empresa;
		}
		public BeanTipo_empresa() {
			tipo_empresa = new Tipo_empresa();
		}
		
		public String salvar(){
			
			if (tipo_empresa.getTipo_empresa_id() == null || tipo_empresa.getTipo_empresa_id() == 0){		
				Facade facade = new Facade();
				facade.salvarTipo_empresa(tipo_empresa);
				
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								tipo_empresa.toString(), "SALVO COM SUCESSO"));
			}
			else{
				Facade facade = new Facade();
				facade.editarTipo_empresa(tipo_empresa);
				
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage("Tipo de empresa alterado com sucesso: " + tipo_empresa,"" ) );
			}
			return "CONSULTAR_TIPO_EMPRESA.xhtml";
		}
		
		public String editar(Tipo_empresa tipo_empresa){
			this.tipo_empresa = tipo_empresa;
			
			return "CADASTRAR_TIPO_EMPRESA.xhtmll";
		}	
		
		public void excluir(Tipo_empresa tipo_empresa){
			Facade facade = new Facade();
			facade.excluirTipo_empresa(tipo_empresa.getTipo_empresa_id());

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							tipo_empresa.toString(), "EXCLUIDA COM SUCESSO"));

		}
		
		
		
		public List<Tipo_empresa> getTipo_empresas() {
			this.tipo_empresas = new ArrayList<Tipo_empresa>();
			Facade facade = new Facade();
			this.tipo_empresas = facade.listarTipo_empresa();
			return tipo_empresas;
		}
		
		public void setTipo_empresas(Tipo_empresa tipo_empresas) {
			this.tipo_empresa = tipo_empresas;
		}
		
        public String novo(Tipo_empresa tipo_empresa){
			
			return "CADASTRAR_TIPO_EMPRESA.xhtml";		
		}
		
		public String voltar(Tipo_empresa tipo_empresa){
			
			return "PAGINA_PRINCIPAL.xhtml";
		}

      
	}





