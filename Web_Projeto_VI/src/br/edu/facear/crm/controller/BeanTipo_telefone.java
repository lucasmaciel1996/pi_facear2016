package br.edu.facear.crm.controller;




import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.facear.crm.entity.Tipo_telefone;
import br.edu.facear.crm.facade.Facade;


	@ManagedBean(name="beanTipo_telefone")
	@RequestScoped
	
	public class BeanTipo_telefone{
		
			private Tipo_telefone tipo_telefone;
			private List<Tipo_telefone> tipo_telefones;

			public Tipo_telefone getTipo_telefone() {
				return tipo_telefone;
			}
			public void setTipo_telefone(Tipo_telefone tipo_telefone) {
				this.tipo_telefone = tipo_telefone;
			}
			public BeanTipo_telefone() {
				tipo_telefone = new Tipo_telefone();
			}
			
			public String salvar(){
				
				if (tipo_telefone.getTipo_telefone_id() == null || tipo_telefone.getTipo_telefone_id() == 0){		
					Facade facade = new Facade();
					facade.salvarTipo_telefone(tipo_telefone);
					
					FacesContext.getCurrentInstance().addMessage(null,
							new FacesMessage(FacesMessage.SEVERITY_INFO, 
									tipo_telefone.toString(), "SALVO COM SUCESSO"));
				}
				else{
					Facade facade = new Facade();
					facade.editarTipo_telefone(tipo_telefone);
					
					FacesContext.getCurrentInstance().addMessage(null, 
							new FacesMessage("Tipo de telefone alterado com sucesso: " + tipo_telefone,"" ) );
				}
				return "CONSULTAR_TIPO_TELEFONE.xhtml";
			}
			
			public String editar(Tipo_telefone tipo_telefone){
				this.tipo_telefone = tipo_telefone;
				
				return "CADASTRAR_TIPO_TELEFONE.xhtmll";
			}	
			
			public void excluir(Tipo_telefone tipo_telefone){
				Facade facade = new Facade();
				facade.excluirTipo_telefone(tipo_telefone.getTipo_telefone_id());

				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, 
								tipo_telefone.toString(), "EXCLUIDA COM SUCESSO"));

			}
			
			
			
			public List<Tipo_telefone> getTipo_telefones() {
				this.tipo_telefones = new ArrayList<Tipo_telefone>();
				Facade facade = new Facade();
				this.tipo_telefones = facade.listarTipo_telefone();
				return tipo_telefones;
			}
			
			public void setTipo_telefones(Tipo_telefone tipo_telefones) {
				this.tipo_telefone = tipo_telefones;
			}
			
            public String novo(Tipo_telefone tipo_telefone){
				
				return "CADASTRAR_TIPO_TELEFONE.xhtml";		
			}
			
			public String voltar(Tipo_telefone tipo_telefone){
				
				return "PAGINA_PRINCIPAL.xhtml";
			}

		}
	
