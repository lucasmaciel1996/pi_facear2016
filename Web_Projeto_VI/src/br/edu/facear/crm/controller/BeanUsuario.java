package br.edu.facear.crm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanUsuario")
@RequestScoped

public class BeanUsuario {

	private String tela1;
	private Usuario usuario;

	private List<Usuario> usuarios;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public BeanUsuario() {
		usuario = new Usuario();
		this.usuarios = new ArrayList<Usuario>();
	}

	public String salvar() {

		FacesContext facesContext = FacesContext.getCurrentInstance();

		if (usuario.getUsuario_id() == null || usuario.getUsuario_id() == 0) {
			Facade facade = new Facade();
			facade.salvarUsuario(usuario);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, usuario.toString(), "SALVO COM SUCESSO"));

			if (tela1 == null || tela1.equals("")) {

				tela1 = "CONSULTAR_USUARIO.xhtml";
			}

			return tela1;

		} else {
			Facade facade = new Facade();
			facade.editarUsuario(usuario);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Usuario alterado com sucesso: " + usuario, ""));

		}
		return "usuario";

	}

	public String editar(Usuario usuario) {
		this.usuario = usuario;

		return "CADASTRAR_USUARIO.xhtml";
	}

	public void excluir(Usuario usuario) {
		Facade facade = new Facade();
		facade.excluirUsuario(usuario.getUsuario_id());

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, usuario.toString(), "EXCLUIDA COM SUCESSO"));

	}

	public String GravarSessaoRedirecionarUsuario() throws IOException {

		tela1 = "CADASTRAR_ATIVIDADES.xhtml";

		return "CADASTRAR_USUARIO.xhtml";
	}
	
	public String getTela() {
		return tela1;
	}

	public void setTela(String tela) {
		this.tela1 = tela;
	}

	public List<Usuario> getUsuarios() {
		this.usuarios = new ArrayList<Usuario>();
		Facade facade = new Facade();
		this.usuarios = facade.listarUsuario();
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuario = usuarios;
	}

	public String novo(Usuario usuario) {

		return "CADASTRAR_USUARIO.xhtml";
	}

	public String voltar(Usuario usuario) {

		return "PAGINA_PRINCIPAL.xhtml";
	}

}
